package no.hal.pg.runtime.http;

import org.osgi.service.component.annotations.Component;

import no.hal.pg.app.AppPackage;
import no.hal.pg.http.AppConfig;

@Component
public class AcceptTaskViewHttpConfig implements AppConfig {

	@Override
	public String getMainLocation() {
		return "/accept-task/AcceptTaskView.html";
	}

	@Override
	public String getEPackageUri() {
		return AppPackage.eNS_URI;
	}

	@Override
	public String getEClassName() {
		return AppPackage.eINSTANCE.getAcceptTaskView().getName();
	}
}
