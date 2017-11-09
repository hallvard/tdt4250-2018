package no.hal.pg.config.diagram;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {

	public boolean canDrop(EObject self, String arg) {
		System.out.println(self);
		return true;
	}
}
