package org.thingml.xthingml.adapters.xthingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ErrorAction;
import org.thingml.xthingmlmt.thingML.Expression;

@SuppressWarnings("all")
public class ErrorActionAdapter extends EObjectAdapter<ErrorAction> implements org.thingml.xthingmlmt.thingML.ErrorAction {
  private XThingMLMTAdaptersFactory adaptersFactory;
  
  public ErrorActionAdapter() {
    super(org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.xthingmlmt.XThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isLine() {
    return adaptee.isLine();
  }
  
  @Override
  public void setLine(final boolean o) {
    adaptee.setLine(o);
  }
  
  private EList<Expression> msg_;
  
  @Override
  public EList<Expression> getMsg() {
    if (msg_ == null)
    	msg_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMsg(), adaptersFactory, eResource);
    return msg_;
  }
  
  protected final static boolean LINE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.thingml.xthingmlmt.thingML.ThingMLPackage.eINSTANCE.getErrorAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ERROR_ACTION__LINE:
    		return isLine() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ERROR_ACTION__MSG:
    		return getMsg();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ERROR_ACTION__LINE:
    		return isLine() != LINE_EDEFAULT;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ERROR_ACTION__MSG:
    		return getMsg() != null && !getMsg().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ERROR_ACTION__LINE:
    		setLine(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xthingmlmt.thingML.ThingMLPackage.ERROR_ACTION__MSG:
    		getMsg().clear();
    		getMsg().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
