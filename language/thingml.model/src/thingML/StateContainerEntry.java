/**
 */
package thingML;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.StateContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Container Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.StateContainerEntry#getStateContainer <em>State Container</em>}</li>
 *   <li>{@link thingML.StateContainerEntry#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getStateContainerEntry()
 * @model
 * @generated
 */
public interface StateContainerEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>State Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Container</em>' reference.
	 * @see #setStateContainer(StateContainer)
	 * @see thingML.ThingMLPackage#getStateContainerEntry_StateContainer()
	 * @model required="true"
	 * @generated
	 */
	StateContainer getStateContainer();

	/**
	 * Sets the value of the '{@link thingML.StateContainerEntry#getStateContainer <em>State Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Container</em>' reference.
	 * @see #getStateContainer()
	 * @generated
	 */
	void setStateContainer(StateContainer value);

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
	 * @see thingML.ThingMLPackage#getStateContainerEntry_CurrentState()
	 * @model required="true"
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link thingML.StateContainerEntry#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

} // StateContainerEntry
