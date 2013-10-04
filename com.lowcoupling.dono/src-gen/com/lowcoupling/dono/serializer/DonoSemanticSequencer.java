package com.lowcoupling.dono.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.lowcoupling.dono.dono.Doc;
import com.lowcoupling.dono.dono.DonoPackage;
import com.lowcoupling.dono.dono.Image;
import com.lowcoupling.dono.dono.ImgReference;
import com.lowcoupling.dono.dono.PageBreak;
import com.lowcoupling.dono.dono.Paragraph;
import com.lowcoupling.dono.dono.Section;
import com.lowcoupling.dono.dono.SectionReference;
import com.lowcoupling.dono.dono.Text;
import com.lowcoupling.dono.services.DonoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DonoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DonoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DonoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DonoPackage.DOC:
				if(context == grammarAccess.getDocRule()) {
					sequence_Doc(context, (Doc) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.IMAGE:
				if(context == grammarAccess.getDocItemRule() ||
				   context == grammarAccess.getImageRule()) {
					sequence_Image(context, (Image) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.IMG_REFERENCE:
				if(context == grammarAccess.getImgReferenceRule() ||
				   context == grammarAccess.getParagraphItemRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_ImgReference(context, (ImgReference) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.PAGE_BREAK:
				if(context == grammarAccess.getPageBreakRule()) {
					sequence_PageBreak(context, (PageBreak) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.PARAGRAPH:
				if(context == grammarAccess.getDocItemRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_Paragraph(context, (Paragraph) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.SECTION:
				if(context == grammarAccess.getSectionRule()) {
					sequence_Section(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.SECTION_REFERENCE:
				if(context == grammarAccess.getParagraphItemRule() ||
				   context == grammarAccess.getReferenceRule() ||
				   context == grammarAccess.getSectionReferenceRule()) {
					sequence_SectionReference(context, (SectionReference) semanticObject); 
					return; 
				}
				else break;
			case DonoPackage.TEXT:
				if(context == grammarAccess.getParagraphItemRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID sections+=Section*)
	 */
	protected void sequence_Doc(EObject context, Doc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=STRING name=ID caption=STRING (width=INT height=INT)?)
	 */
	protected void sequence_Image(EObject context, Image semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Image|QualifiedName]
	 */
	protected void sequence_ImgReference(EObject context, ImgReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DonoPackage.Literals.IMG_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DonoPackage.Literals.IMG_REFERENCE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImgReferenceAccess().getRefImageQualifiedNameParserRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pagebreak='pagebreak'
	 */
	protected void sequence_PageBreak(EObject context, PageBreak semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DonoPackage.Literals.PAGE_BREAK__PAGEBREAK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DonoPackage.Literals.PAGE_BREAK__PAGEBREAK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPageBreakAccess().getPagebreakPagebreakKeyword_0_0(), semanticObject.getPagebreak());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     body+=ParagraphItem+
	 */
	protected void sequence_Paragraph(EObject context, Paragraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Section|ID]
	 */
	protected void sequence_SectionReference(EObject context, SectionReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DonoPackage.Literals.SECTION_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DonoPackage.Literals.SECTION_REFERENCE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSectionReferenceAccess().getRefSectionIDTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING level=INT? pageBreak='pagebreak'? body+=DocItem*)
	 */
	protected void sequence_Section(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DonoPackage.Literals.TEXT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DonoPackage.Literals.TEXT__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_0(), semanticObject.getContent());
		feeder.finish();
	}
}
