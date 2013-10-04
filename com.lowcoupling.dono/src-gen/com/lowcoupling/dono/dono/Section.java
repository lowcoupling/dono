/**
 */
package com.lowcoupling.dono.dono;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.Section#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.Section#getLevel <em>Level</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.Section#getPageBreak <em>Page Break</em>}</li>
 *   <li>{@link com.lowcoupling.dono.dono.Section#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dono.dono.DonoPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.lowcoupling.dono.dono.DonoPackage#getSection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.Section#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see com.lowcoupling.dono.dono.DonoPackage#getSection_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.Section#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see #setLevel(int)
   * @see com.lowcoupling.dono.dono.DonoPackage#getSection_Level()
   * @model
   * @generated
   */
  int getLevel();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.Section#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see #getLevel()
   * @generated
   */
  void setLevel(int value);

  /**
   * Returns the value of the '<em><b>Page Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page Break</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page Break</em>' attribute.
   * @see #setPageBreak(String)
   * @see com.lowcoupling.dono.dono.DonoPackage#getSection_PageBreak()
   * @model
   * @generated
   */
  String getPageBreak();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.Section#getPageBreak <em>Page Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page Break</em>' attribute.
   * @see #getPageBreak()
   * @generated
   */
  void setPageBreak(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.dono.dono.DocItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see com.lowcoupling.dono.dono.DonoPackage#getSection_Body()
   * @model containment="true"
   * @generated
   */
  EList<DocItem> getBody();

} // Section
