package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.AbstractConnector;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;

@SuppressWarnings("all")
public class AbstractConnectorAdapter extends EObjectAdapter<AbstractConnector> implements org.thingml.xthingmlmt.thingML.AbstractConnector {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public AbstractConnectorAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getAbstractConnector();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__ANNOTATIONS:
    		return getAnnotations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__ANNOTATIONS:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (baseFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS:
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.ABSTRACT_CONNECTOR__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
