/**
 */
package no.hal.pg.runtime;

import no.hal.pg.arc.Arc;
import org.eclipse.emf.common.util.EList;

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
public interface Runtime extends Arc {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Game}<code>&lt;?&gt;</code>.
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
	EList<Game<?>> getGames();

} // Runtime
