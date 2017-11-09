/**
 */
package no.hal.pg.config;

import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Config</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.config.ConfigPackage#getTaskConfig()
 * @model abstract="true"
 * @generated
 */
public interface TaskConfig<T extends Task<?>> extends AbstractConfig<T> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T createTask(TaskProxy proxy);
} // TaskConfig
