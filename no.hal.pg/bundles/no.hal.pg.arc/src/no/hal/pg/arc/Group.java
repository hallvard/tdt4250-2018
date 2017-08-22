/**
 */
package no.hal.pg.arc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.Group#getMembers <em>Members</em>}</li>
 *   <li>{@link no.hal.pg.arc.Group#getParent <em>Parent</em>}</li>
 *   <li>{@link no.hal.pg.arc.Group#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.arc.ArcPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Actor {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Person}.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.arc.Person#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see no.hal.pg.arc.ArcPackage#getGroup_Members()
	 * @see no.hal.pg.arc.Person#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<Person> getMembers();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.arc.Group#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Group)
	 * @see no.hal.pg.arc.ArcPackage#getGroup_Parent()
	 * @see no.hal.pg.arc.Group#getGroups
	 * @model opposite="groups" transient="false"
	 * @generated
	 */
	Group getParent();

	/**
	 * Sets the value of the '{@link no.hal.pg.arc.Group#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Group value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Group}.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.arc.Group#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see no.hal.pg.arc.ArcPackage#getGroup_Groups()
	 * @see no.hal.pg.arc.Group#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

} // Group
