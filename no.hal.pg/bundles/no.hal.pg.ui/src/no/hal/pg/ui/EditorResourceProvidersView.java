package no.hal.pg.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

import no.hal.pg.http.IResourceProvider;
import no.hal.pg.http.util.ResourceProvider;

public class EditorResourceProvidersView extends AbstractSelectionView {

	private Map<IEditingDomainProvider, String> resources = new HashMap<>();
	private Map<String, ResourceProvider> resourceProviders = new HashMap<>();
	private Map<ResourceProvider, ServiceRegistration<IResourceProvider>> resourceRegistrations = new HashMap<>();

	protected Resource getResource(IEditingDomainProvider element) {
		return element.getEditingDomain().getResourceSet().getResources().get(0);
	}

	private CheckboxTreeViewer viewer;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		this.viewer = new CheckboxTreeViewer(parent);
		this.viewer.getTree().setHeaderVisible(true);
		this.viewer.setContentProvider(new ITreeContentProvider() {
			@Override
			public Object[] getElements(Object inputElement) {
				return ((Map<IEditingDomainProvider, ?>) inputElement).keySet().toArray();
			}
			@Override
			public boolean hasChildren(Object element) {
				return false;
			}
			@Override
			public Object getParent(Object element) {
				return null;
			}
			@Override
			public Object[] getChildren(Object parentElement) {
				return null;
			}
		});
		TreeViewerColumn nameColumn = new TreeViewerColumn(viewer, SWT.NONE);
		nameColumn.getColumn().setText("Name (alias)");
		nameColumn.getColumn().setWidth(150);
		nameColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				cell.setText(resources.get(cell.getElement()));
			}
		});
		nameColumn.setEditingSupport(new EditingSupport(viewer) {
			@Override
			protected void setValue(Object element, Object value) {
				String s = String.valueOf(value);
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) element;
				changeResourceName(editingDomainProvider, s.length() > 0 ? s : null);
			}
			@Override
			protected Object getValue(Object element) {
				return resources.get(element);
			}
			
			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor((Composite) viewer.getControl());
			}

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});
		
		TreeViewerColumn uriColumn = new TreeViewerColumn(viewer, SWT.NONE);
		uriColumn.getColumn().setText("URI");
		uriColumn.getColumn().setWidth(800);
		uriColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) cell.getElement();
				cell.setText(getResource(editingDomainProvider).getURI().toString());
			}
		});
		this.viewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}
			@Override
			public boolean isChecked(Object element) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) element;
				return hasResourceProvider(editingDomainProvider);
			}
		});
		this.viewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					addResourceProvider((IEditingDomainProvider) event.getElement());
				} else {
					removeResourceProvider((IEditingDomainProvider) event.getElement());					
				}
			}
		});
		IEditorPart editor = getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof IEditingDomainProvider) {
			addResource((IEditingDomainProvider) editor);
		}
		this.viewer.setInput(resources);
	}
	
	@Override
	protected void updateView() {
		viewer.refresh();
	}

	protected void updateView(IEditingDomainProvider editingDomainProvider) {
		viewer.update(editingDomainProvider, null);
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		super.partActivated(part);
		if (part instanceof IEditingDomainProvider) {
			addResource((IEditingDomainProvider) part);
		}
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		super.partActivated(part);
		if (part instanceof IEditingDomainProvider) {
			removeResource((IEditingDomainProvider) part);
		}
	}

	protected void addResource(IEditingDomainProvider editingDomainProvider) {
		Resource resource = getResource(editingDomainProvider);
		if (resource != null) {
			resources.put(editingDomainProvider, ResourceProvider.defaultName(resource.getURI()));
		}
	}

	protected void removeResource(IEditingDomainProvider editingDomainProvider) {
		Resource resource = getResource(editingDomainProvider);
		if (resource != null) {
			if (hasResourceProvider(editingDomainProvider)) {
				removeResourceProvider(editingDomainProvider);
			}
			resources.remove(editingDomainProvider);
		}
		updateView(editingDomainProvider);
	}
	
	protected boolean hasResourceProvider(IEditingDomainProvider editingDomainProvider) {
		return resourceProviders.containsKey(resources.get(editingDomainProvider));
	}

	protected void changeResourceName(IEditingDomainProvider editingDomainProvider, String newName) {
		if (hasResourceProvider(editingDomainProvider)) {
			removeResourceProvider(editingDomainProvider);
			resources.put(editingDomainProvider, newName);
			addResourceProvider(editingDomainProvider);					
		} else {
			resources.put(editingDomainProvider, newName);
			updateView(editingDomainProvider);
		}
	}

	protected void addResourceProvider(IEditingDomainProvider editingDomainProvider) {
		Resource resource = getResource(editingDomainProvider);
		if (resource != null) {
			ResourceProvider resourceProvider = new ResourceProvider(resource);
			String name = resources.get(editingDomainProvider);
			resourceProvider.setName(name);
			// register IResourceProvider, so it will be served by the ResourceServlet
			ServiceRegistration<IResourceProvider> serviceRegistration = FrameworkUtil.getBundle(getClass()).getBundleContext().registerService(IResourceProvider.class, resourceProvider, null);
			resourceRegistrations.put(resourceProvider, serviceRegistration);
			String key = name;
			resourceProviders.put(key, resourceProvider);
		}
		updateView(editingDomainProvider);
	}

	protected void removeResourceProvider(IEditingDomainProvider editingDomainProvider) {
		String key = resources.get(editingDomainProvider);
		ResourceProvider resourceProvider = resourceProviders.get(key);
		ServiceRegistration<IResourceProvider> serviceRegistration = resourceRegistrations.get(resourceProvider);
		// unregister IResourceProvider, so it no longer will be servered by the ResourceServlet
		serviceRegistration.unregister();
		resourceProviders.remove(key);
		updateView(editingDomainProvider);
	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
