package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Configuration;
import org.thingml.xthingmlmt.thingML.AbstractConnector;
import org.thingml.xthingmlmt.thingML.ConfigPropertyAssign;
import org.thingml.xthingmlmt.thingML.Instance;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;

@SuppressWarnings("all")
public class ConfigurationAdapter extends EObjectAdapter<Configuration> implements org.thingml.xthingmlmt.thingML.Configuration {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ConfigurationAdapter() {
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
  
  private EList<Instance> instances_;
  
  @Override
  public EList<Instance> getInstances() {
    if (instances_ == null)
    	instances_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInstances(), adaptersFactory, eResource);
    return instances_;
  }
  
  private EList<AbstractConnector> connectors_;
  
  @Override
  public EList<AbstractConnector> getConnectors() {
    if (connectors_ == null)
    	connectors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConnectors(), adaptersFactory, eResource);
    return connectors_;
  }
  
  private EList<ConfigPropertyAssign> propassigns_;
  
  @Override
  public EList<ConfigPropertyAssign> getPropassigns() {
    if (propassigns_ == null)
    	propassigns_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getPropassigns(), adaptersFactory, eResource);
    return propassigns_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getConfiguration();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__INSTANCES:
    		return getInstances();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__CONNECTORS:
    		return getConnectors();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__PROPASSIGNS:
    		return getPropassigns();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__INSTANCES:
    		return getInstances() != null && !getInstances().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__CONNECTORS:
    		return getConnectors() != null && !getConnectors().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__PROPASSIGNS:
    		return getPropassigns() != null && !getPropassigns().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__INSTANCES:
    		getInstances().clear();
    		getInstances().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__CONNECTORS:
    		getConnectors().clear();
    		getConnectors().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__PROPASSIGNS:
    		getPropassigns().clear();
    		getPropassigns().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__ANNOTATIONS:
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
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.CONFIGURATION__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
