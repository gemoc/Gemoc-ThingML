/**
 */
package thingML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import thingML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingMLFactoryImpl extends EFactoryImpl implements ThingMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThingMLFactory init() {
		try {
			ThingMLFactory theThingMLFactory = (ThingMLFactory)EPackage.Registry.INSTANCE.getEFactory(ThingMLPackage.eNS_URI);
			if (theThingMLFactory != null) {
				return theThingMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThingMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ThingMLPackage.PROPERTY_ENTRY: return createPropertyEntry();
			case ThingMLPackage.INTEGER_VALUE: return createIntegerValue();
			case ThingMLPackage.STRING_VALUE: return createStringValue();
			case ThingMLPackage.ARRAY_VALUE: return createArrayValue();
			case ThingMLPackage.INSTANCE_CONTEXT: return createInstanceContext();
			case ThingMLPackage.NULL_VALUE: return createNullValue();
			case ThingMLPackage.PROXY_VALUE: return createProxyValue();
			case ThingMLPackage.ARRAY_PROXY_VALUE: return createArrayProxyValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEntry createPropertyEntry() {
		PropertyEntryImpl propertyEntry = new PropertyEntryImpl();
		return propertyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceContext createInstanceContext() {
		InstanceContextImpl instanceContext = new InstanceContextImpl();
		return instanceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValue createNullValue() {
		NullValueImpl nullValue = new NullValueImpl();
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyValue createProxyValue() {
		ProxyValueImpl proxyValue = new ProxyValueImpl();
		return proxyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayProxyValue createArrayProxyValue() {
		ArrayProxyValueImpl arrayProxyValue = new ArrayProxyValueImpl();
		return arrayProxyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMLPackage getThingMLPackage() {
		return (ThingMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThingMLPackage getPackage() {
		return ThingMLPackage.eINSTANCE;
	}

} //ThingMLFactoryImpl
