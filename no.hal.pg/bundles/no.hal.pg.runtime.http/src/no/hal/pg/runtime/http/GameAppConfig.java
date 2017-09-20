package no.hal.pg.runtime.http;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import no.hal.pg.http.AppConfig;
import no.hal.pg.runtime.RuntimePackage;

@Component(
		service={GameAppConfig.class, AppConfig.class},
		property={
			HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/game",
			HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/game/*"
		}
	)
public class GameAppConfig implements AppConfig {

	@Override
	public String getMainLocation() {
		return "/game/GameApp.html";
	}

	@Override
	public String getEPackageUri() {
		return RuntimePackage.eNS_URI;
	}

	@Override
	public String getEClassName() {
		return RuntimePackage.eINSTANCE.getGame().getName();
	}
}
