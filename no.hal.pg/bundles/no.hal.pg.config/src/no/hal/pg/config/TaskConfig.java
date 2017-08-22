/**
 */
package no.hal.pg.config;

import no.hal.pg.runtime.Task;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Def</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.config.ConfigPackage#getTaskConfig()
 * @model
 * @generated
 */
public interface TaskConfig<T extends Task<R>, R> extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task<R> createTask();
} // TaskDef
