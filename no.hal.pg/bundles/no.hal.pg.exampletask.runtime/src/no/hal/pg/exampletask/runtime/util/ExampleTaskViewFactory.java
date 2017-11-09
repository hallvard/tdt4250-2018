package no.hal.pg.exampletask.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.View;

import no.hal.pg.app.util.IViewFactory;
import no.hal.pg.exampletask.runtime.ExampleTask;
import no.hal.pg.exampletask.runtime.RuntimeFactory;

@Component
public class ExampleTaskViewFactory implements IViewFactory {

	@Override
	public View<?> createView(EObject user, EObject eObject) {
		if (eObject instanceof ExampleTask) {
			return RuntimeFactory.eINSTANCE.createExampleTaskView();
		}
		return null;
	}
}
