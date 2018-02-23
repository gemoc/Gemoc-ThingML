package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Property;
import org.thingml.xthingmlmt.thingML.Expression;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.TypeRef;

@SuppressWarnings("all")
public class PropertyAdapter extends EObjectAdapter<Property> implements org.thingml.xthingmlmt.thingML.Property {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public PropertyAdapter() {
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
  public boolean isReadonly() {
    return adaptee.isReadonly();
  }
  
  @Override
  public void setReadonly(final boolean o) {
    adaptee.setReadonly(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public TypeRef getTypeRef() {
    return (TypeRef) adaptersFactory.createAdapter(adaptee.getTypeRef(), eResource);
  }
  
  @Override
  public void setTypeRef(final TypeRef o) {
    if (o != null)
    	adaptee.setTypeRef(((org.thingml.xthingml.adapters.xthingmlmt.thingML.TypeRefAdapter) o).getAdaptee());
    else adaptee.setTypeRef(null);
  }
  
  @Override
  public Expression getInit() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getInit(), eResource);
  }
  
  @Override
  public void setInit(final Expression o) {
    if (o != null)
    	adaptee.setInit(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setInit(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean READONLY_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getProperty();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__TYPE_REF:
    		return getTypeRef();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__READONLY:
    		return isReadonly() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__INIT:
    		return getInit();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__TYPE_REF:
    		return getTypeRef() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__READONLY:
    		return isReadonly() != READONLY_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__INIT:
    		return getInit() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__TYPE_REF:
    		setTypeRef(
    		(org.thingml.xthingmlmt.thingML.TypeRef)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__READONLY:
    		setReadonly(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.PROPERTY__INIT:
    		setInit(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
