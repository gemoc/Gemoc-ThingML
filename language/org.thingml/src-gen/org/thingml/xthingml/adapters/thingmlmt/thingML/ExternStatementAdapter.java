package org.thingml.xthingml.adapters.thingmlmt.thingML;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory;
import org.thingml.xthingml.thingML.ExternStatement;

@SuppressWarnings("all")
public class ExternStatementAdapter extends EObjectAdapter<ExternStatement> implements org.thingml.xtext.thingML.ExternStatement {
  private ThingMLMTAdaptersFactory adaptersFactory;
  
  public ExternStatementAdapter() {
    super(org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance());
    adaptersFactory = org.thingml.xthingml.adapters.thingmlmt.ThingMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getStatement() {
    return adaptee.getStatement();
  }
  
  @Override
  public void setStatement(final String o) {
    adaptee.setStatement(o);
  }
  
  private EList<Expression> segments_;
  
  @Override
  public EList<Expression> getSegments() {
    if (segments_ == null)
    	segments_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSegments(), adaptersFactory, eResource);
    return segments_;
  }
  
  protected final static String STATEMENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE.getExternStatement();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_STATEMENT__STATEMENT:
    		return getStatement();
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_STATEMENT__SEGMENTS:
    		return getSegments();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_STATEMENT__STATEMENT:
    		return getStatement() != STATEMENT_EDEFAULT;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_STATEMENT__SEGMENTS:
    		return getSegments() != null && !getSegments().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_STATEMENT__STATEMENT:
    		setStatement(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.thingml.xtext.thingML.ThingMLPackage.EXTERN_STATEMENT__SEGMENTS:
    		getSegments().clear();
    		getSegments().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
