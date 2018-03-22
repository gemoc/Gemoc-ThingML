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
	 * The meta object id for the '{@link thingML.impl.PropertyEntryImpl <em>Property Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.PropertyEntryImpl
	 * @see thingML.impl.ThingMLPackageImpl#getPropertyEntry()
	 * @generated
	 */
	int PROPERTY_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ENTRY_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link thingML.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.IntegerValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 2;

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
	int STRING_VALUE = 3;

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
	int ARRAY_VALUE = 4;

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
	 * The meta object id for the '{@link thingML.impl.InstanceContextImpl <em>Instance Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.InstanceContextImpl
	 * @see thingML.impl.ThingMLPackageImpl#getInstanceContext()
	 * @generated
	 */
	int INSTANCE_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Property Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONTEXT__PROPERTY_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Instance Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONTEXT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link thingML.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thingML.impl.NullValueImpl
	 * @see thingML.impl.ThingMLPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 6;

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
	 * Returns the meta object for class '{@link thingML.PropertyEntry <em>Property Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Entry</em>'.
	 * @see thingML.PropertyEntry
	 * @generated
	 */
	EClass getPropertyEntry();

	/**
	 * Returns the meta object for the reference '{@link thingML.PropertyEntry#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see thingML.PropertyEntry#getProperty()
	 * @see #getPropertyEntry()
	 * @generated
	 */
	EReference getPropertyEntry_Property();

	/**
	 * Returns the meta object for the containment reference '{@link thingML.PropertyEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see thingML.PropertyEntry#getValue()
	 * @see #getPropertyEntry()
	 * @generated
	 */
	EReference getPropertyEntry_Value();

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
	 * Returns the meta object for class '{@link thingML.InstanceContext <em>Instance Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Context</em>'.
	 * @see thingML.InstanceContext
	 * @generated
	 */
	EClass getInstanceContext();

	/**
	 * Returns the meta object for the containment reference list '{@link thingML.InstanceContext#getPropertyEntries <em>Property Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Entries</em>'.
	 * @see thingML.InstanceContext#getPropertyEntries()
	 * @see #getInstanceContext()
	 * @generated
	 */
	EReference getInstanceContext_PropertyEntries();

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
		 * The meta object literal for the '{@link thingML.impl.PropertyEntryImpl <em>Property Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.PropertyEntryImpl
		 * @see thingML.impl.ThingMLPackageImpl#getPropertyEntry()
		 * @generated
		 */
		EClass PROPERTY_ENTRY = eINSTANCE.getPropertyEntry();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ENTRY__PROPERTY = eINSTANCE.getPropertyEntry_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ENTRY__VALUE = eINSTANCE.getPropertyEntry_Value();

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
		 * The meta object literal for the '{@link thingML.impl.InstanceContextImpl <em>Instance Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.InstanceContextImpl
		 * @see thingML.impl.ThingMLPackageImpl#getInstanceContext()
		 * @generated
		 */
		EClass INSTANCE_CONTEXT = eINSTANCE.getInstanceContext();

		/**
		 * The meta object literal for the '<em><b>Property Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_CONTEXT__PROPERTY_ENTRIES = eINSTANCE.getInstanceContext_PropertyEntries();

		/**
		 * The meta object literal for the '{@link thingML.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thingML.impl.NullValueImpl
		 * @see thingML.impl.ThingMLPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

	}

} //ThingMLPackage