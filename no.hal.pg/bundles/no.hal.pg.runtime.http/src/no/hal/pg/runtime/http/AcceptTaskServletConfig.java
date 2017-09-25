package no.hal.pg.runtime.http;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import no.hal.pg.http.AppConfig;
import no.hal.pg.runtime.RuntimePackage;

@Component(
		service={AcceptTaskServletConfig.class, AppConfig.class},
		property={
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/accept-task",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/accept-task/*"
		}
	)
public class AcceptTaskServletConfig implements AppConfig {

	@Override
	public String getMainLocation() {
		return "/accept-task/AcceptTaskApp.html";
	}

	@Override
	public String getEPackageUri() {
		return RuntimePackage.eNS_URI;
	}

	@Override
	public String getEClassName() {
		return RuntimePackage.eINSTANCE.getAcceptTask().getName();
	}
}
