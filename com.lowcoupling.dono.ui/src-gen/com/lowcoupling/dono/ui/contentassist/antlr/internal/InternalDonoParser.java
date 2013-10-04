package com.lowcoupling.dono.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.lowcoupling.dono.services.DonoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDonoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENCURLY", "RULE_CLOSECURLY", "RULE_ID", "RULE_ENDLINE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'doc'", "'.'", "'section'", "'title'", "'level'", "'secRef'", "'imgRef'", "'image'", "'name'", "'caption'", "'width'", "'height'", "'pagebreak'"
    };
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ENDLINE=7;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CLOSECURLY=5;
    public static final int T__14=14;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=4;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalDonoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDonoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDonoParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g"; }


     
     	private DonoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DonoGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDoc"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:60:1: entryRuleDoc : ruleDoc EOF ;
    public final void entryRuleDoc() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:61:1: ( ruleDoc EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:62:1: ruleDoc EOF
            {
             before(grammarAccess.getDocRule()); 
            pushFollow(FOLLOW_ruleDoc_in_entryRuleDoc61);
            ruleDoc();

            state._fsp--;

             after(grammarAccess.getDocRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoc68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoc"


    // $ANTLR start "ruleDoc"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:69:1: ruleDoc : ( ( rule__Doc__Group__0 ) ) ;
    public final void ruleDoc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:73:2: ( ( ( rule__Doc__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:74:1: ( ( rule__Doc__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:74:1: ( ( rule__Doc__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:75:1: ( rule__Doc__Group__0 )
            {
             before(grammarAccess.getDocAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:76:1: ( rule__Doc__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:76:2: rule__Doc__Group__0
            {
            pushFollow(FOLLOW_rule__Doc__Group__0_in_ruleDoc94);
            rule__Doc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoc"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:89:1: ( ruleQualifiedName EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSection"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:116:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:117:1: ( ruleSection EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:118:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection181);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:125:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:129:2: ( ( ( rule__Section__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:130:1: ( ( rule__Section__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:130:1: ( ( rule__Section__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:131:1: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:132:1: ( rule__Section__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:132:2: rule__Section__Group__0
            {
            pushFollow(FOLLOW_rule__Section__Group__0_in_ruleSection214);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleDocItem"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:144:1: entryRuleDocItem : ruleDocItem EOF ;
    public final void entryRuleDocItem() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:145:1: ( ruleDocItem EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:146:1: ruleDocItem EOF
            {
             before(grammarAccess.getDocItemRule()); 
            pushFollow(FOLLOW_ruleDocItem_in_entryRuleDocItem241);
            ruleDocItem();

            state._fsp--;

             after(grammarAccess.getDocItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocItem248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocItem"


    // $ANTLR start "ruleDocItem"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:153:1: ruleDocItem : ( ( rule__DocItem__Alternatives ) ) ;
    public final void ruleDocItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:157:2: ( ( ( rule__DocItem__Alternatives ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:158:1: ( ( rule__DocItem__Alternatives ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:158:1: ( ( rule__DocItem__Alternatives ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:159:1: ( rule__DocItem__Alternatives )
            {
             before(grammarAccess.getDocItemAccess().getAlternatives()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:160:1: ( rule__DocItem__Alternatives )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:160:2: rule__DocItem__Alternatives
            {
            pushFollow(FOLLOW_rule__DocItem__Alternatives_in_ruleDocItem274);
            rule__DocItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDocItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocItem"


    // $ANTLR start "entryRuleParagraphItem"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:172:1: entryRuleParagraphItem : ruleParagraphItem EOF ;
    public final void entryRuleParagraphItem() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:173:1: ( ruleParagraphItem EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:174:1: ruleParagraphItem EOF
            {
             before(grammarAccess.getParagraphItemRule()); 
            pushFollow(FOLLOW_ruleParagraphItem_in_entryRuleParagraphItem301);
            ruleParagraphItem();

            state._fsp--;

             after(grammarAccess.getParagraphItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraphItem308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagraphItem"


    // $ANTLR start "ruleParagraphItem"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:181:1: ruleParagraphItem : ( ( rule__ParagraphItem__Alternatives ) ) ;
    public final void ruleParagraphItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:185:2: ( ( ( rule__ParagraphItem__Alternatives ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:186:1: ( ( rule__ParagraphItem__Alternatives ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:186:1: ( ( rule__ParagraphItem__Alternatives ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:187:1: ( rule__ParagraphItem__Alternatives )
            {
             before(grammarAccess.getParagraphItemAccess().getAlternatives()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:188:1: ( rule__ParagraphItem__Alternatives )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:188:2: rule__ParagraphItem__Alternatives
            {
            pushFollow(FOLLOW_rule__ParagraphItem__Alternatives_in_ruleParagraphItem334);
            rule__ParagraphItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParagraphItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraphItem"


    // $ANTLR start "entryRuleParagraph"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:200:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:201:1: ( ruleParagraph EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:202:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph361);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:209:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:213:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:214:1: ( ( rule__Paragraph__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:214:1: ( ( rule__Paragraph__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:215:1: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:216:1: ( rule__Paragraph__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:216:2: rule__Paragraph__Group__0
            {
            pushFollow(FOLLOW_rule__Paragraph__Group__0_in_ruleParagraph394);
            rule__Paragraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReference"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:228:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:229:1: ( ruleReference EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:230:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference421);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:237:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:241:2: ( ( ( rule__Reference__Alternatives ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:242:1: ( ( rule__Reference__Alternatives ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:242:1: ( ( rule__Reference__Alternatives ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:243:1: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:244:1: ( rule__Reference__Alternatives )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:244:2: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_rule__Reference__Alternatives_in_ruleReference454);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleSectionReference"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:256:1: entryRuleSectionReference : ruleSectionReference EOF ;
    public final void entryRuleSectionReference() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:257:1: ( ruleSectionReference EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:258:1: ruleSectionReference EOF
            {
             before(grammarAccess.getSectionReferenceRule()); 
            pushFollow(FOLLOW_ruleSectionReference_in_entryRuleSectionReference481);
            ruleSectionReference();

            state._fsp--;

             after(grammarAccess.getSectionReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionReference488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:265:1: ruleSectionReference : ( ( rule__SectionReference__Group__0 ) ) ;
    public final void ruleSectionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:269:2: ( ( ( rule__SectionReference__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:270:1: ( ( rule__SectionReference__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:270:1: ( ( rule__SectionReference__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:271:1: ( rule__SectionReference__Group__0 )
            {
             before(grammarAccess.getSectionReferenceAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:272:1: ( rule__SectionReference__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:272:2: rule__SectionReference__Group__0
            {
            pushFollow(FOLLOW_rule__SectionReference__Group__0_in_ruleSectionReference514);
            rule__SectionReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionReference"


    // $ANTLR start "entryRuleImgReference"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:284:1: entryRuleImgReference : ruleImgReference EOF ;
    public final void entryRuleImgReference() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:285:1: ( ruleImgReference EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:286:1: ruleImgReference EOF
            {
             before(grammarAccess.getImgReferenceRule()); 
            pushFollow(FOLLOW_ruleImgReference_in_entryRuleImgReference541);
            ruleImgReference();

            state._fsp--;

             after(grammarAccess.getImgReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImgReference548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImgReference"


    // $ANTLR start "ruleImgReference"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:293:1: ruleImgReference : ( ( rule__ImgReference__Group__0 ) ) ;
    public final void ruleImgReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:297:2: ( ( ( rule__ImgReference__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:298:1: ( ( rule__ImgReference__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:298:1: ( ( rule__ImgReference__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:299:1: ( rule__ImgReference__Group__0 )
            {
             before(grammarAccess.getImgReferenceAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:300:1: ( rule__ImgReference__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:300:2: rule__ImgReference__Group__0
            {
            pushFollow(FOLLOW_rule__ImgReference__Group__0_in_ruleImgReference574);
            rule__ImgReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImgReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImgReference"


    // $ANTLR start "entryRuleImage"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:314:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:315:1: ( ruleImage EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:316:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage603);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:323:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:327:2: ( ( ( rule__Image__Group__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:328:1: ( ( rule__Image__Group__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:328:1: ( ( rule__Image__Group__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:329:1: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:330:1: ( rule__Image__Group__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:330:2: rule__Image__Group__0
            {
            pushFollow(FOLLOW_rule__Image__Group__0_in_ruleImage636);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleText"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:342:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:343:1: ( ruleText EOF )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:344:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText663);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:351:1: ruleText : ( ( rule__Text__ContentAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:355:2: ( ( ( rule__Text__ContentAssignment ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:356:1: ( ( rule__Text__ContentAssignment ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:356:1: ( ( rule__Text__ContentAssignment ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:357:1: ( rule__Text__ContentAssignment )
            {
             before(grammarAccess.getTextAccess().getContentAssignment()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:358:1: ( rule__Text__ContentAssignment )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:358:2: rule__Text__ContentAssignment
            {
            pushFollow(FOLLOW_rule__Text__ContentAssignment_in_ruleText696);
            rule__Text__ContentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "rule__DocItem__Alternatives"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:370:1: rule__DocItem__Alternatives : ( ( ruleParagraph ) | ( ruleImage ) );
    public final void rule__DocItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:374:1: ( ( ruleParagraph ) | ( ruleImage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_OPENCURLY) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:375:1: ( ruleParagraph )
                    {
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:375:1: ( ruleParagraph )
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:376:1: ruleParagraph
                    {
                     before(grammarAccess.getDocItemAccess().getParagraphParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParagraph_in_rule__DocItem__Alternatives732);
                    ruleParagraph();

                    state._fsp--;

                     after(grammarAccess.getDocItemAccess().getParagraphParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:381:6: ( ruleImage )
                    {
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:381:6: ( ruleImage )
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:382:1: ruleImage
                    {
                     before(grammarAccess.getDocItemAccess().getImageParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleImage_in_rule__DocItem__Alternatives749);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getDocItemAccess().getImageParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocItem__Alternatives"


    // $ANTLR start "rule__ParagraphItem__Alternatives"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:392:1: rule__ParagraphItem__Alternatives : ( ( ruleText ) | ( ruleReference ) );
    public final void rule__ParagraphItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:396:1: ( ( ruleText ) | ( ruleReference ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:397:1: ( ruleText )
                    {
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:397:1: ( ruleText )
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:398:1: ruleText
                    {
                     before(grammarAccess.getParagraphItemAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleText_in_rule__ParagraphItem__Alternatives781);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getParagraphItemAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:403:6: ( ruleReference )
                    {
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:403:6: ( ruleReference )
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:404:1: ruleReference
                    {
                     before(grammarAccess.getParagraphItemAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__ParagraphItem__Alternatives798);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getParagraphItemAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParagraphItem__Alternatives"


    // $ANTLR start "rule__Reference__Alternatives"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:414:1: rule__Reference__Alternatives : ( ( ruleSectionReference ) | ( ruleImgReference ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:418:1: ( ( ruleSectionReference ) | ( ruleImgReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:419:1: ( ruleSectionReference )
                    {
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:419:1: ( ruleSectionReference )
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:420:1: ruleSectionReference
                    {
                     before(grammarAccess.getReferenceAccess().getSectionReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSectionReference_in_rule__Reference__Alternatives830);
                    ruleSectionReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getSectionReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:425:6: ( ruleImgReference )
                    {
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:425:6: ( ruleImgReference )
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:426:1: ruleImgReference
                    {
                     before(grammarAccess.getReferenceAccess().getImgReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleImgReference_in_rule__Reference__Alternatives847);
                    ruleImgReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getImgReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__Doc__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:438:1: rule__Doc__Group__0 : rule__Doc__Group__0__Impl rule__Doc__Group__1 ;
    public final void rule__Doc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:442:1: ( rule__Doc__Group__0__Impl rule__Doc__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:443:2: rule__Doc__Group__0__Impl rule__Doc__Group__1
            {
            pushFollow(FOLLOW_rule__Doc__Group__0__Impl_in_rule__Doc__Group__0877);
            rule__Doc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Doc__Group__1_in_rule__Doc__Group__0880);
            rule__Doc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__0"


    // $ANTLR start "rule__Doc__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:450:1: rule__Doc__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Doc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:454:1: ( ( 'doc' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:455:1: ( 'doc' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:455:1: ( 'doc' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:456:1: 'doc'
            {
             before(grammarAccess.getDocAccess().getDocKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Doc__Group__0__Impl908); 
             after(grammarAccess.getDocAccess().getDocKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__0__Impl"


    // $ANTLR start "rule__Doc__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:469:1: rule__Doc__Group__1 : rule__Doc__Group__1__Impl rule__Doc__Group__2 ;
    public final void rule__Doc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:473:1: ( rule__Doc__Group__1__Impl rule__Doc__Group__2 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:474:2: rule__Doc__Group__1__Impl rule__Doc__Group__2
            {
            pushFollow(FOLLOW_rule__Doc__Group__1__Impl_in_rule__Doc__Group__1939);
            rule__Doc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Doc__Group__2_in_rule__Doc__Group__1942);
            rule__Doc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__1"


    // $ANTLR start "rule__Doc__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:481:1: rule__Doc__Group__1__Impl : ( ( rule__Doc__NameAssignment_1 ) ) ;
    public final void rule__Doc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:485:1: ( ( ( rule__Doc__NameAssignment_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:486:1: ( ( rule__Doc__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:486:1: ( ( rule__Doc__NameAssignment_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:487:1: ( rule__Doc__NameAssignment_1 )
            {
             before(grammarAccess.getDocAccess().getNameAssignment_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:488:1: ( rule__Doc__NameAssignment_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:488:2: rule__Doc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Doc__NameAssignment_1_in_rule__Doc__Group__1__Impl969);
            rule__Doc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__1__Impl"


    // $ANTLR start "rule__Doc__Group__2"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:498:1: rule__Doc__Group__2 : rule__Doc__Group__2__Impl rule__Doc__Group__3 ;
    public final void rule__Doc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:502:1: ( rule__Doc__Group__2__Impl rule__Doc__Group__3 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:503:2: rule__Doc__Group__2__Impl rule__Doc__Group__3
            {
            pushFollow(FOLLOW_rule__Doc__Group__2__Impl_in_rule__Doc__Group__2999);
            rule__Doc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Doc__Group__3_in_rule__Doc__Group__21002);
            rule__Doc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__2"


    // $ANTLR start "rule__Doc__Group__2__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:510:1: rule__Doc__Group__2__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Doc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:514:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:515:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:515:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:516:1: RULE_OPENCURLY
            {
             before(grammarAccess.getDocAccess().getOPENCURLYTerminalRuleCall_2()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Doc__Group__2__Impl1029); 
             after(grammarAccess.getDocAccess().getOPENCURLYTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__2__Impl"


    // $ANTLR start "rule__Doc__Group__3"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:527:1: rule__Doc__Group__3 : rule__Doc__Group__3__Impl rule__Doc__Group__4 ;
    public final void rule__Doc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:531:1: ( rule__Doc__Group__3__Impl rule__Doc__Group__4 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:532:2: rule__Doc__Group__3__Impl rule__Doc__Group__4
            {
            pushFollow(FOLLOW_rule__Doc__Group__3__Impl_in_rule__Doc__Group__31058);
            rule__Doc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Doc__Group__4_in_rule__Doc__Group__31061);
            rule__Doc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__3"


    // $ANTLR start "rule__Doc__Group__3__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:539:1: rule__Doc__Group__3__Impl : ( ( rule__Doc__SectionsAssignment_3 )* ) ;
    public final void rule__Doc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:543:1: ( ( ( rule__Doc__SectionsAssignment_3 )* ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:544:1: ( ( rule__Doc__SectionsAssignment_3 )* )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:544:1: ( ( rule__Doc__SectionsAssignment_3 )* )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:545:1: ( rule__Doc__SectionsAssignment_3 )*
            {
             before(grammarAccess.getDocAccess().getSectionsAssignment_3()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:546:1: ( rule__Doc__SectionsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:546:2: rule__Doc__SectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Doc__SectionsAssignment_3_in_rule__Doc__Group__3__Impl1088);
            	    rule__Doc__SectionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDocAccess().getSectionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__3__Impl"


    // $ANTLR start "rule__Doc__Group__4"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:556:1: rule__Doc__Group__4 : rule__Doc__Group__4__Impl ;
    public final void rule__Doc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:560:1: ( rule__Doc__Group__4__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:561:2: rule__Doc__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Doc__Group__4__Impl_in_rule__Doc__Group__41119);
            rule__Doc__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__4"


    // $ANTLR start "rule__Doc__Group__4__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:567:1: rule__Doc__Group__4__Impl : ( RULE_CLOSECURLY ) ;
    public final void rule__Doc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:571:1: ( ( RULE_CLOSECURLY ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:572:1: ( RULE_CLOSECURLY )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:572:1: ( RULE_CLOSECURLY )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:573:1: RULE_CLOSECURLY
            {
             before(grammarAccess.getDocAccess().getCLOSECURLYTerminalRuleCall_4()); 
            match(input,RULE_CLOSECURLY,FOLLOW_RULE_CLOSECURLY_in_rule__Doc__Group__4__Impl1146); 
             after(grammarAccess.getDocAccess().getCLOSECURLYTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:594:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:598:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:599:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01185);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01188);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:606:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:610:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:611:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:611:1: ( RULE_ID )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:612:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1215); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:623:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:627:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:628:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11244);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:634:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:638:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:639:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:639:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:640:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:641:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:641:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1271);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:655:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:659:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:660:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01306);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01309);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:667:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:671:1: ( ( '.' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:672:1: ( '.' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:672:1: ( '.' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:673:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1337); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:686:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:690:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:691:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11368);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:697:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:701:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:702:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:702:1: ( RULE_ID )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:703:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1395); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:718:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:722:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:723:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__01428);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__1_in_rule__Section__Group__01431);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:730:1: rule__Section__Group__0__Impl : ( 'section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:734:1: ( ( 'section' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:735:1: ( 'section' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:735:1: ( 'section' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:736:1: 'section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Section__Group__0__Impl1459); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:749:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:753:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:754:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__11490);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__2_in_rule__Section__Group__11493);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:761:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:765:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:766:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:766:1: ( ( rule__Section__NameAssignment_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:767:1: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:768:1: ( rule__Section__NameAssignment_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:768:2: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Section__NameAssignment_1_in_rule__Section__Group__1__Impl1520);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:778:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:782:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:783:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__21550);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__3_in_rule__Section__Group__21553);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:790:1: rule__Section__Group__2__Impl : ( 'title' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:794:1: ( ( 'title' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:795:1: ( 'title' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:795:1: ( 'title' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:796:1: 'title'
            {
             before(grammarAccess.getSectionAccess().getTitleKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Section__Group__2__Impl1581); 
             after(grammarAccess.getSectionAccess().getTitleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:809:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:813:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:814:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__31612);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__4_in_rule__Section__Group__31615);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:821:1: rule__Section__Group__3__Impl : ( ( rule__Section__TitleAssignment_3 ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:825:1: ( ( ( rule__Section__TitleAssignment_3 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:826:1: ( ( rule__Section__TitleAssignment_3 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:826:1: ( ( rule__Section__TitleAssignment_3 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:827:1: ( rule__Section__TitleAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_3()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:828:1: ( rule__Section__TitleAssignment_3 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:828:2: rule__Section__TitleAssignment_3
            {
            pushFollow(FOLLOW_rule__Section__TitleAssignment_3_in_rule__Section__Group__3__Impl1642);
            rule__Section__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:838:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:842:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:843:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__41672);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__5_in_rule__Section__Group__41675);
            rule__Section__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:850:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:854:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:855:1: ( ( rule__Section__Group_4__0 )? )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:855:1: ( ( rule__Section__Group_4__0 )? )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:856:1: ( rule__Section__Group_4__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:857:1: ( rule__Section__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:857:2: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl1702);
                    rule__Section__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:867:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:871:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:872:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__51733);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__6_in_rule__Section__Group__51736);
            rule__Section__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:879:1: rule__Section__Group__5__Impl : ( ( rule__Section__PageBreakAssignment_5 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:883:1: ( ( ( rule__Section__PageBreakAssignment_5 )? ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:884:1: ( ( rule__Section__PageBreakAssignment_5 )? )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:884:1: ( ( rule__Section__PageBreakAssignment_5 )? )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:885:1: ( rule__Section__PageBreakAssignment_5 )?
            {
             before(grammarAccess.getSectionAccess().getPageBreakAssignment_5()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:886:1: ( rule__Section__PageBreakAssignment_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:886:2: rule__Section__PageBreakAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Section__PageBreakAssignment_5_in_rule__Section__Group__5__Impl1763);
                    rule__Section__PageBreakAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getPageBreakAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:896:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:900:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:901:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__61794);
            rule__Section__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__7_in_rule__Section__Group__61797);
            rule__Section__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:908:1: rule__Section__Group__6__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:912:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:913:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:913:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:914:1: RULE_OPENCURLY
            {
             before(grammarAccess.getSectionAccess().getOPENCURLYTerminalRuleCall_6()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Section__Group__6__Impl1824); 
             after(grammarAccess.getSectionAccess().getOPENCURLYTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:925:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:929:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:930:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__71853);
            rule__Section__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group__8_in_rule__Section__Group__71856);
            rule__Section__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:937:1: rule__Section__Group__7__Impl : ( ( rule__Section__BodyAssignment_7 )* ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:941:1: ( ( ( rule__Section__BodyAssignment_7 )* ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:942:1: ( ( rule__Section__BodyAssignment_7 )* )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:942:1: ( ( rule__Section__BodyAssignment_7 )* )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:943:1: ( rule__Section__BodyAssignment_7 )*
            {
             before(grammarAccess.getSectionAccess().getBodyAssignment_7()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:944:1: ( rule__Section__BodyAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_OPENCURLY||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:944:2: rule__Section__BodyAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Section__BodyAssignment_7_in_rule__Section__Group__7__Impl1883);
            	    rule__Section__BodyAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group__8"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:954:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:958:1: ( rule__Section__Group__8__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:959:2: rule__Section__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__81914);
            rule__Section__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8"


    // $ANTLR start "rule__Section__Group__8__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:965:1: rule__Section__Group__8__Impl : ( RULE_CLOSECURLY ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:969:1: ( ( RULE_CLOSECURLY ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:970:1: ( RULE_CLOSECURLY )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:970:1: ( RULE_CLOSECURLY )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:971:1: RULE_CLOSECURLY
            {
             before(grammarAccess.getSectionAccess().getCLOSECURLYTerminalRuleCall_8()); 
            match(input,RULE_CLOSECURLY,FOLLOW_RULE_CLOSECURLY_in_rule__Section__Group__8__Impl1941); 
             after(grammarAccess.getSectionAccess().getCLOSECURLYTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1000:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1004:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1005:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__01988);
            rule__Section__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__01991);
            rule__Section__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1012:1: rule__Section__Group_4__0__Impl : ( 'level' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1016:1: ( ( 'level' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1017:1: ( 'level' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1017:1: ( 'level' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1018:1: 'level'
            {
             before(grammarAccess.getSectionAccess().getLevelKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Section__Group_4__0__Impl2019); 
             after(grammarAccess.getSectionAccess().getLevelKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1031:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1035:1: ( rule__Section__Group_4__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1036:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__12050);
            rule__Section__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1042:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__LevelAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1046:1: ( ( ( rule__Section__LevelAssignment_4_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1047:1: ( ( rule__Section__LevelAssignment_4_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1047:1: ( ( rule__Section__LevelAssignment_4_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1048:1: ( rule__Section__LevelAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getLevelAssignment_4_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1049:1: ( rule__Section__LevelAssignment_4_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1049:2: rule__Section__LevelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Section__LevelAssignment_4_1_in_rule__Section__Group_4__1__Impl2077);
            rule__Section__LevelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getLevelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1063:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1067:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1068:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__02111);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__02114);
            rule__Paragraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1075:1: rule__Paragraph__Group__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1079:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1080:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1080:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1081:1: RULE_OPENCURLY
            {
             before(grammarAccess.getParagraphAccess().getOPENCURLYTerminalRuleCall_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Paragraph__Group__0__Impl2141); 
             after(grammarAccess.getParagraphAccess().getOPENCURLYTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1092:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1096:1: ( rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1097:2: rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2
            {
            pushFollow(FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__12170);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Paragraph__Group__2_in_rule__Paragraph__Group__12173);
            rule__Paragraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1104:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__BodyAssignment_1 )* ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1108:1: ( ( ( rule__Paragraph__BodyAssignment_1 )* ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1109:1: ( ( rule__Paragraph__BodyAssignment_1 )* )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1109:1: ( ( rule__Paragraph__BodyAssignment_1 )* )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1110:1: ( rule__Paragraph__BodyAssignment_1 )*
            {
             before(grammarAccess.getParagraphAccess().getBodyAssignment_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1111:1: ( rule__Paragraph__BodyAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=19 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1111:2: rule__Paragraph__BodyAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Paragraph__BodyAssignment_1_in_rule__Paragraph__Group__1__Impl2200);
            	    rule__Paragraph__BodyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getParagraphAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__2"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1121:1: rule__Paragraph__Group__2 : rule__Paragraph__Group__2__Impl ;
    public final void rule__Paragraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1125:1: ( rule__Paragraph__Group__2__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1126:2: rule__Paragraph__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Paragraph__Group__2__Impl_in_rule__Paragraph__Group__22231);
            rule__Paragraph__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__2"


    // $ANTLR start "rule__Paragraph__Group__2__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1132:1: rule__Paragraph__Group__2__Impl : ( RULE_CLOSECURLY ) ;
    public final void rule__Paragraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1136:1: ( ( RULE_CLOSECURLY ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1137:1: ( RULE_CLOSECURLY )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1137:1: ( RULE_CLOSECURLY )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1138:1: RULE_CLOSECURLY
            {
             before(grammarAccess.getParagraphAccess().getCLOSECURLYTerminalRuleCall_2()); 
            match(input,RULE_CLOSECURLY,FOLLOW_RULE_CLOSECURLY_in_rule__Paragraph__Group__2__Impl2258); 
             after(grammarAccess.getParagraphAccess().getCLOSECURLYTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__2__Impl"


    // $ANTLR start "rule__SectionReference__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1155:1: rule__SectionReference__Group__0 : rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1 ;
    public final void rule__SectionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1159:1: ( rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1160:2: rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1
            {
            pushFollow(FOLLOW_rule__SectionReference__Group__0__Impl_in_rule__SectionReference__Group__02293);
            rule__SectionReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SectionReference__Group__1_in_rule__SectionReference__Group__02296);
            rule__SectionReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__0"


    // $ANTLR start "rule__SectionReference__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1167:1: rule__SectionReference__Group__0__Impl : ( 'secRef' ) ;
    public final void rule__SectionReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1171:1: ( ( 'secRef' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1172:1: ( 'secRef' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1172:1: ( 'secRef' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1173:1: 'secRef'
            {
             before(grammarAccess.getSectionReferenceAccess().getSecRefKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SectionReference__Group__0__Impl2324); 
             after(grammarAccess.getSectionReferenceAccess().getSecRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__0__Impl"


    // $ANTLR start "rule__SectionReference__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1186:1: rule__SectionReference__Group__1 : rule__SectionReference__Group__1__Impl ;
    public final void rule__SectionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1190:1: ( rule__SectionReference__Group__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1191:2: rule__SectionReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SectionReference__Group__1__Impl_in_rule__SectionReference__Group__12355);
            rule__SectionReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__1"


    // $ANTLR start "rule__SectionReference__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1197:1: rule__SectionReference__Group__1__Impl : ( ( rule__SectionReference__RefAssignment_1 ) ) ;
    public final void rule__SectionReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1201:1: ( ( ( rule__SectionReference__RefAssignment_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1202:1: ( ( rule__SectionReference__RefAssignment_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1202:1: ( ( rule__SectionReference__RefAssignment_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1203:1: ( rule__SectionReference__RefAssignment_1 )
            {
             before(grammarAccess.getSectionReferenceAccess().getRefAssignment_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1204:1: ( rule__SectionReference__RefAssignment_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1204:2: rule__SectionReference__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__SectionReference__RefAssignment_1_in_rule__SectionReference__Group__1__Impl2382);
            rule__SectionReference__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionReferenceAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__Group__1__Impl"


    // $ANTLR start "rule__ImgReference__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1218:1: rule__ImgReference__Group__0 : rule__ImgReference__Group__0__Impl rule__ImgReference__Group__1 ;
    public final void rule__ImgReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1222:1: ( rule__ImgReference__Group__0__Impl rule__ImgReference__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1223:2: rule__ImgReference__Group__0__Impl rule__ImgReference__Group__1
            {
            pushFollow(FOLLOW_rule__ImgReference__Group__0__Impl_in_rule__ImgReference__Group__02416);
            rule__ImgReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImgReference__Group__1_in_rule__ImgReference__Group__02419);
            rule__ImgReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImgReference__Group__0"


    // $ANTLR start "rule__ImgReference__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1230:1: rule__ImgReference__Group__0__Impl : ( 'imgRef' ) ;
    public final void rule__ImgReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1234:1: ( ( 'imgRef' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1235:1: ( 'imgRef' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1235:1: ( 'imgRef' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1236:1: 'imgRef'
            {
             before(grammarAccess.getImgReferenceAccess().getImgRefKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ImgReference__Group__0__Impl2447); 
             after(grammarAccess.getImgReferenceAccess().getImgRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImgReference__Group__0__Impl"


    // $ANTLR start "rule__ImgReference__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1249:1: rule__ImgReference__Group__1 : rule__ImgReference__Group__1__Impl ;
    public final void rule__ImgReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1253:1: ( rule__ImgReference__Group__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1254:2: rule__ImgReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImgReference__Group__1__Impl_in_rule__ImgReference__Group__12478);
            rule__ImgReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImgReference__Group__1"


    // $ANTLR start "rule__ImgReference__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1260:1: rule__ImgReference__Group__1__Impl : ( ( rule__ImgReference__RefAssignment_1 ) ) ;
    public final void rule__ImgReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1264:1: ( ( ( rule__ImgReference__RefAssignment_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1265:1: ( ( rule__ImgReference__RefAssignment_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1265:1: ( ( rule__ImgReference__RefAssignment_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1266:1: ( rule__ImgReference__RefAssignment_1 )
            {
             before(grammarAccess.getImgReferenceAccess().getRefAssignment_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1267:1: ( rule__ImgReference__RefAssignment_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1267:2: rule__ImgReference__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__ImgReference__RefAssignment_1_in_rule__ImgReference__Group__1__Impl2505);
            rule__ImgReference__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImgReferenceAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImgReference__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1282:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1286:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1287:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__02540);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__1_in_rule__Image__Group__02543);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1294:1: rule__Image__Group__0__Impl : ( 'image' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1298:1: ( ( 'image' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1299:1: ( 'image' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1299:1: ( 'image' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1300:1: 'image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Image__Group__0__Impl2571); 
             after(grammarAccess.getImageAccess().getImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1313:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1317:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1318:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__12602);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__2_in_rule__Image__Group__12605);
            rule__Image__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1325:1: rule__Image__Group__1__Impl : ( ( rule__Image__UrlAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1329:1: ( ( ( rule__Image__UrlAssignment_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1330:1: ( ( rule__Image__UrlAssignment_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1330:1: ( ( rule__Image__UrlAssignment_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1331:1: ( rule__Image__UrlAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1332:1: ( rule__Image__UrlAssignment_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1332:2: rule__Image__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__Image__UrlAssignment_1_in_rule__Image__Group__1__Impl2632);
            rule__Image__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1342:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1346:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1347:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__22662);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__3_in_rule__Image__Group__22665);
            rule__Image__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1354:1: rule__Image__Group__2__Impl : ( 'name' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1358:1: ( ( 'name' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1359:1: ( 'name' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1359:1: ( 'name' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1360:1: 'name'
            {
             before(grammarAccess.getImageAccess().getNameKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Image__Group__2__Impl2693); 
             after(grammarAccess.getImageAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1373:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1377:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1378:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__32724);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__4_in_rule__Image__Group__32727);
            rule__Image__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1385:1: rule__Image__Group__3__Impl : ( ( rule__Image__NameAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1389:1: ( ( ( rule__Image__NameAssignment_3 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1390:1: ( ( rule__Image__NameAssignment_3 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1390:1: ( ( rule__Image__NameAssignment_3 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1391:1: ( rule__Image__NameAssignment_3 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_3()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1392:1: ( rule__Image__NameAssignment_3 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1392:2: rule__Image__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Image__NameAssignment_3_in_rule__Image__Group__3__Impl2754);
            rule__Image__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1402:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1406:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1407:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__42784);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__5_in_rule__Image__Group__42787);
            rule__Image__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1414:1: rule__Image__Group__4__Impl : ( 'caption' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1418:1: ( ( 'caption' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1419:1: ( 'caption' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1419:1: ( 'caption' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1420:1: 'caption'
            {
             before(grammarAccess.getImageAccess().getCaptionKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Image__Group__4__Impl2815); 
             after(grammarAccess.getImageAccess().getCaptionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__5"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1433:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1437:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1438:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__52846);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__6_in_rule__Image__Group__52849);
            rule__Image__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5"


    // $ANTLR start "rule__Image__Group__5__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1445:1: rule__Image__Group__5__Impl : ( ( rule__Image__CaptionAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1449:1: ( ( ( rule__Image__CaptionAssignment_5 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1450:1: ( ( rule__Image__CaptionAssignment_5 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1450:1: ( ( rule__Image__CaptionAssignment_5 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1451:1: ( rule__Image__CaptionAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getCaptionAssignment_5()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1452:1: ( rule__Image__CaptionAssignment_5 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1452:2: rule__Image__CaptionAssignment_5
            {
            pushFollow(FOLLOW_rule__Image__CaptionAssignment_5_in_rule__Image__Group__5__Impl2876);
            rule__Image__CaptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getCaptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5__Impl"


    // $ANTLR start "rule__Image__Group__6"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1462:1: rule__Image__Group__6 : rule__Image__Group__6__Impl rule__Image__Group__7 ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1466:1: ( rule__Image__Group__6__Impl rule__Image__Group__7 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1467:2: rule__Image__Group__6__Impl rule__Image__Group__7
            {
            pushFollow(FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__62906);
            rule__Image__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__7_in_rule__Image__Group__62909);
            rule__Image__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6"


    // $ANTLR start "rule__Image__Group__6__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1474:1: rule__Image__Group__6__Impl : ( ( rule__Image__Group_6__0 )? ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1478:1: ( ( ( rule__Image__Group_6__0 )? ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1479:1: ( ( rule__Image__Group_6__0 )? )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1479:1: ( ( rule__Image__Group_6__0 )? )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1480:1: ( rule__Image__Group_6__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_6()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1481:1: ( rule__Image__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1481:2: rule__Image__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_6__0_in_rule__Image__Group__6__Impl2936);
                    rule__Image__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6__Impl"


    // $ANTLR start "rule__Image__Group__7"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1491:1: rule__Image__Group__7 : rule__Image__Group__7__Impl ;
    public final void rule__Image__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1495:1: ( rule__Image__Group__7__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1496:2: rule__Image__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__72967);
            rule__Image__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__7"


    // $ANTLR start "rule__Image__Group__7__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1502:1: rule__Image__Group__7__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Image__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1506:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1507:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1507:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1508:1: RULE_ENDLINE
            {
             before(grammarAccess.getImageAccess().getENDLINETerminalRuleCall_7()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__Image__Group__7__Impl2994); 
             after(grammarAccess.getImageAccess().getENDLINETerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__7__Impl"


    // $ANTLR start "rule__Image__Group_6__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1535:1: rule__Image__Group_6__0 : rule__Image__Group_6__0__Impl rule__Image__Group_6__1 ;
    public final void rule__Image__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1539:1: ( rule__Image__Group_6__0__Impl rule__Image__Group_6__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1540:2: rule__Image__Group_6__0__Impl rule__Image__Group_6__1
            {
            pushFollow(FOLLOW_rule__Image__Group_6__0__Impl_in_rule__Image__Group_6__03039);
            rule__Image__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_6__1_in_rule__Image__Group_6__03042);
            rule__Image__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6__0"


    // $ANTLR start "rule__Image__Group_6__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1547:1: rule__Image__Group_6__0__Impl : ( ( rule__Image__Group_6_0__0 ) ) ;
    public final void rule__Image__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1551:1: ( ( ( rule__Image__Group_6_0__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1552:1: ( ( rule__Image__Group_6_0__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1552:1: ( ( rule__Image__Group_6_0__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1553:1: ( rule__Image__Group_6_0__0 )
            {
             before(grammarAccess.getImageAccess().getGroup_6_0()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1554:1: ( rule__Image__Group_6_0__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1554:2: rule__Image__Group_6_0__0
            {
            pushFollow(FOLLOW_rule__Image__Group_6_0__0_in_rule__Image__Group_6__0__Impl3069);
            rule__Image__Group_6_0__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6__0__Impl"


    // $ANTLR start "rule__Image__Group_6__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1564:1: rule__Image__Group_6__1 : rule__Image__Group_6__1__Impl ;
    public final void rule__Image__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1568:1: ( rule__Image__Group_6__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1569:2: rule__Image__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_6__1__Impl_in_rule__Image__Group_6__13099);
            rule__Image__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6__1"


    // $ANTLR start "rule__Image__Group_6__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1575:1: rule__Image__Group_6__1__Impl : ( ( rule__Image__Group_6_1__0 ) ) ;
    public final void rule__Image__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1579:1: ( ( ( rule__Image__Group_6_1__0 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1580:1: ( ( rule__Image__Group_6_1__0 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1580:1: ( ( rule__Image__Group_6_1__0 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1581:1: ( rule__Image__Group_6_1__0 )
            {
             before(grammarAccess.getImageAccess().getGroup_6_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1582:1: ( rule__Image__Group_6_1__0 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1582:2: rule__Image__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__Image__Group_6_1__0_in_rule__Image__Group_6__1__Impl3126);
            rule__Image__Group_6_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6__1__Impl"


    // $ANTLR start "rule__Image__Group_6_0__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1596:1: rule__Image__Group_6_0__0 : rule__Image__Group_6_0__0__Impl rule__Image__Group_6_0__1 ;
    public final void rule__Image__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1600:1: ( rule__Image__Group_6_0__0__Impl rule__Image__Group_6_0__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1601:2: rule__Image__Group_6_0__0__Impl rule__Image__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__Image__Group_6_0__0__Impl_in_rule__Image__Group_6_0__03160);
            rule__Image__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_6_0__1_in_rule__Image__Group_6_0__03163);
            rule__Image__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_0__0"


    // $ANTLR start "rule__Image__Group_6_0__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1608:1: rule__Image__Group_6_0__0__Impl : ( 'width' ) ;
    public final void rule__Image__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1612:1: ( ( 'width' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1613:1: ( 'width' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1613:1: ( 'width' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1614:1: 'width'
            {
             before(grammarAccess.getImageAccess().getWidthKeyword_6_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Image__Group_6_0__0__Impl3191); 
             after(grammarAccess.getImageAccess().getWidthKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_0__0__Impl"


    // $ANTLR start "rule__Image__Group_6_0__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1627:1: rule__Image__Group_6_0__1 : rule__Image__Group_6_0__1__Impl ;
    public final void rule__Image__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1631:1: ( rule__Image__Group_6_0__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1632:2: rule__Image__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_6_0__1__Impl_in_rule__Image__Group_6_0__13222);
            rule__Image__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_0__1"


    // $ANTLR start "rule__Image__Group_6_0__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1638:1: rule__Image__Group_6_0__1__Impl : ( ( rule__Image__WidthAssignment_6_0_1 ) ) ;
    public final void rule__Image__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1642:1: ( ( ( rule__Image__WidthAssignment_6_0_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1643:1: ( ( rule__Image__WidthAssignment_6_0_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1643:1: ( ( rule__Image__WidthAssignment_6_0_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1644:1: ( rule__Image__WidthAssignment_6_0_1 )
            {
             before(grammarAccess.getImageAccess().getWidthAssignment_6_0_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1645:1: ( rule__Image__WidthAssignment_6_0_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1645:2: rule__Image__WidthAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__Image__WidthAssignment_6_0_1_in_rule__Image__Group_6_0__1__Impl3249);
            rule__Image__WidthAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getWidthAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_0__1__Impl"


    // $ANTLR start "rule__Image__Group_6_1__0"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1659:1: rule__Image__Group_6_1__0 : rule__Image__Group_6_1__0__Impl rule__Image__Group_6_1__1 ;
    public final void rule__Image__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1663:1: ( rule__Image__Group_6_1__0__Impl rule__Image__Group_6_1__1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1664:2: rule__Image__Group_6_1__0__Impl rule__Image__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Image__Group_6_1__0__Impl_in_rule__Image__Group_6_1__03283);
            rule__Image__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_6_1__1_in_rule__Image__Group_6_1__03286);
            rule__Image__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_1__0"


    // $ANTLR start "rule__Image__Group_6_1__0__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1671:1: rule__Image__Group_6_1__0__Impl : ( 'height' ) ;
    public final void rule__Image__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1675:1: ( ( 'height' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1676:1: ( 'height' )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1676:1: ( 'height' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1677:1: 'height'
            {
             before(grammarAccess.getImageAccess().getHeightKeyword_6_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group_6_1__0__Impl3314); 
             after(grammarAccess.getImageAccess().getHeightKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_1__0__Impl"


    // $ANTLR start "rule__Image__Group_6_1__1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1690:1: rule__Image__Group_6_1__1 : rule__Image__Group_6_1__1__Impl ;
    public final void rule__Image__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1694:1: ( rule__Image__Group_6_1__1__Impl )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1695:2: rule__Image__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_6_1__1__Impl_in_rule__Image__Group_6_1__13345);
            rule__Image__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_1__1"


    // $ANTLR start "rule__Image__Group_6_1__1__Impl"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1701:1: rule__Image__Group_6_1__1__Impl : ( ( rule__Image__HeightAssignment_6_1_1 ) ) ;
    public final void rule__Image__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1705:1: ( ( ( rule__Image__HeightAssignment_6_1_1 ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1706:1: ( ( rule__Image__HeightAssignment_6_1_1 ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1706:1: ( ( rule__Image__HeightAssignment_6_1_1 ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1707:1: ( rule__Image__HeightAssignment_6_1_1 )
            {
             before(grammarAccess.getImageAccess().getHeightAssignment_6_1_1()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1708:1: ( rule__Image__HeightAssignment_6_1_1 )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1708:2: rule__Image__HeightAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Image__HeightAssignment_6_1_1_in_rule__Image__Group_6_1__1__Impl3372);
            rule__Image__HeightAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getHeightAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_6_1__1__Impl"


    // $ANTLR start "rule__Doc__NameAssignment_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1723:1: rule__Doc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Doc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1727:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1728:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1728:1: ( RULE_ID )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1729:1: RULE_ID
            {
             before(grammarAccess.getDocAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Doc__NameAssignment_13411); 
             after(grammarAccess.getDocAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__NameAssignment_1"


    // $ANTLR start "rule__Doc__SectionsAssignment_3"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1738:1: rule__Doc__SectionsAssignment_3 : ( ruleSection ) ;
    public final void rule__Doc__SectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1742:1: ( ( ruleSection ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1743:1: ( ruleSection )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1743:1: ( ruleSection )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1744:1: ruleSection
            {
             before(grammarAccess.getDocAccess().getSectionsSectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Doc__SectionsAssignment_33442);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getDocAccess().getSectionsSectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__SectionsAssignment_3"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1753:1: rule__Section__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1757:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1758:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1758:1: ( RULE_ID )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1759:1: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section__NameAssignment_13473); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__TitleAssignment_3"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1768:1: rule__Section__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Section__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1772:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1773:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1773:1: ( RULE_STRING )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1774:1: RULE_STRING
            {
             before(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Section__TitleAssignment_33504); 
             after(grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TitleAssignment_3"


    // $ANTLR start "rule__Section__LevelAssignment_4_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1783:1: rule__Section__LevelAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Section__LevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1787:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1788:1: ( RULE_INT )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1788:1: ( RULE_INT )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1789:1: RULE_INT
            {
             before(grammarAccess.getSectionAccess().getLevelINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Section__LevelAssignment_4_13535); 
             after(grammarAccess.getSectionAccess().getLevelINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__LevelAssignment_4_1"


    // $ANTLR start "rule__Section__PageBreakAssignment_5"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1798:1: rule__Section__PageBreakAssignment_5 : ( ( 'pagebreak' ) ) ;
    public final void rule__Section__PageBreakAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1802:1: ( ( ( 'pagebreak' ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1803:1: ( ( 'pagebreak' ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1803:1: ( ( 'pagebreak' ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1804:1: ( 'pagebreak' )
            {
             before(grammarAccess.getSectionAccess().getPageBreakPagebreakKeyword_5_0()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1805:1: ( 'pagebreak' )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1806:1: 'pagebreak'
            {
             before(grammarAccess.getSectionAccess().getPageBreakPagebreakKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__Section__PageBreakAssignment_53571); 
             after(grammarAccess.getSectionAccess().getPageBreakPagebreakKeyword_5_0()); 

            }

             after(grammarAccess.getSectionAccess().getPageBreakPagebreakKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__PageBreakAssignment_5"


    // $ANTLR start "rule__Section__BodyAssignment_7"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1821:1: rule__Section__BodyAssignment_7 : ( ruleDocItem ) ;
    public final void rule__Section__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1825:1: ( ( ruleDocItem ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1826:1: ( ruleDocItem )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1826:1: ( ruleDocItem )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1827:1: ruleDocItem
            {
             before(grammarAccess.getSectionAccess().getBodyDocItemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDocItem_in_rule__Section__BodyAssignment_73610);
            ruleDocItem();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getBodyDocItemParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__BodyAssignment_7"


    // $ANTLR start "rule__Paragraph__BodyAssignment_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1836:1: rule__Paragraph__BodyAssignment_1 : ( ruleParagraphItem ) ;
    public final void rule__Paragraph__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1840:1: ( ( ruleParagraphItem ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1841:1: ( ruleParagraphItem )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1841:1: ( ruleParagraphItem )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1842:1: ruleParagraphItem
            {
             before(grammarAccess.getParagraphAccess().getBodyParagraphItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParagraphItem_in_rule__Paragraph__BodyAssignment_13641);
            ruleParagraphItem();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getBodyParagraphItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__BodyAssignment_1"


    // $ANTLR start "rule__SectionReference__RefAssignment_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1851:1: rule__SectionReference__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SectionReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1855:1: ( ( ( RULE_ID ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1856:1: ( ( RULE_ID ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1856:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1857:1: ( RULE_ID )
            {
             before(grammarAccess.getSectionReferenceAccess().getRefSectionCrossReference_1_0()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1858:1: ( RULE_ID )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1859:1: RULE_ID
            {
             before(grammarAccess.getSectionReferenceAccess().getRefSectionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SectionReference__RefAssignment_13676); 
             after(grammarAccess.getSectionReferenceAccess().getRefSectionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSectionReferenceAccess().getRefSectionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SectionReference__RefAssignment_1"


    // $ANTLR start "rule__ImgReference__RefAssignment_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1870:1: rule__ImgReference__RefAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ImgReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1874:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1875:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1875:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1876:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getImgReferenceAccess().getRefImageCrossReference_1_0()); 
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1877:1: ( ruleQualifiedName )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1878:1: ruleQualifiedName
            {
             before(grammarAccess.getImgReferenceAccess().getRefImageQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ImgReference__RefAssignment_13715);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImgReferenceAccess().getRefImageQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImgReferenceAccess().getRefImageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImgReference__RefAssignment_1"


    // $ANTLR start "rule__Image__UrlAssignment_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1890:1: rule__Image__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Image__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1894:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1895:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1895:1: ( RULE_STRING )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1896:1: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Image__UrlAssignment_13751); 
             after(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__UrlAssignment_1"


    // $ANTLR start "rule__Image__NameAssignment_3"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1905:1: rule__Image__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Image__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1909:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1910:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1910:1: ( RULE_ID )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1911:1: RULE_ID
            {
             before(grammarAccess.getImageAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Image__NameAssignment_33782); 
             after(grammarAccess.getImageAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__NameAssignment_3"


    // $ANTLR start "rule__Image__CaptionAssignment_5"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1920:1: rule__Image__CaptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Image__CaptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1924:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1925:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1925:1: ( RULE_STRING )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1926:1: RULE_STRING
            {
             before(grammarAccess.getImageAccess().getCaptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Image__CaptionAssignment_53813); 
             after(grammarAccess.getImageAccess().getCaptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__CaptionAssignment_5"


    // $ANTLR start "rule__Image__WidthAssignment_6_0_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1935:1: rule__Image__WidthAssignment_6_0_1 : ( RULE_INT ) ;
    public final void rule__Image__WidthAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1939:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1940:1: ( RULE_INT )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1940:1: ( RULE_INT )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1941:1: RULE_INT
            {
             before(grammarAccess.getImageAccess().getWidthINTTerminalRuleCall_6_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Image__WidthAssignment_6_0_13844); 
             after(grammarAccess.getImageAccess().getWidthINTTerminalRuleCall_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__WidthAssignment_6_0_1"


    // $ANTLR start "rule__Image__HeightAssignment_6_1_1"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1950:1: rule__Image__HeightAssignment_6_1_1 : ( RULE_INT ) ;
    public final void rule__Image__HeightAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1954:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1955:1: ( RULE_INT )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1955:1: ( RULE_INT )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1956:1: RULE_INT
            {
             before(grammarAccess.getImageAccess().getHeightINTTerminalRuleCall_6_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Image__HeightAssignment_6_1_13875); 
             after(grammarAccess.getImageAccess().getHeightINTTerminalRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__HeightAssignment_6_1_1"


    // $ANTLR start "rule__Text__ContentAssignment"
    // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1965:1: rule__Text__ContentAssignment : ( RULE_STRING ) ;
    public final void rule__Text__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1969:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1970:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1970:1: ( RULE_STRING )
            // ../com.lowcoupling.dono.ui/src-gen/com/lowcoupling/dono/ui/contentassist/antlr/internal/InternalDono.g:1971:1: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Text__ContentAssignment3906); 
             after(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ContentAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDoc_in_entryRuleDoc61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoc68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__Group__0_in_ruleDoc94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0_in_ruleSection214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItem_in_entryRuleDocItem241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocItem248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DocItem__Alternatives_in_ruleDocItem274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphItem_in_entryRuleParagraphItem301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraphItem308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParagraphItem__Alternatives_in_ruleParagraphItem334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Paragraph__Group__0_in_ruleParagraph394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Alternatives_in_ruleReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReference_in_entryRuleSectionReference481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionReference488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionReference__Group__0_in_ruleSectionReference514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImgReference_in_entryRuleImgReference541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImgReference548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImgReference__Group__0_in_ruleImgReference574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0_in_ruleImage636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ContentAssignment_in_ruleText696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_rule__DocItem__Alternatives732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_rule__DocItem__Alternatives749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ParagraphItem__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__ParagraphItem__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReference_in_rule__Reference__Alternatives830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImgReference_in_rule__Reference__Alternatives847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__Group__0__Impl_in_rule__Doc__Group__0877 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Doc__Group__1_in_rule__Doc__Group__0880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Doc__Group__0__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__Group__1__Impl_in_rule__Doc__Group__1939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Doc__Group__2_in_rule__Doc__Group__1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__NameAssignment_1_in_rule__Doc__Group__1__Impl969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__Group__2__Impl_in_rule__Doc__Group__2999 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_rule__Doc__Group__3_in_rule__Doc__Group__21002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Doc__Group__2__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__Group__3__Impl_in_rule__Doc__Group__31058 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_rule__Doc__Group__4_in_rule__Doc__Group__31061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Doc__SectionsAssignment_3_in_rule__Doc__Group__3__Impl1088 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Doc__Group__4__Impl_in_rule__Doc__Group__41119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSECURLY_in_rule__Doc__Group__4__Impl1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1271 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__0__Impl_in_rule__Section__Group__01428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Section__Group__1_in_rule__Section__Group__01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Section__Group__0__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__1__Impl_in_rule__Section__Group__11490 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Section__Group__2_in_rule__Section__Group__11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__NameAssignment_1_in_rule__Section__Group__1__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__2__Impl_in_rule__Section__Group__21550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Section__Group__3_in_rule__Section__Group__21553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Section__Group__2__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__3__Impl_in_rule__Section__Group__31612 = new BitSet(new long[]{0x0000000004040010L});
    public static final BitSet FOLLOW_rule__Section__Group__4_in_rule__Section__Group__31615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__TitleAssignment_3_in_rule__Section__Group__3__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__4__Impl_in_rule__Section__Group__41672 = new BitSet(new long[]{0x0000000004040010L});
    public static final BitSet FOLLOW_rule__Section__Group__5_in_rule__Section__Group__41675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0_in_rule__Section__Group__4__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__5__Impl_in_rule__Section__Group__51733 = new BitSet(new long[]{0x0000000004040010L});
    public static final BitSet FOLLOW_rule__Section__Group__6_in_rule__Section__Group__51736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__PageBreakAssignment_5_in_rule__Section__Group__5__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__6__Impl_in_rule__Section__Group__61794 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__Section__Group__7_in_rule__Section__Group__61797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Section__Group__6__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group__7__Impl_in_rule__Section__Group__71853 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_rule__Section__Group__8_in_rule__Section__Group__71856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__BodyAssignment_7_in_rule__Section__Group__7__Impl1883 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_rule__Section__Group__8__Impl_in_rule__Section__Group__81914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSECURLY_in_rule__Section__Group__8__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__0__Impl_in_rule__Section__Group_4__01988 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1_in_rule__Section__Group_4__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Section__Group_4__0__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Group_4__1__Impl_in_rule__Section__Group_4__12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__LevelAssignment_4_1_in_rule__Section__Group_4__1__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__02111 = new BitSet(new long[]{0x0000000000180120L});
    public static final BitSet FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__02114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Paragraph__Group__0__Impl2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__12170 = new BitSet(new long[]{0x0000000000180120L});
    public static final BitSet FOLLOW_rule__Paragraph__Group__2_in_rule__Paragraph__Group__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Paragraph__BodyAssignment_1_in_rule__Paragraph__Group__1__Impl2200 = new BitSet(new long[]{0x0000000000180102L});
    public static final BitSet FOLLOW_rule__Paragraph__Group__2__Impl_in_rule__Paragraph__Group__22231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSECURLY_in_rule__Paragraph__Group__2__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionReference__Group__0__Impl_in_rule__SectionReference__Group__02293 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SectionReference__Group__1_in_rule__SectionReference__Group__02296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SectionReference__Group__0__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionReference__Group__1__Impl_in_rule__SectionReference__Group__12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SectionReference__RefAssignment_1_in_rule__SectionReference__Group__1__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImgReference__Group__0__Impl_in_rule__ImgReference__Group__02416 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ImgReference__Group__1_in_rule__ImgReference__Group__02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImgReference__Group__0__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImgReference__Group__1__Impl_in_rule__ImgReference__Group__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImgReference__RefAssignment_1_in_rule__ImgReference__Group__1__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__02540 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Image__Group__1_in_rule__Image__Group__02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Image__Group__0__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__12602 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Image__Group__2_in_rule__Image__Group__12605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__UrlAssignment_1_in_rule__Image__Group__1__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__22662 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Image__Group__3_in_rule__Image__Group__22665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Image__Group__2__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__32724 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Image__Group__4_in_rule__Image__Group__32727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__NameAssignment_3_in_rule__Image__Group__3__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__42784 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Image__Group__5_in_rule__Image__Group__42787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Image__Group__4__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__52846 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_rule__Image__Group__6_in_rule__Image__Group__52849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__CaptionAssignment_5_in_rule__Image__Group__5__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__62906 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_rule__Image__Group__7_in_rule__Image__Group__62909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6__0_in_rule__Image__Group__6__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__72967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__Image__Group__7__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6__0__Impl_in_rule__Image__Group_6__03039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Image__Group_6__1_in_rule__Image__Group_6__03042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6_0__0_in_rule__Image__Group_6__0__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6__1__Impl_in_rule__Image__Group_6__13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6_1__0_in_rule__Image__Group_6__1__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6_0__0__Impl_in_rule__Image__Group_6_0__03160 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Image__Group_6_0__1_in_rule__Image__Group_6_0__03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Image__Group_6_0__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6_0__1__Impl_in_rule__Image__Group_6_0__13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__WidthAssignment_6_0_1_in_rule__Image__Group_6_0__1__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6_1__0__Impl_in_rule__Image__Group_6_1__03283 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Image__Group_6_1__1_in_rule__Image__Group_6_1__03286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group_6_1__0__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_6_1__1__Impl_in_rule__Image__Group_6_1__13345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__HeightAssignment_6_1_1_in_rule__Image__Group_6_1__1__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Doc__NameAssignment_13411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Doc__SectionsAssignment_33442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section__NameAssignment_13473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Section__TitleAssignment_33504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Section__LevelAssignment_4_13535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Section__PageBreakAssignment_53571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItem_in_rule__Section__BodyAssignment_73610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphItem_in_rule__Paragraph__BodyAssignment_13641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SectionReference__RefAssignment_13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ImgReference__RefAssignment_13715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Image__UrlAssignment_13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Image__NameAssignment_33782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Image__CaptionAssignment_53813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Image__WidthAssignment_6_0_13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Image__HeightAssignment_6_1_13875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Text__ContentAssignment3906 = new BitSet(new long[]{0x0000000000000002L});

}