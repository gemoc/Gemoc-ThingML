/**
 */
package org.thingml.xthingml.thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.thingml.xthingml.thingML.Configuration;
import org.thingml.xthingml.thingML.Import;
import org.thingml.xthingml.thingML.Protocol;
import org.thingml.xthingml.thingML.ThingMLModel;
import org.thingml.xthingml.thingML.ThingMLPackage;
import org.thingml.xthingml.thingML.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xthingml.thingML.impl.ThingMLModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.impl.ThingMLModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.impl.ThingMLModelImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link org.thingml.xthingml.thingML.impl.ThingMLModelImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingMLModelImpl extends EObjectImpl implements ThingMLModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocols;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingMLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingMLPackage.Literals.THING_ML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, ThingMLPackage.THING_ML_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ThingMLPackage.THING_ML_MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<Protocol>(Protocol.class, this, ThingMLPackage.THING_ML_MODEL__PROTOCOLS);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList<Configuration>(Configuration.class, this, ThingMLPackage.THING_ML_MODEL__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingMLPackage.THING_ML_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.THING_ML_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.THING_ML_MODEL__CONFIGS:
				return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingMLPackage.THING_ML_MODEL__IMPORTS:
				return getImports();
			case ThingMLPackage.THING_ML_MODEL__TYPES:
				return getTypes();
			case ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
				return getProtocols();
			case ThingMLPackage.THING_ML_MODEL__CONFIGS:
				return getConfigs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThingMLPackage.THING_ML_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case ThingMLPackage.THING_ML_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends Protocol>)newValue);
				return;
			case ThingMLPackage.THING_ML_MODEL__CONFIGS:
				getConfigs().clear();
				getConfigs().addAll((Collection<? extends Configuration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ThingMLPackage.THING_ML_MODEL__IMPORTS:
				getImports().clear();
				return;
			case ThingMLPackage.THING_ML_MODEL__TYPES:
				getTypes().clear();
				return;
			case ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
				getProtocols().clear();
				return;
			case ThingMLPackage.THING_ML_MODEL__CONFIGS:
				getConfigs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ThingMLPackage.THING_ML_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ThingMLPackage.THING_ML_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case ThingMLPackage.THING_ML_MODEL__PROTOCOLS:
				return protocols != null && !protocols.isEmpty();
			case ThingMLPackage.THING_ML_MODEL__CONFIGS:
				return configs != null && !configs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThingMLModelImpl
