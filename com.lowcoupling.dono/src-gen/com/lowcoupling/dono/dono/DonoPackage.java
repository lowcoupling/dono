/**
 */
package com.lowcoupling.dono.dono;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lowcoupling.dono.dono.DonoFactory
 * @model kind="package"
 * @generated
 */
public interface DonoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dono";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/dono/Dono";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dono";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DonoPackage eINSTANCE = com.lowcoupling.dono.dono.impl.DonoPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.DocImpl <em>Doc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.DocImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getDoc()
   * @generated
   */
  int DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC__NAME = 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC__SECTIONS = 1;

  /**
   * The number of structural features of the '<em>Doc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.SectionImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getSection()
   * @generated
   */
  int SECTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__LEVEL = 2;

  /**
   * The feature id for the '<em><b>Page Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__PAGE_BREAK = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__BODY = 4;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.DocItemImpl <em>Doc Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.DocItemImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getDocItem()
   * @generated
   */
  int DOC_ITEM = 2;

  /**
   * The number of structural features of the '<em>Doc Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.ParagraphItemImpl <em>Paragraph Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.ParagraphItemImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getParagraphItem()
   * @generated
   */
  int PARAGRAPH_ITEM = 3;

  /**
   * The number of structural features of the '<em>Paragraph Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.ParagraphImpl <em>Paragraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.ParagraphImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getParagraph()
   * @generated
   */
  int PARAGRAPH = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH__BODY = DOC_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paragraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAGRAPH_FEATURE_COUNT = DOC_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.ReferenceImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 5;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = PARAGRAPH_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.SectionReferenceImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getSectionReference()
   * @generated
   */
  int SECTION_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_REFERENCE__REF = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Section Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.ImgReferenceImpl <em>Img Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.ImgReferenceImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getImgReference()
   * @generated
   */
  int IMG_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMG_REFERENCE__REF = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Img Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMG_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.PageBreakImpl <em>Page Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.PageBreakImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getPageBreak()
   * @generated
   */
  int PAGE_BREAK = 8;

  /**
   * The feature id for the '<em><b>Pagebreak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK__PAGEBREAK = 0;

  /**
   * The number of structural features of the '<em>Page Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_BREAK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.ImageImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 9;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__URL = DOC_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__NAME = DOC_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CAPTION = DOC_ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__WIDTH = DOC_ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__HEIGHT = DOC_ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = DOC_ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.lowcoupling.dono.dono.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dono.dono.impl.TextImpl
   * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getText()
   * @generated
   */
  int TEXT = 10;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__CONTENT = PARAGRAPH_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = PARAGRAPH_ITEM_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.Doc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc</em>'.
   * @see com.lowcoupling.dono.dono.Doc
   * @generated
   */
  EClass getDoc();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Doc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.dono.dono.Doc#getName()
   * @see #getDoc()
   * @generated
   */
  EAttribute getDoc_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dono.dono.Doc#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see com.lowcoupling.dono.dono.Doc#getSections()
   * @see #getDoc()
   * @generated
   */
  EReference getDoc_Sections();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see com.lowcoupling.dono.dono.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Section#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.dono.dono.Section#getName()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Name();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Section#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see com.lowcoupling.dono.dono.Section#getTitle()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Title();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Section#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see com.lowcoupling.dono.dono.Section#getLevel()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Level();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Section#getPageBreak <em>Page Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Page Break</em>'.
   * @see com.lowcoupling.dono.dono.Section#getPageBreak()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_PageBreak();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dono.dono.Section#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see com.lowcoupling.dono.dono.Section#getBody()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Body();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.DocItem <em>Doc Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc Item</em>'.
   * @see com.lowcoupling.dono.dono.DocItem
   * @generated
   */
  EClass getDocItem();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.ParagraphItem <em>Paragraph Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph Item</em>'.
   * @see com.lowcoupling.dono.dono.ParagraphItem
   * @generated
   */
  EClass getParagraphItem();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paragraph</em>'.
   * @see com.lowcoupling.dono.dono.Paragraph
   * @generated
   */
  EClass getParagraph();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dono.dono.Paragraph#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see com.lowcoupling.dono.dono.Paragraph#getBody()
   * @see #getParagraph()
   * @generated
   */
  EReference getParagraph_Body();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see com.lowcoupling.dono.dono.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.SectionReference <em>Section Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Reference</em>'.
   * @see com.lowcoupling.dono.dono.SectionReference
   * @generated
   */
  EClass getSectionReference();

  /**
   * Returns the meta object for the reference '{@link com.lowcoupling.dono.dono.SectionReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.lowcoupling.dono.dono.SectionReference#getRef()
   * @see #getSectionReference()
   * @generated
   */
  EReference getSectionReference_Ref();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.ImgReference <em>Img Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Img Reference</em>'.
   * @see com.lowcoupling.dono.dono.ImgReference
   * @generated
   */
  EClass getImgReference();

  /**
   * Returns the meta object for the reference '{@link com.lowcoupling.dono.dono.ImgReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.lowcoupling.dono.dono.ImgReference#getRef()
   * @see #getImgReference()
   * @generated
   */
  EReference getImgReference_Ref();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.PageBreak <em>Page Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page Break</em>'.
   * @see com.lowcoupling.dono.dono.PageBreak
   * @generated
   */
  EClass getPageBreak();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.PageBreak#getPagebreak <em>Pagebreak</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pagebreak</em>'.
   * @see com.lowcoupling.dono.dono.PageBreak#getPagebreak()
   * @see #getPageBreak()
   * @generated
   */
  EAttribute getPageBreak_Pagebreak();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see com.lowcoupling.dono.dono.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Image#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.lowcoupling.dono.dono.Image#getUrl()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Url();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Image#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.dono.dono.Image#getName()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Name();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Image#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see com.lowcoupling.dono.dono.Image#getCaption()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Caption();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Image#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see com.lowcoupling.dono.dono.Image#getWidth()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Width();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Image#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see com.lowcoupling.dono.dono.Image#getHeight()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Height();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dono.dono.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see com.lowcoupling.dono.dono.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dono.dono.Text#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see com.lowcoupling.dono.dono.Text#getContent()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Content();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DonoFactory getDonoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.DocImpl <em>Doc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.DocImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getDoc()
     * @generated
     */
    EClass DOC = eINSTANCE.getDoc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC__NAME = eINSTANCE.getDoc_Name();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOC__SECTIONS = eINSTANCE.getDoc_Sections();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.SectionImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__LEVEL = eINSTANCE.getSection_Level();

    /**
     * The meta object literal for the '<em><b>Page Break</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__PAGE_BREAK = eINSTANCE.getSection_PageBreak();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__BODY = eINSTANCE.getSection_Body();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.DocItemImpl <em>Doc Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.DocItemImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getDocItem()
     * @generated
     */
    EClass DOC_ITEM = eINSTANCE.getDocItem();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.ParagraphItemImpl <em>Paragraph Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.ParagraphItemImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getParagraphItem()
     * @generated
     */
    EClass PARAGRAPH_ITEM = eINSTANCE.getParagraphItem();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.ParagraphImpl <em>Paragraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.ParagraphImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getParagraph()
     * @generated
     */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAGRAPH__BODY = eINSTANCE.getParagraph_Body();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.ReferenceImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.SectionReferenceImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getSectionReference()
     * @generated
     */
    EClass SECTION_REFERENCE = eINSTANCE.getSectionReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_REFERENCE__REF = eINSTANCE.getSectionReference_Ref();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.ImgReferenceImpl <em>Img Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.ImgReferenceImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getImgReference()
     * @generated
     */
    EClass IMG_REFERENCE = eINSTANCE.getImgReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMG_REFERENCE__REF = eINSTANCE.getImgReference_Ref();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.PageBreakImpl <em>Page Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.PageBreakImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getPageBreak()
     * @generated
     */
    EClass PAGE_BREAK = eINSTANCE.getPageBreak();

    /**
     * The meta object literal for the '<em><b>Pagebreak</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE_BREAK__PAGEBREAK = eINSTANCE.getPageBreak_Pagebreak();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.ImageImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__URL = eINSTANCE.getImage_Url();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__CAPTION = eINSTANCE.getImage_Caption();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__HEIGHT = eINSTANCE.getImage_Height();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dono.dono.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dono.dono.impl.TextImpl
     * @see com.lowcoupling.dono.dono.impl.DonoPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

  }

} //DonoPackage
