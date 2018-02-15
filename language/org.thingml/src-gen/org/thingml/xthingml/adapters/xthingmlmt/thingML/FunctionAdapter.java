package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.Function;
import org.thingml.xthingmlmt.thingML.Action;
import org.thingml.xthingmlmt.thingML.Parameter;
import org.thingml.xthingmlmt.thingML.PlatformAnnotation;
import org.thingml.xthingmlmt.thingML.TypeRef;

@SuppressWarnings("all")
public class FunctionAdapter extends EObjectAdapter<Function> implements org.thingml.xthingmlmt.thingML.Function {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public FunctionAdapter() {
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
  public boolean isAbstract() {
    return adaptee.isAbstract();
  }
  
  @Override
  public void setAbstract(final boolean o) {
    adaptee.setAbstract(o);
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  private EList<Parameter> parameters_;
  
  @Override
  public EList<Parameter> getParameters() {
    if (parameters_ == null)
    	parameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameters(), adaptersFactory, eResource);
    return parameters_;
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
  public Action getBody() {
    return (Action) adaptersFactory.createAdapter(adaptee.getBody(), eResource);
  }
  
  @Override
  public void setBody(final Action o) {
    if (o != null)
    	adaptee.setBody(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ActionAdapter) o).getAdaptee());
    else adaptee.setBody(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getFunction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__NAME:
    		return getName();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__PARAMETERS:
    		return getParameters();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__TYPE_REF:
    		return getTypeRef();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__BODY:
    		return getBody();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__PARAMETERS:
    		return getParameters() != null && !getParameters().isEmpty();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__TYPE_REF:
    		return getTypeRef() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__BODY:
    		return getBody() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__PARAMETERS:
    		getParameters().clear();
    		getParameters().addAll((Collection) newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__TYPE_REF:
    		setTypeRef(
    		(org.thingml.xthingmlmt.thingML.TypeRef)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__BODY:
    		setBody(
    		(org.thingml.xthingmlmt.thingML.Action)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.thingml.xthingmlmt.thingML.AnnotatedElement.class) {
    	switch (derivedFeatureID) {
    		case org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ANNOTATIONS:
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
    			return org.thingml.xthingmlmt.thingML.ThingMLPackage.FUNCTION__ANNOTATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
