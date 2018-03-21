/**
 */
package org.thingml.xthingmlmt.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.State#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.State#getExit <em>Exit</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.State#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getState_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Action)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getState_Entry()
	 * @model containment="true"
	 * @generated
	 */
	Action getEntry();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Action value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Action)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getState_Exit()
	 * @model containment="true"
	 * @generated
	 */
	Action getExit();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Action value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.InternalTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' containment reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getState_Internal()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalTransition> getInternal();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getState_Outgoing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	State run();

} // State
