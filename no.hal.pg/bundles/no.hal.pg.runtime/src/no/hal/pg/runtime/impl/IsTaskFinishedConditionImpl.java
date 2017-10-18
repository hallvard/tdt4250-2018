/**
 */
package no.hal.pg.runtime.impl;

import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Task Finished</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IsTaskFinishedConditionImpl extends AbstractConditionImpl<Task<?>> implements IsTaskFinishedCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsTaskFinishedConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.IS_TASK_FINISHED_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setContext(Task<?> newContext) {
		super.setContext(newContext);
	}
	
	//
	
	@Override
	public boolean test() {
		return context.isFinished();
	}

} //IsTaskFinishedImpl
