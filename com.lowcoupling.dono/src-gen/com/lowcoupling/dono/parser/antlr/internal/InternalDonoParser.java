package com.lowcoupling.dono.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.dono.services.DonoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDonoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OPENCURLY", "RULE_CLOSECURLY", "RULE_STRING", "RULE_INT", "RULE_ENDLINE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'doc'", "'.'", "'section'", "'title'", "'level'", "'pagebreak'", "'secRef'", "'imgRef'", "'image'", "'name'", "'caption'", "'width'", "'height'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_ENDLINE=9;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int RULE_CLOSECURLY=6;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=8;
    public static final int RULE_OPENCURLY=5;
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
    public String getGrammarFileName() { return "../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g"; }



     	private DonoGrammarAccess grammarAccess;
     	
        public InternalDonoParser(TokenStream input, DonoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Doc";	
       	}
       	
       	@Override
       	protected DonoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDoc"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:67:1: entryRuleDoc returns [EObject current=null] : iv_ruleDoc= ruleDoc EOF ;
    public final EObject entryRuleDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoc = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:68:2: (iv_ruleDoc= ruleDoc EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:69:2: iv_ruleDoc= ruleDoc EOF
            {
             newCompositeNode(grammarAccess.getDocRule()); 
            pushFollow(FOLLOW_ruleDoc_in_entryRuleDoc75);
            iv_ruleDoc=ruleDoc();

            state._fsp--;

             current =iv_ruleDoc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoc85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoc"


    // $ANTLR start "ruleDoc"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:76:1: ruleDoc returns [EObject current=null] : (otherlv_0= 'doc' ( (lv_name_1_0= RULE_ID ) ) this_OPENCURLY_2= RULE_OPENCURLY ( (lv_sections_3_0= ruleSection ) )* this_CLOSECURLY_4= RULE_CLOSECURLY ) ;
    public final EObject ruleDoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_OPENCURLY_2=null;
        Token this_CLOSECURLY_4=null;
        EObject lv_sections_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:79:28: ( (otherlv_0= 'doc' ( (lv_name_1_0= RULE_ID ) ) this_OPENCURLY_2= RULE_OPENCURLY ( (lv_sections_3_0= ruleSection ) )* this_CLOSECURLY_4= RULE_CLOSECURLY ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:80:1: (otherlv_0= 'doc' ( (lv_name_1_0= RULE_ID ) ) this_OPENCURLY_2= RULE_OPENCURLY ( (lv_sections_3_0= ruleSection ) )* this_CLOSECURLY_4= RULE_CLOSECURLY )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:80:1: (otherlv_0= 'doc' ( (lv_name_1_0= RULE_ID ) ) this_OPENCURLY_2= RULE_OPENCURLY ( (lv_sections_3_0= ruleSection ) )* this_CLOSECURLY_4= RULE_CLOSECURLY )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:80:3: otherlv_0= 'doc' ( (lv_name_1_0= RULE_ID ) ) this_OPENCURLY_2= RULE_OPENCURLY ( (lv_sections_3_0= ruleSection ) )* this_CLOSECURLY_4= RULE_CLOSECURLY
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDoc122); 

                	newLeafNode(otherlv_0, grammarAccess.getDocAccess().getDocKeyword_0());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:85:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoc139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDocAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDocRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_2=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleDoc155); 
             
                newLeafNode(this_OPENCURLY_2, grammarAccess.getDocAccess().getOPENCURLYTerminalRuleCall_2()); 
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:106:1: ( (lv_sections_3_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:107:1: (lv_sections_3_0= ruleSection )
            	    {
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:107:1: (lv_sections_3_0= ruleSection )
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:108:3: lv_sections_3_0= ruleSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocAccess().getSectionsSectionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleDoc175);
            	    lv_sections_3_0=ruleSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_3_0, 
            	            		"Section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_CLOSECURLY_4=(Token)match(input,RULE_CLOSECURLY,FOLLOW_RULE_CLOSECURLY_in_ruleDoc187); 
             
                newLeafNode(this_CLOSECURLY_4, grammarAccess.getDocAccess().getCLOSECURLYTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoc"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:136:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:137:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:138:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName223);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:145:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:148:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:149:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName274); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:156:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:157:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName293); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName308); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSection"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:177:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:178:2: (iv_ruleSection= ruleSection EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:179:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection355);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:186:1: ruleSection returns [EObject current=null] : (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) ) )? ( (lv_pageBreak_6_0= 'pagebreak' ) )? this_OPENCURLY_7= RULE_OPENCURLY ( (lv_body_8_0= ruleDocItem ) )* this_CLOSECURLY_9= RULE_CLOSECURLY ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_title_3_0=null;
        Token otherlv_4=null;
        Token lv_level_5_0=null;
        Token lv_pageBreak_6_0=null;
        Token this_OPENCURLY_7=null;
        Token this_CLOSECURLY_9=null;
        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:189:28: ( (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) ) )? ( (lv_pageBreak_6_0= 'pagebreak' ) )? this_OPENCURLY_7= RULE_OPENCURLY ( (lv_body_8_0= ruleDocItem ) )* this_CLOSECURLY_9= RULE_CLOSECURLY ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:190:1: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) ) )? ( (lv_pageBreak_6_0= 'pagebreak' ) )? this_OPENCURLY_7= RULE_OPENCURLY ( (lv_body_8_0= ruleDocItem ) )* this_CLOSECURLY_9= RULE_CLOSECURLY )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:190:1: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) ) )? ( (lv_pageBreak_6_0= 'pagebreak' ) )? this_OPENCURLY_7= RULE_OPENCURLY ( (lv_body_8_0= ruleDocItem ) )* this_CLOSECURLY_9= RULE_CLOSECURLY )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:190:3: otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) (otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) ) )? ( (lv_pageBreak_6_0= 'pagebreak' ) )? this_OPENCURLY_7= RULE_OPENCURLY ( (lv_body_8_0= ruleDocItem ) )* this_CLOSECURLY_9= RULE_CLOSECURLY
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSection402); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:194:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:195:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:195:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection419); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSection436); 

                	newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getTitleKeyword_2());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:216:1: ( (lv_title_3_0= RULE_STRING ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:217:1: (lv_title_3_0= RULE_STRING )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:217:1: (lv_title_3_0= RULE_STRING )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:218:3: lv_title_3_0= RULE_STRING
            {
            lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSection453); 

            			newLeafNode(lv_title_3_0, grammarAccess.getSectionAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:234:2: (otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:234:4: otherlv_4= 'level' ( (lv_level_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSection471); 

                        	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getLevelKeyword_4_0());
                        
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:238:1: ( (lv_level_5_0= RULE_INT ) )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:239:1: (lv_level_5_0= RULE_INT )
                    {
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:239:1: (lv_level_5_0= RULE_INT )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:240:3: lv_level_5_0= RULE_INT
                    {
                    lv_level_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSection488); 

                    			newLeafNode(lv_level_5_0, grammarAccess.getSectionAccess().getLevelINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"level",
                            		lv_level_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:256:4: ( (lv_pageBreak_6_0= 'pagebreak' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:257:1: (lv_pageBreak_6_0= 'pagebreak' )
                    {
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:257:1: (lv_pageBreak_6_0= 'pagebreak' )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:258:3: lv_pageBreak_6_0= 'pagebreak'
                    {
                    lv_pageBreak_6_0=(Token)match(input,19,FOLLOW_19_in_ruleSection513); 

                            newLeafNode(lv_pageBreak_6_0, grammarAccess.getSectionAccess().getPageBreakPagebreakKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(current, "pageBreak", lv_pageBreak_6_0, "pagebreak");
                    	    

                    }


                    }
                    break;

            }

            this_OPENCURLY_7=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleSection538); 
             
                newLeafNode(this_OPENCURLY_7, grammarAccess.getSectionAccess().getOPENCURLYTerminalRuleCall_6()); 
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:275:1: ( (lv_body_8_0= ruleDocItem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_OPENCURLY||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:276:1: (lv_body_8_0= ruleDocItem )
            	    {
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:276:1: (lv_body_8_0= ruleDocItem )
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:277:3: lv_body_8_0= ruleDocItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSectionAccess().getBodyDocItemParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDocItem_in_ruleSection558);
            	    lv_body_8_0=ruleDocItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_8_0, 
            	            		"DocItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_CLOSECURLY_9=(Token)match(input,RULE_CLOSECURLY,FOLLOW_RULE_CLOSECURLY_in_ruleSection570); 
             
                newLeafNode(this_CLOSECURLY_9, grammarAccess.getSectionAccess().getCLOSECURLYTerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleDocItem"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:305:1: entryRuleDocItem returns [EObject current=null] : iv_ruleDocItem= ruleDocItem EOF ;
    public final EObject entryRuleDocItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocItem = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:306:2: (iv_ruleDocItem= ruleDocItem EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:307:2: iv_ruleDocItem= ruleDocItem EOF
            {
             newCompositeNode(grammarAccess.getDocItemRule()); 
            pushFollow(FOLLOW_ruleDocItem_in_entryRuleDocItem605);
            iv_ruleDocItem=ruleDocItem();

            state._fsp--;

             current =iv_ruleDocItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocItem615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocItem"


    // $ANTLR start "ruleDocItem"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:314:1: ruleDocItem returns [EObject current=null] : (this_Paragraph_0= ruleParagraph | this_Image_1= ruleImage ) ;
    public final EObject ruleDocItem() throws RecognitionException {
        EObject current = null;

        EObject this_Paragraph_0 = null;

        EObject this_Image_1 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:317:28: ( (this_Paragraph_0= ruleParagraph | this_Image_1= ruleImage ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:318:1: (this_Paragraph_0= ruleParagraph | this_Image_1= ruleImage )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:318:1: (this_Paragraph_0= ruleParagraph | this_Image_1= ruleImage )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OPENCURLY) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:319:5: this_Paragraph_0= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getDocItemAccess().getParagraphParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleDocItem662);
                    this_Paragraph_0=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:329:5: this_Image_1= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getDocItemAccess().getImageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleDocItem689);
                    this_Image_1=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocItem"


    // $ANTLR start "entryRuleParagraphItem"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:345:1: entryRuleParagraphItem returns [EObject current=null] : iv_ruleParagraphItem= ruleParagraphItem EOF ;
    public final EObject entryRuleParagraphItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraphItem = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:346:2: (iv_ruleParagraphItem= ruleParagraphItem EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:347:2: iv_ruleParagraphItem= ruleParagraphItem EOF
            {
             newCompositeNode(grammarAccess.getParagraphItemRule()); 
            pushFollow(FOLLOW_ruleParagraphItem_in_entryRuleParagraphItem724);
            iv_ruleParagraphItem=ruleParagraphItem();

            state._fsp--;

             current =iv_ruleParagraphItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraphItem734); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraphItem"


    // $ANTLR start "ruleParagraphItem"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:354:1: ruleParagraphItem returns [EObject current=null] : (this_Text_0= ruleText | this_Reference_1= ruleReference ) ;
    public final EObject ruleParagraphItem() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Reference_1 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:357:28: ( (this_Text_0= ruleText | this_Reference_1= ruleReference ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:358:1: (this_Text_0= ruleText | this_Reference_1= ruleReference )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:358:1: (this_Text_0= ruleText | this_Reference_1= ruleReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:359:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphItemAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleParagraphItem781);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:369:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphItemAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleParagraphItem808);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraphItem"


    // $ANTLR start "entryRuleParagraph"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:385:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:386:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:387:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph843);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph853); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:394:1: ruleParagraph returns [EObject current=null] : (this_OPENCURLY_0= RULE_OPENCURLY ( (lv_body_1_0= ruleParagraphItem ) )* this_CLOSECURLY_2= RULE_CLOSECURLY ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token this_OPENCURLY_0=null;
        Token this_CLOSECURLY_2=null;
        EObject lv_body_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:397:28: ( (this_OPENCURLY_0= RULE_OPENCURLY ( (lv_body_1_0= ruleParagraphItem ) )* this_CLOSECURLY_2= RULE_CLOSECURLY ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:398:1: (this_OPENCURLY_0= RULE_OPENCURLY ( (lv_body_1_0= ruleParagraphItem ) )* this_CLOSECURLY_2= RULE_CLOSECURLY )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:398:1: (this_OPENCURLY_0= RULE_OPENCURLY ( (lv_body_1_0= ruleParagraphItem ) )* this_CLOSECURLY_2= RULE_CLOSECURLY )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:398:2: this_OPENCURLY_0= RULE_OPENCURLY ( (lv_body_1_0= ruleParagraphItem ) )* this_CLOSECURLY_2= RULE_CLOSECURLY
            {
            this_OPENCURLY_0=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleParagraph889); 
             
                newLeafNode(this_OPENCURLY_0, grammarAccess.getParagraphAccess().getOPENCURLYTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:402:1: ( (lv_body_1_0= ruleParagraphItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||(LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:403:1: (lv_body_1_0= ruleParagraphItem )
            	    {
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:403:1: (lv_body_1_0= ruleParagraphItem )
            	    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:404:3: lv_body_1_0= ruleParagraphItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParagraphAccess().getBodyParagraphItemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraphItem_in_ruleParagraph909);
            	    lv_body_1_0=ruleParagraphItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParagraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_1_0, 
            	            		"ParagraphItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_CLOSECURLY_2=(Token)match(input,RULE_CLOSECURLY,FOLLOW_RULE_CLOSECURLY_in_ruleParagraph921); 
             
                newLeafNode(this_CLOSECURLY_2, grammarAccess.getParagraphAccess().getCLOSECURLYTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReference"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:432:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:433:2: (iv_ruleReference= ruleReference EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:434:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference956);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference966); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:441:1: ruleReference returns [EObject current=null] : (this_SectionReference_0= ruleSectionReference | this_ImgReference_1= ruleImgReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_SectionReference_0 = null;

        EObject this_ImgReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:444:28: ( (this_SectionReference_0= ruleSectionReference | this_ImgReference_1= ruleImgReference ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:445:1: (this_SectionReference_0= ruleSectionReference | this_ImgReference_1= ruleImgReference )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:445:1: (this_SectionReference_0= ruleSectionReference | this_ImgReference_1= ruleImgReference )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:446:5: this_SectionReference_0= ruleSectionReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getSectionReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSectionReference_in_ruleReference1013);
                    this_SectionReference_0=ruleSectionReference();

                    state._fsp--;

                     
                            current = this_SectionReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:456:5: this_ImgReference_1= ruleImgReference
                    {
                     
                            newCompositeNode(grammarAccess.getReferenceAccess().getImgReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImgReference_in_ruleReference1040);
                    this_ImgReference_1=ruleImgReference();

                    state._fsp--;

                     
                            current = this_ImgReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleSectionReference"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:472:1: entryRuleSectionReference returns [EObject current=null] : iv_ruleSectionReference= ruleSectionReference EOF ;
    public final EObject entryRuleSectionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionReference = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:473:2: (iv_ruleSectionReference= ruleSectionReference EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:474:2: iv_ruleSectionReference= ruleSectionReference EOF
            {
             newCompositeNode(grammarAccess.getSectionReferenceRule()); 
            pushFollow(FOLLOW_ruleSectionReference_in_entryRuleSectionReference1075);
            iv_ruleSectionReference=ruleSectionReference();

            state._fsp--;

             current =iv_ruleSectionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionReference1085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:481:1: ruleSectionReference returns [EObject current=null] : (otherlv_0= 'secRef' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSectionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:484:28: ( (otherlv_0= 'secRef' ( (otherlv_1= RULE_ID ) ) ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:485:1: (otherlv_0= 'secRef' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:485:1: (otherlv_0= 'secRef' ( (otherlv_1= RULE_ID ) ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:485:3: otherlv_0= 'secRef' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSectionReference1122); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionReferenceAccess().getSecRefKeyword_0());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:489:1: ( (otherlv_1= RULE_ID ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:490:1: (otherlv_1= RULE_ID )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:490:1: (otherlv_1= RULE_ID )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:491:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionReferenceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSectionReference1142); 

            		newLeafNode(otherlv_1, grammarAccess.getSectionReferenceAccess().getRefSectionCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionReference"


    // $ANTLR start "entryRuleImgReference"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:510:1: entryRuleImgReference returns [EObject current=null] : iv_ruleImgReference= ruleImgReference EOF ;
    public final EObject entryRuleImgReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImgReference = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:511:2: (iv_ruleImgReference= ruleImgReference EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:512:2: iv_ruleImgReference= ruleImgReference EOF
            {
             newCompositeNode(grammarAccess.getImgReferenceRule()); 
            pushFollow(FOLLOW_ruleImgReference_in_entryRuleImgReference1178);
            iv_ruleImgReference=ruleImgReference();

            state._fsp--;

             current =iv_ruleImgReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImgReference1188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImgReference"


    // $ANTLR start "ruleImgReference"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:519:1: ruleImgReference returns [EObject current=null] : (otherlv_0= 'imgRef' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleImgReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:522:28: ( (otherlv_0= 'imgRef' ( ( ruleQualifiedName ) ) ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:523:1: (otherlv_0= 'imgRef' ( ( ruleQualifiedName ) ) )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:523:1: (otherlv_0= 'imgRef' ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:523:3: otherlv_0= 'imgRef' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImgReference1225); 

                	newLeafNode(otherlv_0, grammarAccess.getImgReferenceAccess().getImgRefKeyword_0());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:527:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:528:1: ( ruleQualifiedName )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:528:1: ( ruleQualifiedName )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:529:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImgReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getImgReferenceAccess().getRefImageCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImgReference1248);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImgReference"


    // $ANTLR start "entryRuleImage"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:552:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:553:2: (iv_ruleImage= ruleImage EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:554:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage1286);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage1296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:561:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'caption' ( (lv_caption_5_0= RULE_STRING ) ) ( (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) ) )? this_ENDLINE_10= RULE_ENDLINE ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_caption_5_0=null;
        Token otherlv_6=null;
        Token lv_width_7_0=null;
        Token otherlv_8=null;
        Token lv_height_9_0=null;
        Token this_ENDLINE_10=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:564:28: ( (otherlv_0= 'image' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'caption' ( (lv_caption_5_0= RULE_STRING ) ) ( (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) ) )? this_ENDLINE_10= RULE_ENDLINE ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:565:1: (otherlv_0= 'image' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'caption' ( (lv_caption_5_0= RULE_STRING ) ) ( (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) ) )? this_ENDLINE_10= RULE_ENDLINE )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:565:1: (otherlv_0= 'image' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'caption' ( (lv_caption_5_0= RULE_STRING ) ) ( (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) ) )? this_ENDLINE_10= RULE_ENDLINE )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:565:3: otherlv_0= 'image' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'caption' ( (lv_caption_5_0= RULE_STRING ) ) ( (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) ) )? this_ENDLINE_10= RULE_ENDLINE
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleImage1333); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:569:1: ( (lv_url_1_0= RULE_STRING ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:570:1: (lv_url_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:570:1: (lv_url_1_0= RULE_STRING )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:571:3: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage1350); 

            			newLeafNode(lv_url_1_0, grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleImage1367); 

                	newLeafNode(otherlv_2, grammarAccess.getImageAccess().getNameKeyword_2());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:591:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:592:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:592:1: (lv_name_3_0= RULE_ID )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:593:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImage1384); 

            			newLeafNode(lv_name_3_0, grammarAccess.getImageAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleImage1401); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getCaptionKeyword_4());
                
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:613:1: ( (lv_caption_5_0= RULE_STRING ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:614:1: (lv_caption_5_0= RULE_STRING )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:614:1: (lv_caption_5_0= RULE_STRING )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:615:3: lv_caption_5_0= RULE_STRING
            {
            lv_caption_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImage1418); 

            			newLeafNode(lv_caption_5_0, grammarAccess.getImageAccess().getCaptionSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"caption",
                    		lv_caption_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:631:2: ( (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:631:3: (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) ) (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) )
                    {
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:631:3: (otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) ) )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:631:5: otherlv_6= 'width' ( (lv_width_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleImage1437); 

                        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getWidthKeyword_6_0_0());
                        
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:635:1: ( (lv_width_7_0= RULE_INT ) )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:636:1: (lv_width_7_0= RULE_INT )
                    {
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:636:1: (lv_width_7_0= RULE_INT )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:637:3: lv_width_7_0= RULE_INT
                    {
                    lv_width_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleImage1454); 

                    			newLeafNode(lv_width_7_0, grammarAccess.getImageAccess().getWidthINTTerminalRuleCall_6_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"width",
                            		lv_width_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }

                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:653:3: (otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) ) )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:653:5: otherlv_8= 'height' ( (lv_height_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleImage1473); 

                        	newLeafNode(otherlv_8, grammarAccess.getImageAccess().getHeightKeyword_6_1_0());
                        
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:657:1: ( (lv_height_9_0= RULE_INT ) )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:658:1: (lv_height_9_0= RULE_INT )
                    {
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:658:1: (lv_height_9_0= RULE_INT )
                    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:659:3: lv_height_9_0= RULE_INT
                    {
                    lv_height_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleImage1490); 

                    			newLeafNode(lv_height_9_0, grammarAccess.getImageAccess().getHeightINTTerminalRuleCall_6_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"height",
                            		lv_height_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleImage1509); 
             
                newLeafNode(this_ENDLINE_10, grammarAccess.getImageAccess().getENDLINETerminalRuleCall_7()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleText"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:687:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:688:2: (iv_ruleText= ruleText EOF )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:689:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1544);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1554); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:696:1: ruleText returns [EObject current=null] : ( (lv_content_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:699:28: ( ( (lv_content_0_0= RULE_STRING ) ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:700:1: ( (lv_content_0_0= RULE_STRING ) )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:700:1: ( (lv_content_0_0= RULE_STRING ) )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:701:1: (lv_content_0_0= RULE_STRING )
            {
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:701:1: (lv_content_0_0= RULE_STRING )
            // ../com.lowcoupling.dono/src-gen/com/lowcoupling/dono/parser/antlr/internal/InternalDono.g:702:3: lv_content_0_0= RULE_STRING
            {
            lv_content_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleText1595); 

            			newLeafNode(lv_content_0_0, grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDoc_in_entryRuleDoc75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoc85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDoc122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoc139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleDoc155 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleSection_in_ruleDoc175 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_RULE_CLOSECURLY_in_ruleDoc187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName308 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSection402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSection436 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSection453 = new BitSet(new long[]{0x00000000000C0020L});
    public static final BitSet FOLLOW_18_in_ruleSection471 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSection488 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleSection513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleSection538 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_ruleDocItem_in_ruleSection558 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_RULE_CLOSECURLY_in_ruleSection570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocItem_in_entryRuleDocItem605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocItem615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleDocItem662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleDocItem689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphItem_in_entryRuleParagraphItem724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraphItem734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleParagraphItem781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParagraphItem808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleParagraph889 = new BitSet(new long[]{0x00000000003000C0L});
    public static final BitSet FOLLOW_ruleParagraphItem_in_ruleParagraph909 = new BitSet(new long[]{0x00000000003000C0L});
    public static final BitSet FOLLOW_RULE_CLOSECURLY_in_ruleParagraph921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReference_in_ruleReference1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImgReference_in_ruleReference1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionReference_in_entryRuleSectionReference1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionReference1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSectionReference1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSectionReference1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImgReference_in_entryRuleImgReference1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImgReference1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImgReference1225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImgReference1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage1286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleImage1333 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage1350 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleImage1367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImage1384 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleImage1401 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImage1418 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_25_in_ruleImage1437 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleImage1454 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleImage1473 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleImage1490 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleImage1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleText1595 = new BitSet(new long[]{0x0000000000000002L});

}