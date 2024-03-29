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
	 * The feature id for the '<em><b>Dynamic Composite States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__DYNAMIC_COMPOSITE_STATES = 0;

	/**
	 * The feature id for the '<em><b>Execution Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__EXECUTION_FRAME = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Active Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__ACTIVE_FRAME = 3;

	/**
	 * The feature id for the '<em><b>Dynamic Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__DYNAMIC_PORTS = 4;

	/**
	 * The feature id for the '<em><b>Dynamic Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Dynamic Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dynamic Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.ValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

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
	int NULL_VALUE = 2;

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
	int INTEGER_VALUE = 3;

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
	int STRING_VALUE = 4;

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
	int ARRAY_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
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
	int PROXY_VALUE = 6;

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
	int ARRAY_PROXY_VALUE = 7;

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
	int ARRAY_PROXY_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Index Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_PROXY_ENTRY__INDEX_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
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
	int DYNAMIC_COMPOSITE_STATE = 9;

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
	int FRAME = 10;

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
	 * The feature id for the '<em><b>Top Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TOP_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__RETURN_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 5;

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
	int CONTEXT = 11;

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
	int DYNAMIC_VARIABLE = 12;

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
	 * The meta object id for the '{@link thingML.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.BooleanValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link thingML.impl.DynamicPortImpl <em>Dynamic Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.DynamicPortImpl
	 * @see thingML.impl.ThingMLPackageImpl#getDynamicPort()
	 * @generated
	 */
	int DYNAMIC_PORT = 14;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PORT__PORT = 0;

	/**
	 * The feature id for the '<em><b>Received Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PORT__RECEIVED_MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Connected Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PORT__CONNECTED_PORTS = 2;

	/**
	 * The number of structural features of the '<em>Dynamic Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dynamic Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thingML.impl.DynamicMessageImpl <em>Dynamic Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.DynamicMessageImpl
	 * @see thingML.impl.ThingMLPackageImpl#getDynamicMessage()
	 * @generated
	 */
	int DYNAMIC_MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MESSAGE__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MESSAGE__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_MESSAGE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link thingML.DynamicInstance#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see thingML.DynamicInstance#getInstance()
	 * @see #getDynamicInstance()
	 * @generated
	 */
	EReference getDynamicInstance_Instance();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicInstance#getActiveFrame <em>Active Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Frame</em>'.
	 * @see thingML.DynamicInstance#getActiveFrame()
	 * @see #getDynamicInstance()
	 * @generated
	 */
	EReference getDynamicInstance_ActiveFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.DynamicInstance#getDynamicPorts <em>Dynamic Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Ports</em>'.
	 * @see thingML.DynamicInstance#getDynamicPorts()
	 * @see #getDynamicInstance()
	 * @generated
	 */
	EReference getDynamicInstance_DynamicPorts();

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
	 * Returns the meta object for the reference list '{@link thingML.ArrayValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
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
	 * Returns the meta object for the reference '{@link thingML.ArrayProxyEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
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
	 * Returns the meta object for the reference '{@link thingML.Frame#getTopContext <em>Top Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Context</em>'.
	 * @see thingML.Frame#getTopContext()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_TopContext();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.Frame#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see thingML.Frame#getReturnValue()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_ReturnValue();

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
	 * Returns the meta object for class '{@link thingML.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see thingML.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link thingML.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see thingML.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link thingML.DynamicPort <em>Dynamic Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Port</em>'.
	 * @see thingML.DynamicPort
	 * @generated
	 */
	EClass getDynamicPort();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see thingML.DynamicPort#getPort()
	 * @see #getDynamicPort()
	 * @generated
	 */
	EReference getDynamicPort_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.DynamicPort#getReceivedMessages <em>Received Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Received Messages</em>'.
	 * @see thingML.DynamicPort#getReceivedMessages()
	 * @see #getDynamicPort()
	 * @generated
	 */
	EReference getDynamicPort_ReceivedMessages();

	/**
	 * Returns the meta object for the reference list '{@link thingML.DynamicPort#getConnectedPorts <em>Connected Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected Ports</em>'.
	 * @see thingML.DynamicPort#getConnectedPorts()
	 * @see #getDynamicPort()
	 * @generated
	 */
	EReference getDynamicPort_ConnectedPorts();

	/**
	 * Returns the meta object for class '{@link thingML.DynamicMessage <em>Dynamic Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Message</em>'.
	 * @see thingML.DynamicMessage
	 * @generated
	 */
	EClass getDynamicMessage();

	/**
	 * Returns the meta object for the reference '{@link thingML.DynamicMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see thingML.DynamicMessage#getMessage()
	 * @see #getDynamicMessage()
	 * @generated
	 */
	EReference getDynamicMessage_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.DynamicMessage#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see thingML.DynamicMessage#getParameters()
	 * @see #getDynamicMessage()
	 * @generated
	 */
	EReference getDynamicMessage_Parameters();

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
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__INSTANCE = eINSTANCE.getDynamicInstance_Instance();

		/**
		 * The meta object literal for the '<em><b>Active Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__ACTIVE_FRAME = eINSTANCE.getDynamicInstance_ActiveFrame();

		/**
		 * The meta object literal for the '<em><b>Dynamic Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__DYNAMIC_PORTS = eINSTANCE.getDynamicInstance_DynamicPorts();

		/**
		 * The meta object literal for the '<em><b>Dynamic Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_INSTANCE__DYNAMIC_PROPERTIES = eINSTANCE.getDynamicInstance_DynamicProperties();

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
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Top Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__TOP_CONTEXT = eINSTANCE.getFrame_TopContext();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__RETURN_VALUE = eINSTANCE.getFrame_ReturnValue();

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

		/**
		 * The meta object literal for the '{@link thingML.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.BooleanValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link thingML.impl.DynamicPortImpl <em>Dynamic Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.DynamicPortImpl
		 * @see thingML.impl.ThingMLPackageImpl#getDynamicPort()
		 * @generated
		 */
		EClass DYNAMIC_PORT = eINSTANCE.getDynamicPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PORT__PORT = eINSTANCE.getDynamicPort_Port();

		/**
		 * The meta object literal for the '<em><b>Received Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PORT__RECEIVED_MESSAGES = eINSTANCE.getDynamicPort_ReceivedMessages();

		/**
		 * The meta object literal for the '<em><b>Connected Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_PORT__CONNECTED_PORTS = eINSTANCE.getDynamicPort_ConnectedPorts();

		/**
		 * The meta object literal for the '{@link thingML.impl.DynamicMessageImpl <em>Dynamic Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.DynamicMessageImpl
		 * @see thingML.impl.ThingMLPackageImpl#getDynamicMessage()
		 * @generated
		 */
		EClass DYNAMIC_MESSAGE = eINSTANCE.getDynamicMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MESSAGE__MESSAGE = eINSTANCE.getDynamicMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_MESSAGE__PARAMETERS = eINSTANCE.getDynamicMessage_Parameters();

	}

} //ThingMLPackage
