package no.hal.pg.config.actions;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfforms.spi.editor.IToolbarAction;

public abstract class ConfigToolbarAction implements IToolbarAction {

	@Override
	public boolean canExecute(Object object) {
		if (object instanceof ResourceSet) {
			for (Resource resource : ((ResourceSet) object).getResources()) {
				if (canExecute(resource)) {
					return true;
				}
			}
		} else if (object instanceof Resource) {
			if (canExecute((Resource) object)) {
				return true;
			}			
		}
		return false;
	}

	protected boolean canExecute(Resource resource) {
		return "config".equals(resource.getURI().fileExtension());
	}
}
