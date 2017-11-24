package no.hal.pg.app.util;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.AppFactory;
import no.hal.pg.app.View;
import no.hal.pg.runtime.impl.GameImpl;
import no.hal.pg.runtime.impl.ItemImpl;
import no.hal.pg.runtime.impl.TaskImpl;

@Component
public class DefaultViewFactory implements IViewFactory {

	@Override
	public View<?> createView(EObject user, EObject eObject) {
		if (eObject.getClass() == GameImpl.class) {
			return AppFactory.eINSTANCE.createGameView();
		} else if (eObject.getClass() == TaskImpl.class) {
			return AppFactory.eINSTANCE.createTaskView();
		} else if (eObject.getClass() == ItemImpl.class) {
			return AppFactory.eINSTANCE.createItemView();
		}
		return null;
	}
}
