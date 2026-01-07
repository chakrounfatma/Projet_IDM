package fr.n7.gls.er.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.gls.er.xtext.services.ERGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalERParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'is'", "'end'", "'entity'", "';'", "'relation'", "'between'", "'and'", "'one'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalERParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalERParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalERParser.tokenNames; }
    public String getGrammarFileName() { return "InternalER.g"; }



     	private ERGrammarAccess grammarAccess;

        public InternalERParser(TokenStream input, ERGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ERGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalER.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalER.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalER.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalER.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_relations_4_0= ruleRelation ) ) )* otherlv_5= 'end' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_entities_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalER.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_relations_4_0= ruleRelation ) ) )* otherlv_5= 'end' ) )
            // InternalER.g:79:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_relations_4_0= ruleRelation ) ) )* otherlv_5= 'end' )
            {
            // InternalER.g:79:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_relations_4_0= ruleRelation ) ) )* otherlv_5= 'end' )
            // InternalER.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_relations_4_0= ruleRelation ) ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalER.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalER.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalER.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalER.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getIsKeyword_2());
            		
            // InternalER.g:106:3: ( ( (lv_entities_3_0= ruleEntity ) ) | ( (lv_relations_4_0= ruleRelation ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==16) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalER.g:107:4: ( (lv_entities_3_0= ruleEntity ) )
            	    {
            	    // InternalER.g:107:4: ( (lv_entities_3_0= ruleEntity ) )
            	    // InternalER.g:108:5: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalER.g:108:5: (lv_entities_3_0= ruleEntity )
            	    // InternalER.g:109:6: lv_entities_3_0= ruleEntity
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_3_0,
            	    							"fr.n7.gls.er.xtext.ER.Entity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalER.g:127:4: ( (lv_relations_4_0= ruleRelation ) )
            	    {
            	    // InternalER.g:127:4: ( (lv_relations_4_0= ruleRelation ) )
            	    // InternalER.g:128:5: (lv_relations_4_0= ruleRelation )
            	    {
            	    // InternalER.g:128:5: (lv_relations_4_0= ruleRelation )
            	    // InternalER.g:129:6: lv_relations_4_0= ruleRelation
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_relations_4_0=ruleRelation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relations",
            	    							lv_relations_4_0,
            	    							"fr.n7.gls.er.xtext.ER.Relation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalER.g:155:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalER.g:155:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalER.g:156:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalER.g:162:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalER.g:168:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalER.g:169:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalER.g:169:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalER.g:170:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalER.g:174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalER.g:175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalER.g:175:4: (lv_name_1_0= RULE_ID )
            // InternalER.g:176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalER.g:200:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalER.g:200:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalER.g:201:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalER.g:207:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_parts_3_0= rulePart ) ) (otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parts_3_0 = null;

        EObject lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalER.g:213:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_parts_3_0= rulePart ) ) (otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) ) )* otherlv_6= ';' ) )
            // InternalER.g:214:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_parts_3_0= rulePart ) ) (otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) ) )* otherlv_6= ';' )
            {
            // InternalER.g:214:2: (otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_parts_3_0= rulePart ) ) (otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) ) )* otherlv_6= ';' )
            // InternalER.g:215:3: otherlv_0= 'relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_parts_3_0= rulePart ) ) (otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            // InternalER.g:219:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalER.g:220:4: (lv_name_1_0= RULE_ID )
            {
            // InternalER.g:220:4: (lv_name_1_0= RULE_ID )
            // InternalER.g:221:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBetweenKeyword_2());
            		
            // InternalER.g:241:3: ( (lv_parts_3_0= rulePart ) )
            // InternalER.g:242:4: (lv_parts_3_0= rulePart )
            {
            // InternalER.g:242:4: (lv_parts_3_0= rulePart )
            // InternalER.g:243:5: lv_parts_3_0= rulePart
            {

            					newCompositeNode(grammarAccess.getRelationAccess().getPartsPartParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_parts_3_0=rulePart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationRule());
            					}
            					add(
            						current,
            						"parts",
            						lv_parts_3_0,
            						"fr.n7.gls.er.xtext.ER.Part");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalER.g:260:3: (otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalER.g:261:4: otherlv_4= 'and' ( (lv_parts_5_0= rulePart ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getAndKeyword_4_0());
            	    			
            	    // InternalER.g:265:4: ( (lv_parts_5_0= rulePart ) )
            	    // InternalER.g:266:5: (lv_parts_5_0= rulePart )
            	    {
            	    // InternalER.g:266:5: (lv_parts_5_0= rulePart )
            	    // InternalER.g:267:6: lv_parts_5_0= rulePart
            	    {

            	    						newCompositeNode(grammarAccess.getRelationAccess().getPartsPartParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_parts_5_0=rulePart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parts",
            	    							lv_parts_5_0,
            	    							"fr.n7.gls.er.xtext.ER.Part");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRulePart"
    // InternalER.g:293:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // InternalER.g:293:45: (iv_rulePart= rulePart EOF )
            // InternalER.g:294:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalER.g:300:1: rulePart returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_cardinal_2_0= ruleCardinal ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_cardinal_2_0 = null;



        	enterRule();

        try {
            // InternalER.g:306:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_cardinal_2_0= ruleCardinal ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // InternalER.g:307:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_cardinal_2_0= ruleCardinal ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalER.g:307:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_cardinal_2_0= ruleCardinal ) ) ( (otherlv_3= RULE_ID ) ) )
            // InternalER.g:308:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_cardinal_2_0= ruleCardinal ) ) ( (otherlv_3= RULE_ID ) )
            {
            // InternalER.g:308:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalER.g:309:4: (lv_name_0_0= RULE_ID )
            {
            // InternalER.g:309:4: (lv_name_0_0= RULE_ID )
            // InternalER.g:310:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPartAccess().getIsKeyword_1());
            		
            // InternalER.g:330:3: ( (lv_cardinal_2_0= ruleCardinal ) )
            // InternalER.g:331:4: (lv_cardinal_2_0= ruleCardinal )
            {
            // InternalER.g:331:4: (lv_cardinal_2_0= ruleCardinal )
            // InternalER.g:332:5: lv_cardinal_2_0= ruleCardinal
            {

            					newCompositeNode(grammarAccess.getPartAccess().getCardinalCardinalEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_cardinal_2_0=ruleCardinal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartRule());
            					}
            					set(
            						current,
            						"cardinal",
            						lv_cardinal_2_0,
            						"fr.n7.gls.er.xtext.ER.Cardinal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalER.g:349:3: ( (otherlv_3= RULE_ID ) )
            // InternalER.g:350:4: (otherlv_3= RULE_ID )
            {
            // InternalER.g:350:4: (otherlv_3= RULE_ID )
            // InternalER.g:351:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getPartAccess().getEntityEntityCrossReference_3_0());
            				

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
    // $ANTLR end "rulePart"


    // $ANTLR start "ruleCardinal"
    // InternalER.g:366:1: ruleCardinal returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleCardinal() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalER.g:372:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalER.g:373:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalER.g:373:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
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
                    // InternalER.g:374:3: (enumLiteral_0= 'one' )
                    {
                    // InternalER.g:374:3: (enumLiteral_0= 'one' )
                    // InternalER.g:375:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getCardinalAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalER.g:382:3: (enumLiteral_1= 'many' )
                    {
                    // InternalER.g:382:3: (enumLiteral_1= 'many' )
                    // InternalER.g:383:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getCardinalAccess().getManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalAccess().getManyEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleCardinal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});

}