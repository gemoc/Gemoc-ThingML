package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.PrimitiveType;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;

@SuppressWarnings("all")
public class PrimitiveTypeAdapter extends EObjectAdapter<PrimitiveType> implements org.thingml.xthingmlmt.thingML.PrimitiveType {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public PrimitiveTypeAdapter() {
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
  
  @Override
  public long getByteSize() {
    return adaptee.getByteSize();
  }
  
  @Override
  public void setByteSize(final long o) {
    adaptee.setByteSize(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public void initialize() {
    org.thingml.xthingml.aspects.TypeAspect.initialize(adaptee);
  }
  
  @Override
  public void run() {
    org.thingml.xthingml.aspects.TypeAspect.run(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static long BYTE_SIZE_EDEFAULT = 0L;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getPrimitiveType();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__BYTE_SIZE:
    		return new java.lang.Long(getByteSize());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__BYTE_SIZE:
    		return getByteSize() != BYTE_SIZE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PRIMITIVE_TYPE__BYTE_SIZE:
    		setByteSize(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
