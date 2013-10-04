/**
 */
package com.lowcoupling.dono.dono;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.Text#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dono.dono.DonoPackage#getText()
 * @model
 * @generated
 */
public interface Text extends ParagraphItem
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see com.lowcoupling.dono.dono.DonoPackage#getText_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.Text#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // Text
