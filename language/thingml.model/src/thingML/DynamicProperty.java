/**
 */
package thingML;

import org.thingml.xtext.thingML.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thingML.DynamicProperty#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see thingML.ThingMLPackage#getDynamicProperty()
 * @model
 * @generated
 */
public interface DynamicProperty extends ValueContainer {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see thingML.ThingMLPackage#getDynamicProperty_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link thingML.DynamicProperty#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // DynamicProperty
