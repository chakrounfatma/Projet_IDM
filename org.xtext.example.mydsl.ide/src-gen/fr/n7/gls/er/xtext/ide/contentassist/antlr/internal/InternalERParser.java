package fr.n7.gls.er.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.gls.er.xtext.services.ERGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalERParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'one'", "'many'", "'model'", "'is'", "'end'", "'entity'", "';'", "'relation'", "'between'", "'and'"
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

    	public void setGrammarAccess(ERGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalER.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalER.g:54:1: ( ruleModel EOF )
            // InternalER.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalER.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalER.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalER.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalER.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalER.g:69:3: ( rule__Model__Group__0 )
            // InternalER.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalER.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalER.g:79:1: ( ruleEntity EOF )
            // InternalER.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalER.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalER.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalER.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalER.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalER.g:94:3: ( rule__Entity__Group__0 )
            // InternalER.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalER.g:103:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalER.g:104:1: ( ruleRelation EOF )
            // InternalER.g:105:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalER.g:112:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:116:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalER.g:117:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalER.g:117:2: ( ( rule__Relation__Group__0 ) )
            // InternalER.g:118:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalER.g:119:3: ( rule__Relation__Group__0 )
            // InternalER.g:119:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRulePart"
    // InternalER.g:128:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // InternalER.g:129:1: ( rulePart EOF )
            // InternalER.g:130:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            rulePart();

            state._fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalER.g:137:1: rulePart : ( ( rule__Part__Group__0 ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:141:2: ( ( ( rule__Part__Group__0 ) ) )
            // InternalER.g:142:2: ( ( rule__Part__Group__0 ) )
            {
            // InternalER.g:142:2: ( ( rule__Part__Group__0 ) )
            // InternalER.g:143:3: ( rule__Part__Group__0 )
            {
             before(grammarAccess.getPartAccess().getGroup()); 
            // InternalER.g:144:3: ( rule__Part__Group__0 )
            // InternalER.g:144:4: rule__Part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup()); 

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
    // $ANTLR end "rulePart"


    // $ANTLR start "ruleCardinal"
    // InternalER.g:153:1: ruleCardinal : ( ( rule__Cardinal__Alternatives ) ) ;
    public final void ruleCardinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:157:1: ( ( ( rule__Cardinal__Alternatives ) ) )
            // InternalER.g:158:2: ( ( rule__Cardinal__Alternatives ) )
            {
            // InternalER.g:158:2: ( ( rule__Cardinal__Alternatives ) )
            // InternalER.g:159:3: ( rule__Cardinal__Alternatives )
            {
             before(grammarAccess.getCardinalAccess().getAlternatives()); 
            // InternalER.g:160:3: ( rule__Cardinal__Alternatives )
            // InternalER.g:160:4: rule__Cardinal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardinal"


    // $ANTLR start "rule__Model__Alternatives_3"
    // InternalER.g:168:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__EntitiesAssignment_3_0 ) ) | ( ( rule__Model__RelationsAssignment_3_1 ) ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:172:1: ( ( ( rule__Model__EntitiesAssignment_3_0 ) ) | ( ( rule__Model__RelationsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalER.g:173:2: ( ( rule__Model__EntitiesAssignment_3_0 ) )
                    {
                    // InternalER.g:173:2: ( ( rule__Model__EntitiesAssignment_3_0 ) )
                    // InternalER.g:174:3: ( rule__Model__EntitiesAssignment_3_0 )
                    {
                     before(grammarAccess.getModelAccess().getEntitiesAssignment_3_0()); 
                    // InternalER.g:175:3: ( rule__Model__EntitiesAssignment_3_0 )
                    // InternalER.g:175:4: rule__Model__EntitiesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__EntitiesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getEntitiesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalER.g:179:2: ( ( rule__Model__RelationsAssignment_3_1 ) )
                    {
                    // InternalER.g:179:2: ( ( rule__Model__RelationsAssignment_3_1 ) )
                    // InternalER.g:180:3: ( rule__Model__RelationsAssignment_3_1 )
                    {
                     before(grammarAccess.getModelAccess().getRelationsAssignment_3_1()); 
                    // InternalER.g:181:3: ( rule__Model__RelationsAssignment_3_1 )
                    // InternalER.g:181:4: rule__Model__RelationsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__RelationsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getRelationsAssignment_3_1()); 

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
    // $ANTLR end "rule__Model__Alternatives_3"


    // $ANTLR start "rule__Cardinal__Alternatives"
    // InternalER.g:189:1: rule__Cardinal__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__Cardinal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:193:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalER.g:194:2: ( ( 'one' ) )
                    {
                    // InternalER.g:194:2: ( ( 'one' ) )
                    // InternalER.g:195:3: ( 'one' )
                    {
                     before(grammarAccess.getCardinalAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalER.g:196:3: ( 'one' )
                    // InternalER.g:196:4: 'one'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalER.g:200:2: ( ( 'many' ) )
                    {
                    // InternalER.g:200:2: ( ( 'many' ) )
                    // InternalER.g:201:3: ( 'many' )
                    {
                     before(grammarAccess.getCardinalAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalER.g:202:3: ( 'many' )
                    // InternalER.g:202:4: 'many'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalAccess().getManyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Cardinal__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalER.g:210:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:214:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalER.g:215:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalER.g:222:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:226:1: ( ( 'model' ) )
            // InternalER.g:227:1: ( 'model' )
            {
            // InternalER.g:227:1: ( 'model' )
            // InternalER.g:228:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalER.g:237:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:241:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalER.g:242:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalER.g:249:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:253:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalER.g:254:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalER.g:254:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalER.g:255:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalER.g:256:2: ( rule__Model__NameAssignment_1 )
            // InternalER.g:256:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalER.g:264:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:268:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalER.g:269:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalER.g:276:1: rule__Model__Group__2__Impl : ( 'is' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:280:1: ( ( 'is' ) )
            // InternalER.g:281:1: ( 'is' )
            {
            // InternalER.g:281:1: ( 'is' )
            // InternalER.g:282:2: 'is'
            {
             before(grammarAccess.getModelAccess().getIsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalER.g:291:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:295:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalER.g:296:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalER.g:303:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:307:1: ( ( ( rule__Model__Alternatives_3 )* ) )
            // InternalER.g:308:1: ( ( rule__Model__Alternatives_3 )* )
            {
            // InternalER.g:308:1: ( ( rule__Model__Alternatives_3 )* )
            // InternalER.g:309:2: ( rule__Model__Alternatives_3 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalER.g:310:2: ( rule__Model__Alternatives_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalER.g:310:3: rule__Model__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalER.g:318:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:322:1: ( rule__Model__Group__4__Impl )
            // InternalER.g:323:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalER.g:329:1: rule__Model__Group__4__Impl : ( 'end' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:333:1: ( ( 'end' ) )
            // InternalER.g:334:1: ( 'end' )
            {
            // InternalER.g:334:1: ( 'end' )
            // InternalER.g:335:2: 'end'
            {
             before(grammarAccess.getModelAccess().getEndKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalER.g:345:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:349:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalER.g:350:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalER.g:357:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:361:1: ( ( 'entity' ) )
            // InternalER.g:362:1: ( 'entity' )
            {
            // InternalER.g:362:1: ( 'entity' )
            // InternalER.g:363:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalER.g:372:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:376:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalER.g:377:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalER.g:384:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:388:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalER.g:389:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalER.g:389:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalER.g:390:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalER.g:391:2: ( rule__Entity__NameAssignment_1 )
            // InternalER.g:391:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalER.g:399:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:403:1: ( rule__Entity__Group__2__Impl )
            // InternalER.g:404:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalER.g:410:1: rule__Entity__Group__2__Impl : ( ';' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:414:1: ( ( ';' ) )
            // InternalER.g:415:1: ( ';' )
            {
            // InternalER.g:415:1: ( ';' )
            // InternalER.g:416:2: ';'
            {
             before(grammarAccess.getEntityAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalER.g:426:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:430:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalER.g:431:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalER.g:438:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:442:1: ( ( 'relation' ) )
            // InternalER.g:443:1: ( 'relation' )
            {
            // InternalER.g:443:1: ( 'relation' )
            // InternalER.g:444:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

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
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalER.g:453:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:457:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalER.g:458:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalER.g:465:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__NameAssignment_1 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:469:1: ( ( ( rule__Relation__NameAssignment_1 ) ) )
            // InternalER.g:470:1: ( ( rule__Relation__NameAssignment_1 ) )
            {
            // InternalER.g:470:1: ( ( rule__Relation__NameAssignment_1 ) )
            // InternalER.g:471:2: ( rule__Relation__NameAssignment_1 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_1()); 
            // InternalER.g:472:2: ( rule__Relation__NameAssignment_1 )
            // InternalER.g:472:3: rule__Relation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalER.g:480:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:484:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalER.g:485:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalER.g:492:1: rule__Relation__Group__2__Impl : ( 'between' ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:496:1: ( ( 'between' ) )
            // InternalER.g:497:1: ( 'between' )
            {
            // InternalER.g:497:1: ( 'between' )
            // InternalER.g:498:2: 'between'
            {
             before(grammarAccess.getRelationAccess().getBetweenKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getBetweenKeyword_2()); 

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
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalER.g:507:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:511:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalER.g:512:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

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
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalER.g:519:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__PartsAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:523:1: ( ( ( rule__Relation__PartsAssignment_3 ) ) )
            // InternalER.g:524:1: ( ( rule__Relation__PartsAssignment_3 ) )
            {
            // InternalER.g:524:1: ( ( rule__Relation__PartsAssignment_3 ) )
            // InternalER.g:525:2: ( rule__Relation__PartsAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getPartsAssignment_3()); 
            // InternalER.g:526:2: ( rule__Relation__PartsAssignment_3 )
            // InternalER.g:526:3: rule__Relation__PartsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__PartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getPartsAssignment_3()); 

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
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalER.g:534:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:538:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalER.g:539:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

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
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalER.g:546:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__Group_4__0 )* ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:550:1: ( ( ( rule__Relation__Group_4__0 )* ) )
            // InternalER.g:551:1: ( ( rule__Relation__Group_4__0 )* )
            {
            // InternalER.g:551:1: ( ( rule__Relation__Group_4__0 )* )
            // InternalER.g:552:2: ( rule__Relation__Group_4__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_4()); 
            // InternalER.g:553:2: ( rule__Relation__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalER.g:553:3: rule__Relation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Relation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRelationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalER.g:561:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:565:1: ( rule__Relation__Group__5__Impl )
            // InternalER.g:566:2: rule__Relation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__5__Impl();

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
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalER.g:572:1: rule__Relation__Group__5__Impl : ( ';' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:576:1: ( ( ';' ) )
            // InternalER.g:577:1: ( ';' )
            {
            // InternalER.g:577:1: ( ';' )
            // InternalER.g:578:2: ';'
            {
             before(grammarAccess.getRelationAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group_4__0"
    // InternalER.g:588:1: rule__Relation__Group_4__0 : rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 ;
    public final void rule__Relation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:592:1: ( rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1 )
            // InternalER.g:593:2: rule__Relation__Group_4__0__Impl rule__Relation__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_4__1();

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
    // $ANTLR end "rule__Relation__Group_4__0"


    // $ANTLR start "rule__Relation__Group_4__0__Impl"
    // InternalER.g:600:1: rule__Relation__Group_4__0__Impl : ( 'and' ) ;
    public final void rule__Relation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:604:1: ( ( 'and' ) )
            // InternalER.g:605:1: ( 'and' )
            {
            // InternalER.g:605:1: ( 'and' )
            // InternalER.g:606:2: 'and'
            {
             before(grammarAccess.getRelationAccess().getAndKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getAndKeyword_4_0()); 

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
    // $ANTLR end "rule__Relation__Group_4__0__Impl"


    // $ANTLR start "rule__Relation__Group_4__1"
    // InternalER.g:615:1: rule__Relation__Group_4__1 : rule__Relation__Group_4__1__Impl ;
    public final void rule__Relation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:619:1: ( rule__Relation__Group_4__1__Impl )
            // InternalER.g:620:2: rule__Relation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_4__1__Impl();

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
    // $ANTLR end "rule__Relation__Group_4__1"


    // $ANTLR start "rule__Relation__Group_4__1__Impl"
    // InternalER.g:626:1: rule__Relation__Group_4__1__Impl : ( ( rule__Relation__PartsAssignment_4_1 ) ) ;
    public final void rule__Relation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:630:1: ( ( ( rule__Relation__PartsAssignment_4_1 ) ) )
            // InternalER.g:631:1: ( ( rule__Relation__PartsAssignment_4_1 ) )
            {
            // InternalER.g:631:1: ( ( rule__Relation__PartsAssignment_4_1 ) )
            // InternalER.g:632:2: ( rule__Relation__PartsAssignment_4_1 )
            {
             before(grammarAccess.getRelationAccess().getPartsAssignment_4_1()); 
            // InternalER.g:633:2: ( rule__Relation__PartsAssignment_4_1 )
            // InternalER.g:633:3: rule__Relation__PartsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__PartsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getPartsAssignment_4_1()); 

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
    // $ANTLR end "rule__Relation__Group_4__1__Impl"


    // $ANTLR start "rule__Part__Group__0"
    // InternalER.g:642:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:646:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // InternalER.g:647:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Part__Group__1();

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
    // $ANTLR end "rule__Part__Group__0"


    // $ANTLR start "rule__Part__Group__0__Impl"
    // InternalER.g:654:1: rule__Part__Group__0__Impl : ( ( rule__Part__NameAssignment_0 ) ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:658:1: ( ( ( rule__Part__NameAssignment_0 ) ) )
            // InternalER.g:659:1: ( ( rule__Part__NameAssignment_0 ) )
            {
            // InternalER.g:659:1: ( ( rule__Part__NameAssignment_0 ) )
            // InternalER.g:660:2: ( rule__Part__NameAssignment_0 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_0()); 
            // InternalER.g:661:2: ( rule__Part__NameAssignment_0 )
            // InternalER.g:661:3: rule__Part__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Part__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Part__Group__0__Impl"


    // $ANTLR start "rule__Part__Group__1"
    // InternalER.g:669:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:673:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // InternalER.g:674:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Part__Group__2();

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
    // $ANTLR end "rule__Part__Group__1"


    // $ANTLR start "rule__Part__Group__1__Impl"
    // InternalER.g:681:1: rule__Part__Group__1__Impl : ( 'is' ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:685:1: ( ( 'is' ) )
            // InternalER.g:686:1: ( 'is' )
            {
            // InternalER.g:686:1: ( 'is' )
            // InternalER.g:687:2: 'is'
            {
             before(grammarAccess.getPartAccess().getIsKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Part__Group__1__Impl"


    // $ANTLR start "rule__Part__Group__2"
    // InternalER.g:696:1: rule__Part__Group__2 : rule__Part__Group__2__Impl rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:700:1: ( rule__Part__Group__2__Impl rule__Part__Group__3 )
            // InternalER.g:701:2: rule__Part__Group__2__Impl rule__Part__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Part__Group__3();

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
    // $ANTLR end "rule__Part__Group__2"


    // $ANTLR start "rule__Part__Group__2__Impl"
    // InternalER.g:708:1: rule__Part__Group__2__Impl : ( ( rule__Part__CardinalAssignment_2 ) ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:712:1: ( ( ( rule__Part__CardinalAssignment_2 ) ) )
            // InternalER.g:713:1: ( ( rule__Part__CardinalAssignment_2 ) )
            {
            // InternalER.g:713:1: ( ( rule__Part__CardinalAssignment_2 ) )
            // InternalER.g:714:2: ( rule__Part__CardinalAssignment_2 )
            {
             before(grammarAccess.getPartAccess().getCardinalAssignment_2()); 
            // InternalER.g:715:2: ( rule__Part__CardinalAssignment_2 )
            // InternalER.g:715:3: rule__Part__CardinalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Part__CardinalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getCardinalAssignment_2()); 

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
    // $ANTLR end "rule__Part__Group__2__Impl"


    // $ANTLR start "rule__Part__Group__3"
    // InternalER.g:723:1: rule__Part__Group__3 : rule__Part__Group__3__Impl ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:727:1: ( rule__Part__Group__3__Impl )
            // InternalER.g:728:2: rule__Part__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Part__Group__3__Impl();

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
    // $ANTLR end "rule__Part__Group__3"


    // $ANTLR start "rule__Part__Group__3__Impl"
    // InternalER.g:734:1: rule__Part__Group__3__Impl : ( ( rule__Part__EntityAssignment_3 ) ) ;
    public final void rule__Part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:738:1: ( ( ( rule__Part__EntityAssignment_3 ) ) )
            // InternalER.g:739:1: ( ( rule__Part__EntityAssignment_3 ) )
            {
            // InternalER.g:739:1: ( ( rule__Part__EntityAssignment_3 ) )
            // InternalER.g:740:2: ( rule__Part__EntityAssignment_3 )
            {
             before(grammarAccess.getPartAccess().getEntityAssignment_3()); 
            // InternalER.g:741:2: ( rule__Part__EntityAssignment_3 )
            // InternalER.g:741:3: rule__Part__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Part__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getEntityAssignment_3()); 

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
    // $ANTLR end "rule__Part__Group__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalER.g:750:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:754:1: ( ( RULE_ID ) )
            // InternalER.g:755:2: ( RULE_ID )
            {
            // InternalER.g:755:2: ( RULE_ID )
            // InternalER.g:756:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__EntitiesAssignment_3_0"
    // InternalER.g:765:1: rule__Model__EntitiesAssignment_3_0 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:769:1: ( ( ruleEntity ) )
            // InternalER.g:770:2: ( ruleEntity )
            {
            // InternalER.g:770:2: ( ruleEntity )
            // InternalER.g:771:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment_3_0"


    // $ANTLR start "rule__Model__RelationsAssignment_3_1"
    // InternalER.g:780:1: rule__Model__RelationsAssignment_3_1 : ( ruleRelation ) ;
    public final void rule__Model__RelationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:784:1: ( ( ruleRelation ) )
            // InternalER.g:785:2: ( ruleRelation )
            {
            // InternalER.g:785:2: ( ruleRelation )
            // InternalER.g:786:3: ruleRelation
            {
             before(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRelationsRelationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Model__RelationsAssignment_3_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalER.g:795:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:799:1: ( ( RULE_ID ) )
            // InternalER.g:800:2: ( RULE_ID )
            {
            // InternalER.g:800:2: ( RULE_ID )
            // InternalER.g:801:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Relation__NameAssignment_1"
    // InternalER.g:810:1: rule__Relation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:814:1: ( ( RULE_ID ) )
            // InternalER.g:815:2: ( RULE_ID )
            {
            // InternalER.g:815:2: ( RULE_ID )
            // InternalER.g:816:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Relation__NameAssignment_1"


    // $ANTLR start "rule__Relation__PartsAssignment_3"
    // InternalER.g:825:1: rule__Relation__PartsAssignment_3 : ( rulePart ) ;
    public final void rule__Relation__PartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:829:1: ( ( rulePart ) )
            // InternalER.g:830:2: ( rulePart )
            {
            // InternalER.g:830:2: ( rulePart )
            // InternalER.g:831:3: rulePart
            {
             before(grammarAccess.getRelationAccess().getPartsPartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePart();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getPartsPartParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Relation__PartsAssignment_3"


    // $ANTLR start "rule__Relation__PartsAssignment_4_1"
    // InternalER.g:840:1: rule__Relation__PartsAssignment_4_1 : ( rulePart ) ;
    public final void rule__Relation__PartsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:844:1: ( ( rulePart ) )
            // InternalER.g:845:2: ( rulePart )
            {
            // InternalER.g:845:2: ( rulePart )
            // InternalER.g:846:3: rulePart
            {
             before(grammarAccess.getRelationAccess().getPartsPartParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePart();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getPartsPartParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Relation__PartsAssignment_4_1"


    // $ANTLR start "rule__Part__NameAssignment_0"
    // InternalER.g:855:1: rule__Part__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Part__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:859:1: ( ( RULE_ID ) )
            // InternalER.g:860:2: ( RULE_ID )
            {
            // InternalER.g:860:2: ( RULE_ID )
            // InternalER.g:861:3: RULE_ID
            {
             before(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Part__NameAssignment_0"


    // $ANTLR start "rule__Part__CardinalAssignment_2"
    // InternalER.g:870:1: rule__Part__CardinalAssignment_2 : ( ruleCardinal ) ;
    public final void rule__Part__CardinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:874:1: ( ( ruleCardinal ) )
            // InternalER.g:875:2: ( ruleCardinal )
            {
            // InternalER.g:875:2: ( ruleCardinal )
            // InternalER.g:876:3: ruleCardinal
            {
             before(grammarAccess.getPartAccess().getCardinalCardinalEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinal();

            state._fsp--;

             after(grammarAccess.getPartAccess().getCardinalCardinalEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Part__CardinalAssignment_2"


    // $ANTLR start "rule__Part__EntityAssignment_3"
    // InternalER.g:885:1: rule__Part__EntityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Part__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalER.g:889:1: ( ( ( RULE_ID ) ) )
            // InternalER.g:890:2: ( ( RULE_ID ) )
            {
            // InternalER.g:890:2: ( ( RULE_ID ) )
            // InternalER.g:891:3: ( RULE_ID )
            {
             before(grammarAccess.getPartAccess().getEntityEntityCrossReference_3_0()); 
            // InternalER.g:892:3: ( RULE_ID )
            // InternalER.g:893:4: RULE_ID
            {
             before(grammarAccess.getPartAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getEntityEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPartAccess().getEntityEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Part__EntityAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});

}