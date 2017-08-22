/**
 */
package no.hal.pg.config;

import no.hal.pg.arc.Group;
import no.hal.pg.runtime.Game;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.GameConfig#getTasks <em>Tasks</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getTaskRefs <em>Task Refs</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getAllTasks <em>All Tasks</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.config.ConfigPackage#getGameConfig()
 * @model
 * @generated
 */
public interface GameConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.TaskConfig}<code>&lt;?, ?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskConfig<?, ?>> getTasks();

	/**
	 * Returns the value of the '<em><b>Task Refs</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.config.TaskConfig}<code>&lt;?, ?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Refs</em>' reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_TaskRefs()
	 * @model
	 * @generated
	 */
	EList<TaskConfig<?, ?>> getTaskRefs();

	/**
	 * Returns the value of the '<em><b>All Tasks</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.config.TaskConfig}<code>&lt;?, ?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tasks</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tasks</em>' reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_AllTasks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<TaskConfig<?, ?>> getAllTasks();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_Participants()
	 * @model
	 * @generated
	 */
	EList<Group> getParticipants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Game createGame();

} // GameDef
