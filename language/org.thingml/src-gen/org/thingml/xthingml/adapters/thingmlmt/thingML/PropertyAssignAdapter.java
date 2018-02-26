package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Property;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.PropertyAssign;

@SuppressWarnings("all")
public class PropertyAssignAdapter extends EObjectAdapter<PropertyAssign> implements org.thingml.xtext.thingML.PropertyAssign {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public PropertyAssignAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  private EList<PlatformAnnotation> annotations_;
  
  @Override
  public EList<PlatformAnnotation> getAnnotations() {
    if (annotations_ == null)
    	annotations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnnotations(), adaptersFactory, eResource);
    return annotations_;
  }
  
  @Override
  public Property getProperty() {
    return (Property) adaptersFactory.createAdapter(adaptee.getProperty(), eResource);
  }
  
  @Override
  public void setProperty(final Property o) {
    if (o != null)
    	adaptee.setProperty(((org.thingml.xthingml.adapters.thingmlmt.thingML.PropertyAdapter) o).getAdaptee());
    else adaptee.setProperty(null);
  }
  
  private EList<Expression> index_;
  
  @Override
  public EList<Expression> getIndex() {
    if (index_ == null)
    	index_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIndex(), adaptersFactory, eResource);
    return index_;
  }
  
  @Override
  public Expression getInit() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getInit(), eResource);
  }
  
  @Override
  public void setInit(final Expression o) {
    if (o != null)
    	adaptee.setInit(((org.thingml.xthingml.adapters.thingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setInit(null);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getPropertyAssign();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__ANNOTATIONS:
    		return getAnnotations();
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__PROPERTY:
    		return getProperty();
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__INDEX:
    		return getIndex();
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__INIT:
    		return getInit();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__ANNOTATIONS:
    		return getAnnotations() != null && !getAnnotations().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__PROPERTY:
    		return getProperty() != null;
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__INDEX:
    		return getIndex() != null && !getIndex().isEmpty();
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__INIT:
    		return getInit() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__ANNOTATIONS:
    		getAnnotations().clear();
    		getAnnotations().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__PROPERTY:
    		setProperty(
    		(org.thingml.xtext.thingML.Property)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__INDEX:
    		getIndex().clear();
    		getIndex().addAll((Collection) newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.PROPERTY_ASSIGN__INIT:
    		setInit(
    		(org.thingml.xtext.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}