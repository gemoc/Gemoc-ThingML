package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ErrorAction;

@SuppressWarnings("all")
public class ErrorActionAdapter extends EObjectAdapter<ErrorAction> implements org.thingml.xtext.thingML.ErrorAction {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ErrorActionAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
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
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getErrorAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ERROR_ACTION__LINE:
    		return isLine() ? Boolean.TRUE : Boolean.FALSE;
    	case org.thingml.xtext.thingML.ThingMLPackage.ERROR_ACTION__MSG:
    		return getMsg();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ERROR_ACTION__LINE:
    		return isLine() != LINE_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.ERROR_ACTION__MSG:
    		return getMsg() != null && !getMsg().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.ERROR_ACTION__LINE:
    		setLine(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.ERROR_ACTION__MSG:
    		getMsg().clear();
    		getMsg().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
