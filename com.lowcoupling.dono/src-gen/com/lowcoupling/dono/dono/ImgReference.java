/**
 */
package com.lowcoupling.dono.dono;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Img Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.ImgReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dono.dono.DonoPackage#getImgReference()
 * @model
 * @generated
 */
public interface ImgReference extends Reference
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Image)
   * @see com.lowcoupling.dono.dono.DonoPackage#getImgReference_Ref()
   * @model
   * @generated
   */
  Image getRef();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.ImgReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Image value);

} // ImgReference
