/**
 */
package thingML;

import org.thingml.xtext.thingML.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.DynamicVariable#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getDynamicVariable()
 * @model
 * @generated
 */
public interface DynamicVariable extends ValueContainer {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see thingML.ThingMLPackage#getDynamicVariable_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link thingML.DynamicVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // DynamicVariable
