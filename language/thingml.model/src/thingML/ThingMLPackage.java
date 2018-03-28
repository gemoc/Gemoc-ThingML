/**
 */
package thingML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see thingML.ThingMLFactory
 * @model kind="package"
 * @generated
 */
public interface ThingMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thingML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "xthingml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thingML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThingMLPackage eINSTANCE = thingML.impl.ThingMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link thingML.impl.DynamicInstanceImpl <em>Dynamic Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.DynamicInstanceImpl
	 * @see thingML.impl.ThingMLPackageImpl#getDynamicInstance()
	 * @generated
	 */
	int DYNAMIC_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Dynamic Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Dynamic Composite States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES = 1;

	/**
	 * The feature id for the '<em><b>Execution Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__EXECUTION_FRAME = 2;

	/**
	 * The number of structural features of the '<em>Dynamic Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dynamic Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.DynamicPropertyImpl <em>Dynamic Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.DynamicPropertyImpl
	 * @see thingML.impl.ThingMLPackageImpl#getDynamicProperty()
	 * @generated
	 */
	int DYNAMIC_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PROPERTY__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.NullValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.IntegerValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.StringValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ArrayValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ProxyValueImpl <em>Proxy Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ProxyValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getProxyValue()
	 * @generated
	 */
	int PROXY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_VALUE__EXPRESSION = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proxy Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Proxy Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ArrayProxyValueImpl <em>Array Proxy Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ArrayProxyValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getArrayProxyValue()
	 * @generated
	 */
	int ARRAY_PROXY_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_VALUE__EXPRESSION = PROXY_VALUE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Array Proxy Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES = PROXY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Proxy Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_VALUE_FEATURE_COUNT = PROXY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Proxy Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_VALUE_OPERATION_COUNT = PROXY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ArrayProxyEntryImpl <em>Array Proxy Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ArrayProxyEntryImpl
	 * @see thingML.impl.ThingMLPackageImpl#getArrayProxyEntry()
	 * @generated
	 */
	int ARRAY_PROXY_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Index Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_ENTRY__INDEX_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Array Proxy Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array Proxy Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.DynamicCompositeStateImpl <em>Dynamic Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.DynamicCompositeStateImpl
	 * @see thingML.impl.ThingMLPackageImpl#getDynamicCompositeState()
	 * @generated
	 */
	int DYNAMIC_COMPOSITE_STATE = 10;

	/**
	 * The feature id for the '<em><b>Composite State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPOSITE_STATE__CURRENT_STATE = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPOSITE_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_COMPOSITE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.FrameImpl
	 * @see thingML.impl.ThingMLPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 11;

	/**
	 * The feature id for the '<em><b>Child Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CHILD_FRAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Frame</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT_FRAME = 1;

	/**
	 * The feature id for the '<em><b>Root Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ROOT_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Dynamic Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__DYNAMIC_INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ContextImpl
	 * @see thingML.impl.ThingMLPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Child Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CHILD_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARENT_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Dynamic Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DYNAMIC_VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.DynamicVariableImpl <em>Dynamic Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.DynamicVariableImpl
	 * @see thingML.impl.ThingMLPackageImpl#getDynamicVariable()
	 * @generated
	 */
	int DYNAMIC_VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_VARIABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link thingML.DynamicInstance <em>Dynamic Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Instance</em>'.
	 * @see thingML.DynamicInstance
	 * @generated
	 */
	EClass getDynamicInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.DynamicInstance#getDynamicProperties <em>Dynamic Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Properties</em>'.
	 * @see thingML.DynamicInstance#getDynamicProperties()
	 * @see #getDynamicInstance()
	 * @generated
	 */
	EReference getDynamicInstance_DynamicProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.DynamicInstance#getDynamicCompositeStates <em>Dynamic Composite States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Composite States</em>'.
	 * @see thingML.DynamicInstance#getDynamicCompositeStates()
	 * @see #getDynamicInstance()
	 * @generated
	 */
	EReference getDynamicInstance_DynamicCompositeStates();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.DynamicInstance#getExecutionFrame <em>Execution Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Frame</em>'.
	 * @see thingML.DynamicInstance#getExecutionFrame()
	 * @see #getDynamicInstance()
	 * @generated
	 */
	EReference getDynamicInstance_ExecutionFrame();

	/**
	 * Returns the meta object for class '{@link thingML.DynamicProperty <em>Dynamic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Property</em>'.
	 * @see thingML.DynamicProperty
	 * @generated
	 */
	EClass getDynamicProperty();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see thingML.DynamicProperty#getProperty()
	 * @see #getDynamicProperty()
	 * @generated
	 */
	EReference getDynamicProperty_Property();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.DynamicProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see thingML.DynamicProperty#getValue()
	 * @see #getDynamicProperty()
	 * @generated
	 */
	EReference getDynamicProperty_Value();

	/**
	 * Returns the meta object for class '{@link thingML.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see thingML.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link thingML.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value</em>'.
	 * @see thingML.NullValue
	 * @generated
	 */
	EClass getNullValue();

	/**
	 * Returns the meta object for class '{@link thingML.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see thingML.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link thingML.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see thingML.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link thingML.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see thingML.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link thingML.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see thingML.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link thingML.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see thingML.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.ArrayValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see thingML.ArrayValue#getValues()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Values();

	/**
	 * Returns the meta object for class '{@link thingML.ProxyValue <em>Proxy Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Value</em>'.
	 * @see thingML.ProxyValue
	 * @generated
	 */
	EClass getProxyValue();

	/**
	 * Returns the meta object for the reference '{@link thingML.ProxyValue#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see thingML.ProxyValue#getExpression()
	 * @see #getProxyValue()
	 * @generated
	 */
	EReference getProxyValue_Expression();

	/**
	 * Returns the meta object for class '{@link thingML.ArrayProxyValue <em>Array Proxy Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Proxy Value</em>'.
	 * @see thingML.ArrayProxyValue
	 * @generated
	 */
	EClass getArrayProxyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.ArrayProxyValue#getArrayProxyEntries <em>Array Proxy Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Proxy Entries</em>'.
	 * @see thingML.ArrayProxyValue#getArrayProxyEntries()
	 * @see #getArrayProxyValue()
	 * @generated
	 */
	EReference getArrayProxyValue_ArrayProxyEntries();

	/**
	 * Returns the meta object for class '{@link thingML.ArrayProxyEntry <em>Array Proxy Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Proxy Entry</em>'.
	 * @see thingML.ArrayProxyEntry
	 * @generated
	 */
	EClass getArrayProxyEntry();

	/**
	 * Returns the meta object for the reference '{@link thingML.ArrayProxyEntry#getIndexExpression <em>Index Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Expression</em>'.
	 * @see thingML.ArrayProxyEntry#getIndexExpression()
	 * @see #getArrayProxyEntry()
	 * @generated
	 */
	EReference getArrayProxyEntry_IndexExpression();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.ArrayProxyEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see thingML.ArrayProxyEntry#getValue()
	 * @see #getArrayProxyEntry()
	 * @generated
	 */
	EReference getArrayProxyEntry_Value();

	/**
	 * Returns the meta object for class '{@link thingML.DynamicCompositeState <em>Dynamic Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Composite State</em>'.
	 * @see thingML.DynamicCompositeState
	 * @generated
	 */
	EClass getDynamicCompositeState();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicCompositeState#getCompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite State</em>'.
	 * @see thingML.DynamicCompositeState#getCompositeState()
	 * @see #getDynamicCompositeState()
	 * @generated
	 */
	EReference getDynamicCompositeState_CompositeState();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicCompositeState#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see thingML.DynamicCompositeState#getCurrentState()
	 * @see #getDynamicCompositeState()
	 * @generated
	 */
	EReference getDynamicCompositeState_CurrentState();

	/**
	 * Returns the meta object for class '{@link thingML.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see thingML.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.Frame#getChildFrame <em>Child Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Frame</em>'.
	 * @see thingML.Frame#getChildFrame()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_ChildFrame();

	/**
	 * Returns the meta object for the container reference '{@link thingML.Frame#getParentFrame <em>Parent Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Frame</em>'.
	 * @see thingML.Frame#getParentFrame()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_ParentFrame();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.Frame#getRootContext <em>Root Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Context</em>'.
	 * @see thingML.Frame#getRootContext()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_RootContext();

	/**
	 * Returns the meta object for the reference '{@link thingML.Frame#getDynamicInstance <em>Dynamic Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Instance</em>'.
	 * @see thingML.Frame#getDynamicInstance()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_DynamicInstance();

	/**
	 * Returns the meta object for class '{@link thingML.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see thingML.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.Context#getChildContext <em>Child Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Context</em>'.
	 * @see thingML.Context#getChildContext()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ChildContext();

	/**
	 * Returns the meta object for the container reference '{@link thingML.Context#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Context</em>'.
	 * @see thingML.Context#getParentContext()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ParentContext();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.Context#getDynamicVariables <em>Dynamic Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Variables</em>'.
	 * @see thingML.Context#getDynamicVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_DynamicVariables();

	/**
	 * Returns the meta object for class '{@link thingML.DynamicVariable <em>Dynamic Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Variable</em>'.
	 * @see thingML.DynamicVariable
	 * @generated
	 */
	EClass getDynamicVariable();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see thingML.DynamicVariable#getVariable()
	 * @see #getDynamicVariable()
	 * @generated
	 */
	EReference getDynamicVariable_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.DynamicVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see thingML.DynamicVariable#getValue()
	 * @see #getDynamicVariable()
	 * @generated
	 */
	EReference getDynamicVariable_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThingMLFactory getThingMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link thingML.impl.DynamicInstanceImpl <em>Dynamic Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.DynamicInstanceImpl
		 * @see thingML.impl.ThingMLPackageImpl#getDynamicInstance()
		 * @generated
		 */
		EClass DYNAMIC_INSTANCE = eINSTANCE.getDynamicInstance();

		/**
		 * The meta object literal for the '<em><b>Dynamic Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES = eINSTANCE.getDynamicInstance_DynamicProperties();

		/**
		 * The meta object literal for the '<em><b>Dynamic Composite States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES = eINSTANCE.getDynamicInstance_DynamicCompositeStates();

		/**
		 * The meta object literal for the '<em><b>Execution Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__EXECUTION_FRAME = eINSTANCE.getDynamicInstance_ExecutionFrame();

		/**
		 * The meta object literal for the '{@link thingML.impl.DynamicPropertyImpl <em>Dynamic Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.DynamicPropertyImpl
		 * @see thingML.impl.ThingMLPackageImpl#getDynamicProperty()
		 * @generated
		 */
		EClass DYNAMIC_PROPERTY = eINSTANCE.getDynamicProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PROPERTY__PROPERTY = eINSTANCE.getDynamicProperty_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PROPERTY__VALUE = eINSTANCE.getDynamicProperty_Value();

		/**
		 * The meta object literal for the '{@link thingML.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.ValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link thingML.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.NullValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

		/**
		 * The meta object literal for the '{@link thingML.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.IntegerValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link thingML.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.StringValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link thingML.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.ArrayValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__VALUES = eINSTANCE.getArrayValue_Values();

		/**
		 * The meta object literal for the '{@link thingML.impl.ProxyValueImpl <em>Proxy Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.ProxyValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getProxyValue()
		 * @generated
		 */
		EClass PROXY_VALUE = eINSTANCE.getProxyValue();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_VALUE__EXPRESSION = eINSTANCE.getProxyValue_Expression();

		/**
		 * The meta object literal for the '{@link thingML.impl.ArrayProxyValueImpl <em>Array Proxy Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.ArrayProxyValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getArrayProxyValue()
		 * @generated
		 */
		EClass ARRAY_PROXY_VALUE = eINSTANCE.getArrayProxyValue();

		/**
		 * The meta object literal for the '<em><b>Array Proxy Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_PROXY_VALUE__ARRAY_PROXY_ENTRIES = eINSTANCE.getArrayProxyValue_ArrayProxyEntries();

		/**
		 * The meta object literal for the '{@link thingML.impl.ArrayProxyEntryImpl <em>Array Proxy Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.ArrayProxyEntryImpl
		 * @see thingML.impl.ThingMLPackageImpl#getArrayProxyEntry()
		 * @generated
		 */
		EClass ARRAY_PROXY_ENTRY = eINSTANCE.getArrayProxyEntry();

		/**
		 * The meta object literal for the '<em><b>Index Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_PROXY_ENTRY__INDEX_EXPRESSION = eINSTANCE.getArrayProxyEntry_IndexExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_PROXY_ENTRY__VALUE = eINSTANCE.getArrayProxyEntry_Value();

		/**
		 * The meta object literal for the '{@link thingML.impl.DynamicCompositeStateImpl <em>Dynamic Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.DynamicCompositeStateImpl
		 * @see thingML.impl.ThingMLPackageImpl#getDynamicCompositeState()
		 * @generated
		 */
		EClass DYNAMIC_COMPOSITE_STATE = eINSTANCE.getDynamicCompositeState();

		/**
		 * The meta object literal for the '<em><b>Composite State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_COMPOSITE_STATE__COMPOSITE_STATE = eINSTANCE.getDynamicCompositeState_CompositeState();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_COMPOSITE_STATE__CURRENT_STATE = eINSTANCE.getDynamicCompositeState_CurrentState();

		/**
		 * The meta object literal for the '{@link thingML.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.FrameImpl
		 * @see thingML.impl.ThingMLPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Child Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__CHILD_FRAME = eINSTANCE.getFrame_ChildFrame();

		/**
		 * The meta object literal for the '<em><b>Parent Frame</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__PARENT_FRAME = eINSTANCE.getFrame_ParentFrame();

		/**
		 * The meta object literal for the '<em><b>Root Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__ROOT_CONTEXT = eINSTANCE.getFrame_RootContext();

		/**
		 * The meta object literal for the '<em><b>Dynamic Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__DYNAMIC_INSTANCE = eINSTANCE.getFrame_DynamicInstance();

		/**
		 * The meta object literal for the '{@link thingML.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.ContextImpl
		 * @see thingML.impl.ThingMLPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Child Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CHILD_CONTEXT = eINSTANCE.getContext_ChildContext();

		/**
		 * The meta object literal for the '<em><b>Parent Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARENT_CONTEXT = eINSTANCE.getContext_ParentContext();

		/**
		 * The meta object literal for the '<em><b>Dynamic Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__DYNAMIC_VARIABLES = eINSTANCE.getContext_DynamicVariables();

		/**
		 * The meta object literal for the '{@link thingML.impl.DynamicVariableImpl <em>Dynamic Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.DynamicVariableImpl
		 * @see thingML.impl.ThingMLPackageImpl#getDynamicVariable()
		 * @generated
		 */
		EClass DYNAMIC_VARIABLE = eINSTANCE.getDynamicVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_VARIABLE__VARIABLE = eINSTANCE.getDynamicVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_VARIABLE__VALUE = eINSTANCE.getDynamicVariable_Value();

	}

} //ThingMLPackage
