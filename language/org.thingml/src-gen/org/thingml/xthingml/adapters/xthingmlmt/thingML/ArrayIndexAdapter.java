package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ArrayIndex;
import org.thingml.xthingmlmt.thingML.Expression;

@SuppressWarnings("all")
public class ArrayIndexAdapter extends EObjectAdapter<ArrayIndex> implements org.thingml.xthingmlmt.thingML.ArrayIndex {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ArrayIndexAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getArray() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getArray(), eResource);
  }
  
  @Override
  public void setArray(final Expression o) {
    if (o != null)
    	adaptee.setArray(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setArray(null);
  }
  
  @Override
  public Expression getIndex() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getIndex(), eResource);
  }
  
  @Override
  public void setIndex(final Expression o) {
    if (o != null)
    	adaptee.setIndex(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setIndex(null);
  }
  
  @Override
  public Object evaluate() {
    return org.thingml.xthingml.aspects.ExpressionAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getArrayIndex();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ARRAY_INDEX__ARRAY:
    		return getArray();
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ARRAY_INDEX__INDEX:
    		return getIndex();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ARRAY_INDEX__ARRAY:
    		return getArray() != null;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ARRAY_INDEX__INDEX:
    		return getIndex() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ARRAY_INDEX__ARRAY:
    		setArray(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ARRAY_INDEX__INDEX:
    		setIndex(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
