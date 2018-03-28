/**
 */
package thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.DynamicInstance#getDynamicProperties <em>Dynamic Properties</em>}</li>
 *   <li>{@link thingML.DynamicInstance#getDynamicCompositeStates <em>Dynamic Composite States</em>}</li>
 *   <li>{@link thingML.DynamicInstance#getExecutionFrame <em>Execution Frame</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getDynamicInstance()
 * @model
 * @generated
 */
public interface DynamicInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Dynamic Properties</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.DynamicProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Properties</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getDynamicInstance_DynamicProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicProperty> getDynamicProperties();

	/**
	 * Returns the value of the '<em><b>Dynamic Composite States</b></em>' containment reference list.
	 * The list contents are of type {@link thingML.DynamicCompositeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Composite States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Composite States</em>' containment reference list.
	 * @see thingML.ThingMLPackage#getDynamicInstance_DynamicCompositeStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicCompositeState> getDynamicCompositeStates();

	/**
	 * Returns the value of the '<em><b>Execution Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Frame</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Frame</em>' containment reference.
	 * @see #setExecutionFrame(Frame)
	 * @see thingML.ThingMLPackage#getDynamicInstance_ExecutionFrame()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Frame getExecutionFrame();

	/**
	 * Sets the value of the '{@link thingML.DynamicInstance#getExecutionFrame <em>Execution Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Frame</em>' containment reference.
	 * @see #getExecutionFrame()
	 * @generated
	 */
	void setExecutionFrame(Frame value);

} // DynamicInstance
