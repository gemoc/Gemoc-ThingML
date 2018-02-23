/**
 */
package org.thingml.xthingmlmt.thingML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingmlmt.thingML.CompositeState#getRegion <em>Region</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.CompositeState#getSession <em>Session</em>}</li>
 *   <li>{@link org.thingml.xthingmlmt.thingML.CompositeState#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State, StateContainer {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getCompositeState_Region()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Session</b></em>' containment reference list.
	 * The list contents are of type {@link org.thingml.xthingmlmt.thingML.Session}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' containment reference list.
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getCompositeState_Session()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getSession();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see org.thingml.xthingmlmt.thingML.ThingMLPackage#getCompositeState_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.thingml.xthingmlmt.thingML.CompositeState#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // CompositeState
