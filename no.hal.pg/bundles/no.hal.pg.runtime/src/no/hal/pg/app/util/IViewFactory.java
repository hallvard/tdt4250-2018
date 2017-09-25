package no.hal.pg.app.util;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.app.View;

public interface IViewFactory {
	
	/**
	 * Creates a view (specific) for user of eObject.
	 * @param user the EObject representing the user
	 * @param eObject the EObject for which the user needs a view
	 * @return the view
	 */
	public View<?> createView(EObject user, EObject eObject);
}
