/**
 */
package thingML;

import org.eclipse.emf.ecore.EObject;

import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.DynamicCompositeState#getCompositeState <em>Composite State</em>}</li>
 *   <li>{@link thingML.DynamicCompositeState#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getDynamicCompositeState()
 * @model
 * @generated
 */
public interface DynamicCompositeState extends EObject {
	/**
	 * Returns the value of the '<em><b>Composite State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite State</em>' reference.
	 * @see #setCompositeState(CompositeState)
	 * @see thingML.ThingMLPackage#getDynamicCompositeState_CompositeState()
	 * @model required="true"
	 * @generated
	 */
	CompositeState getCompositeState();

	/**
	 * Sets the value of the '{@link thingML.DynamicCompositeState#getCompositeState <em>Composite State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite State</em>' reference.
	 * @see #getCompositeState()
	 * @generated
	 */
	void setCompositeState(CompositeState value);

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
	 * @see thingML.ThingMLPackage#getDynamicCompositeState_CurrentState()
	 * @model required="true"
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link thingML.DynamicCompositeState#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

} // DynamicCompositeState
