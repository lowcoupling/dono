/**
 */
package com.lowcoupling.dono.dono;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.SectionReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dono.dono.DonoPackage#getSectionReference()
 * @model
 * @generated
 */
public interface SectionReference extends Reference
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
   * @see #setRef(Section)
   * @see com.lowcoupling.dono.dono.DonoPackage#getSectionReference_Ref()
   * @model
   * @generated
   */
  Section getRef();

  /**
   * Sets the value of the '{@link com.lowcoupling.dono.dono.SectionReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Section value);

} // SectionReference
