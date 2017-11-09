package no.hal.pg.runtime.http;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import no.hal.pg.http.AppConfig;
import no.hal.pg.runtime.RuntimePackage;

@Component(
		service={GameHttpConfig.class, AppConfig.class},
		property={
			HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PREFIX + ":String=/web/game",
			HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN + ":String=/game/*"
		}
	)
public class GameHttpConfig implements AppConfig {

	@Override
	public String getMainLocation() {
		return "/game/Game.html";
	}

	@Override
	public EClass getEClass() {
		return RuntimePackage.eINSTANCE.getGame();
	}
}
