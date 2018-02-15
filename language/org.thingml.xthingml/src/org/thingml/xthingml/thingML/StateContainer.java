/**
 */
package org.thingml.xthingml.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.StateContainer#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.StateContainer#isHistory <em>History</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.StateContainer#getSubstate <em>Substate</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingml.thingML.ThingMLPackage#getStateContainer()
 * @model
 * @generated
 */
public interface StateContainer extends NamedElement, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getStateContainer_Initial()
	 * @model
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.StateContainer#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute.
	 * @see #setHistory(boolean)
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getStateContainer_History()
	 * @model
	 * @generated
	 */
	boolean isHistory();

	/**
	 * Sets the value of the '{@link org.thingml.xthingml.thingML.StateContainer#isHistory <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' attribute.
	 * @see #isHistory()
	 * @generated
	 */
	void setHistory(boolean value);

	/**
	 * Returns the value of the '<em><b>Substate</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingml.thingML.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substate</em>' containment reference list.
	 * @see org.thingml.xthingml.thingML.ThingMLPackage#getStateContainer_Substate()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getSubstate();

} // StateContainer
