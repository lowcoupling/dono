/**
 */
package com.lowcoupling.dono.dono.impl;

import com.lowcoupling.dono.dono.DocItem;
import com.lowcoupling.dono.dono.DonoPackage;
import com.lowcoupling.dono.dono.Section;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.impl.SectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.impl.SectionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.impl.SectionImpl#getPageBreak <em>Page Break</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.impl.SectionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getPageBreak() <em>Page Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPageBreak()
   * @generated
   * @ordered
   */
  protected static final String PAGE_BREAK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPageBreak() <em>Page Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPageBreak()
   * @generated
   * @ordered
   */
  protected String pageBreak = PAGE_BREAK_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<DocItem> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SectionImpl()
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
    return DonoPackage.Literals.SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DonoPackage.SECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DonoPackage.SECTION__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(int newLevel)
  {
    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DonoPackage.SECTION__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPageBreak()
  {
    return pageBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPageBreak(String newPageBreak)
  {
    String oldPageBreak = pageBreak;
    pageBreak = newPageBreak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DonoPackage.SECTION__PAGE_BREAK, oldPageBreak, pageBreak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DocItem> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<DocItem>(DocItem.class, this, DonoPackage.SECTION__BODY);
    }
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DonoPackage.SECTION__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DonoPackage.SECTION__NAME:
        return getName();
      case DonoPackage.SECTION__TITLE:
        return getTitle();
      case DonoPackage.SECTION__LEVEL:
        return getLevel();
      case DonoPackage.SECTION__PAGE_BREAK:
        return getPageBreak();
      case DonoPackage.SECTION__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DonoPackage.SECTION__NAME:
        setName((String)newValue);
        return;
      case DonoPackage.SECTION__TITLE:
        setTitle((String)newValue);
        return;
      case DonoPackage.SECTION__LEVEL:
        setLevel((Integer)newValue);
        return;
      case DonoPackage.SECTION__PAGE_BREAK:
        setPageBreak((String)newValue);
        return;
      case DonoPackage.SECTION__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends DocItem>)newValue);
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
      case DonoPackage.SECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DonoPackage.SECTION__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case DonoPackage.SECTION__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case DonoPackage.SECTION__PAGE_BREAK:
        setPageBreak(PAGE_BREAK_EDEFAULT);
        return;
      case DonoPackage.SECTION__BODY:
        getBody().clear();
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
      case DonoPackage.SECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DonoPackage.SECTION__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case DonoPackage.SECTION__LEVEL:
        return level != LEVEL_EDEFAULT;
      case DonoPackage.SECTION__PAGE_BREAK:
        return PAGE_BREAK_EDEFAULT == null ? pageBreak != null : !PAGE_BREAK_EDEFAULT.equals(pageBreak);
      case DonoPackage.SECTION__BODY:
        return body != null && !body.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(", level: ");
    result.append(level);
    result.append(", pageBreak: ");
    result.append(pageBreak);
    result.append(')');
    return result.toString();
  }

} //SectionImpl
