/**
 */
package com.lowcoupling.dono.dono.impl;

import com.lowcoupling.dono.dono.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DonoFactoryImpl extends EFactoryImpl implements DonoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DonoFactory init()
  {
    try
    {
      DonoFactory theDonoFactory = (DonoFactory)EPackage.Registry.INSTANCE.getEFactory(DonoPackage.eNS_URI);
      if (theDonoFactory != null)
      {
        return theDonoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DonoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DonoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DonoPackage.DOC: return createDoc();
      case DonoPackage.SECTION: return createSection();
      case DonoPackage.DOC_ITEM: return createDocItem();
      case DonoPackage.PARAGRAPH_ITEM: return createParagraphItem();
      case DonoPackage.PARAGRAPH: return createParagraph();
      case DonoPackage.REFERENCE: return createReference();
      case DonoPackage.SECTION_REFERENCE: return createSectionReference();
      case DonoPackage.IMG_REFERENCE: return createImgReference();
      case DonoPackage.PAGE_BREAK: return createPageBreak();
      case DonoPackage.IMAGE: return createImage();
      case DonoPackage.TEXT: return createText();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Doc createDoc()
  {
    DocImpl doc = new DocImpl();
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocItem createDocItem()
  {
    DocItemImpl docItem = new DocItemImpl();
    return docItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParagraphItem createParagraphItem()
  {
    ParagraphItemImpl paragraphItem = new ParagraphItemImpl();
    return paragraphItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paragraph createParagraph()
  {
    ParagraphImpl paragraph = new ParagraphImpl();
    return paragraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionReference createSectionReference()
  {
    SectionReferenceImpl sectionReference = new SectionReferenceImpl();
    return sectionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImgReference createImgReference()
  {
    ImgReferenceImpl imgReference = new ImgReferenceImpl();
    return imgReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreak createPageBreak()
  {
    PageBreakImpl pageBreak = new PageBreakImpl();
    return pageBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DonoPackage getDonoPackage()
  {
    return (DonoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DonoPackage getPackage()
  {
    return DonoPackage.eINSTANCE;
  }

} //DonoFactoryImpl
