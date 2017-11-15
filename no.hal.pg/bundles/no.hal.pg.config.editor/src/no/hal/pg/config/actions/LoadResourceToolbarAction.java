package no.hal.pg.config.actions;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfforms.spi.editor.IToolbarAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelectionProvider;

public class LoadResourceToolbarAction implements IToolbarAction {
	
	@Override
	public boolean canExecute(Object object) {
		return true;
	}

	@Override
	public Action getAction(Object currentObject, ISelectionProvider selectionProvider) {
		return new LoadResourceAction((ResourceSet) currentObject);
	}
}
