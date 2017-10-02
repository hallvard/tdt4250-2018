package no.hal.pg.runtime.http;

import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.AppPackage;
import no.hal.pg.http.AppConfig;

@Component
public class GameViewHttpConfig implements AppConfig {

	@Override
	public String getMainLocation() {
		return "/game/GameView.html";
	}

	@Override
	public String getEPackageUri() {
		return AppPackage.eNS_URI;
	}

	@Override
	public String getEClassName() {
		return AppPackage.eINSTANCE.getGameView().getName();
	}
}
