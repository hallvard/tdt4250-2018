/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Runtime#getGames <em>Games</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getRuntime()
 * @model
 * @generated
 */
public interface Runtime extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Game}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Games</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getRuntime_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<Game> getGames();

} // Runtime
