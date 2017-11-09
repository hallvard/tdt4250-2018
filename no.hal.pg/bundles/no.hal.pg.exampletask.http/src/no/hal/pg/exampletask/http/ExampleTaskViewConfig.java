package no.hal.pg.exampletask.http;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import no.hal.pg.exampletask.runtime.RuntimePackage;
import no.hal.pg.http.AppConfig;

@Component(
		service={ExampleTaskViewConfig.class, AppConfig.class},
		property={
			HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/example-task",
			HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/example-task/*"
		}
	)
public class ExampleTaskViewConfig implements AppConfig {

	@Override
	public String getMainLocation() {
		return "/example-task/ExampleTaskView.html";
	}

	@Override
	public EClass getEClass() {
		return RuntimePackage.eINSTANCE.getExampleTaskView();
	}
}
