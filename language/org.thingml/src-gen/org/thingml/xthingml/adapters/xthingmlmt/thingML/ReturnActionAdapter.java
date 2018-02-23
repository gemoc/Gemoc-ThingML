package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ReturnAction;
import org.thingml.xthingmlmt.thingML.Expression;

@SuppressWarnings("all")
public class ReturnActionAdapter extends EObjectAdapter<ReturnAction> implements org.thingml.xthingmlmt.thingML.ReturnAction {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ReturnActionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expression getExp() {
    return (Expression) adaptersFactory.createAdapter(adaptee.getExp(), eResource);
  }
  
  @Override
  public void setExp(final Expression o) {
    if (o != null)
    	adaptee.setExp(((org.thingml.xthingml.adapters.xthingmlmt.thingML.ExpressionAdapter) o).getAdaptee());
    else adaptee.setExp(null);
  }
  
  @Override
  public void execute() {
    org.thingml.xthingml.aspects.ActionAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getReturnAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.RETURN_ACTION__EXP:
    		return getExp();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.RETURN_ACTION__EXP:
    		return getExp() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.RETURN_ACTION__EXP:
    		setExp(
    		(org.thingml.xthingmlmt.thingML.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
