/**
 */
package com.lowcoupling.dono.dono.impl;

import com.lowcoupling.dono.dono.DonoPackage;
import com.lowcoupling.dono.dono.PageBreak;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.impl.PageBreakImpl#getPagebreak <em>Pagebreak</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageBreakImpl extends MinimalEObjectImpl.Container implements PageBreak
{
  /**
   * The default value of the '{@link #getPagebreak() <em>Pagebreak</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagebreak()
   * @generated
   * @ordered
   */
  protected static final String PAGEBREAK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPagebreak() <em>Pagebreak</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagebreak()
   * @generated
   * @ordered
   */
  protected String pagebreak = PAGEBREAK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageBreakImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DonoPackage.Literals.PAGE_BREAK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPagebreak()
  {
    return pagebreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPagebreak(String newPagebreak)
  {
    String oldPagebreak = pagebreak;
    pagebreak = newPagebreak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DonoPackage.PAGE_BREAK__PAGEBREAK, oldPagebreak, pagebreak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DonoPackage.PAGE_BREAK__PAGEBREAK:
        return getPagebreak();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DonoPackage.PAGE_BREAK__PAGEBREAK:
        setPagebreak((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DonoPackage.PAGE_BREAK__PAGEBREAK:
        setPagebreak(PAGEBREAK_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DonoPackage.PAGE_BREAK__PAGEBREAK:
        return PAGEBREAK_EDEFAULT == null ? pagebreak != null : !PAGEBREAK_EDEFAULT.equals(pagebreak);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (pagebreak: ");
    result.append(pagebreak);
    result.append(')');
    return result.toString();
  }

} //PageBreakImpl
