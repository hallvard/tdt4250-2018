package no.hal.pg.config.actions;

import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;

/**
 * An action to load a resource into a resource set.
 */
public class LoadResourceAction extends Action {

	protected ResourceSet resourceSet;

	public LoadResourceAction(ResourceSet resourceSet) {
		setText("Load resource");
		this.resourceSet = resourceSet;
	}

	public LoadResourceAction() {
		super(EMFEditUIPlugin.INSTANCE.getString("_UI_LoadResource_menu_item"));
		setDescription(EMFEditUIPlugin.INSTANCE.getString("_UI_LoadResource_menu_item_description"));
	}

	@Override
	public void run() {
		if (resourceSet == null || resourceSet.getResources().isEmpty()) {
			return;
		}
		URI uri = resourceSet.getResources().get(0).getURI();
		ResourceDialog loadResourceDialog = new ResourceDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), EMFEditUIPlugin.INSTANCE.getString("_UI_LoadResourceDialog_title"), SWT.OPEN | SWT.MULTI, uri) {

			@Override
			protected boolean processResources() {
				if (resourceSet != null) {
					for (URI uri : getURIs()) {
						try {
							resourceSet.getResource(uri, true);
						} catch (RuntimeException exception) {
							EMFEditUIPlugin.INSTANCE.log(exception);
						}
					}
				}
				return true;
			}
		};
		loadResourceDialog.open();
	}
}
