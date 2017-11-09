package no.hal.pg.config.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.GameConfig;

public abstract class ConfigAction extends Action implements ISelectionChangedListener {

	protected final ISelectionProvider selectionProvider;
	
	protected ConfigAction(ISelectionProvider selectionProvider) {
		this.selectionProvider = selectionProvider;
		updateEnabled();
		// not supported!
//		selectionProvider.addSelectionChangedListener(this);
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		updateEnabled();
	}

	protected void updateEnabled() {
//		ISelection selection = selectionProvider.getSelection();
//		setEnabled(selection instanceof IStructuredSelection && getGameConfig(((IStructuredSelection) selection).getFirstElement()) != null);
		setEnabled(true);
	}

	protected GameConfig getGameConfig(Object object) {
		if (object instanceof ResourceSet) {
			for (Resource resource : ((ResourceSet) object).getResources()) {
				GameConfig gameConfig = getGameConfig(resource);
				if (gameConfig != null) {
					return gameConfig;
				}
			}
		} else if (object instanceof Resource) {
			Resource resource = (Resource) object;
			return (GameConfig) EcoreUtil.getObjectByType(resource.getContents(), ConfigPackage.eINSTANCE.getGameConfig());
		} else if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			while (eObject != null) {
				if (eObject instanceof GameConfig) {
					return (GameConfig) object;					
				}
				eObject = eObject.eContainer();
			}
		}
		return null;
	}
	
	@Override
	public void run() {
		GameConfig gameConfig = getGameConfig(((IStructuredSelection) selectionProvider.getSelection()).getFirstElement());
		run(gameConfig);
	}

	protected abstract void run(GameConfig gameConfig);
}