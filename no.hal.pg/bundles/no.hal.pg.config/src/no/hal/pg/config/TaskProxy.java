/**
 */
package no.hal.pg.config;

import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.TaskProxy#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.config.TaskProxy#getRewardItems <em>Reward Items</em>}</li>
 *   <li>{@link no.hal.pg.config.TaskProxy#getRequiresFinished <em>Requires Finished</em>}</li>
 *   <li>{@link no.hal.pg.config.TaskProxy#getRequiresItems <em>Requires Items</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.config.ConfigPackage#getTaskProxy()
 * @model
 * @generated
 */
public interface TaskProxy extends Proxy<TaskConfig<Task<?>>> {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.config.PlayerRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see no.hal.pg.config.ConfigPackage#getTaskProxy_Players()
	 * @model
	 * @generated
	 */
	EList<PlayerRole> getPlayers();

	/**
	 * Returns the value of the '<em><b>Reward Items</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.ItemProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reward Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward Items</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getTaskProxy_RewardItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemProxy> getRewardItems();

	/**
	 * Returns the value of the '<em><b>Requires Finished</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.config.TaskProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Finished</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Finished</em>' reference list.
	 * @see no.hal.pg.config.ConfigPackage#getTaskProxy_RequiresFinished()
	 * @model
	 * @generated
	 */
	EList<TaskProxy> getRequiresFinished();

	/**
	 * Returns the value of the '<em><b>Requires Items</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.config.ItemProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Items</em>' reference list.
	 * @see no.hal.pg.config.ConfigPackage#getTaskProxy_RequiresItems()
	 * @model
	 * @generated
	 */
	EList<ItemProxy> getRequiresItems();

} // TaskProxy
