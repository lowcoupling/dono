/**
 */
package com.lowcoupling.dono.dono;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dono.dono.Paragraph#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dono.dono.DonoPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends DocItem
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.dono.dono.ParagraphItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see com.lowcoupling.dono.dono.DonoPackage#getParagraph_Body()
   * @model containment="true"
   * @generated
   */
  EList<ParagraphItem> getBody();

} // Paragraph
