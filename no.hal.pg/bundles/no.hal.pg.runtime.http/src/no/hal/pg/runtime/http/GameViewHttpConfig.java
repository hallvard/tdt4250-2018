package no.hal.pg.runtime.http;

import org.eclipse.emf.ecore.EClass;
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
	public EClass getEClass() {
		return AppPackage.eINSTANCE.getGameView();
	}
}
