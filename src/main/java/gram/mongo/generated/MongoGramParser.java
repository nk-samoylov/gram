// Generated from /home/nsamoylov/projects/testapp/src/main/resources/gram/mongo/MongoGram.g4 by ANTLR 4.7
package gram.mongo.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MongoGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SELECT=3, FROM=4, WHERE=5, AND=6, OR=7, NOT=8, ALL_ATTRS=9, 
		GT=10, LT=11, EQ=12, NEQ=13, GTE=14, LTE=15, FGT=16, FLT=17, FEQ=18, FNEQ=19, 
		FGTE=20, FLTE=21, LPAREN=22, RPAREN=23, ID=24, LETTER=25, STRING=26, FLOAT_NUMBER=27, 
		INT_NUMBER=28, DIGIT=29, WS=30;
	public static final int
		RULE_select = 0, RULE_attrList = 1, RULE_allAttrsClause = 2, RULE_whereClause = 3, 
		RULE_predicate = 4, RULE_expression = 5, RULE_operand = 6, RULE_constOperand = 7, 
		RULE_attr = 8, RULE_collectionName = 9, RULE_notOp = 10, RULE_andOp = 11, 
		RULE_orOp = 12, RULE_cCmpOp = 13, RULE_fCmpOp = 14;
	public static final String[] ruleNames = {
		"select", "attrList", "allAttrsClause", "whereClause", "predicate", "expression", 
		"operand", "constOperand", "attr", "collectionName", "notOp", "andOp", 
		"orOp", "cCmpOp", "fCmpOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", null, null, null, null, null, null, "'*'", "'>'", 
		"'<'", "'='", "'!='", "'>='", "'<='", "'~>'", "'<~'", "'~='", "'~!='", 
		"'~>='", "'<=~'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "ALL_ATTRS", 
		"GT", "LT", "EQ", "NEQ", "GTE", "LTE", "FGT", "FLT", "FEQ", "FNEQ", "FGTE", 
		"FLTE", "LPAREN", "RPAREN", "ID", "LETTER", "STRING", "FLOAT_NUMBER", 
		"INT_NUMBER", "DIGIT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MongoGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MongoGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MongoGramParser.SELECT, 0); }
		public AttrListContext attrList() {
			return getRuleContext(AttrListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MongoGramParser.FROM, 0); }
		public CollectionNameContext collectionName() {
			return getRuleContext(CollectionNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(SELECT);
			setState(31);
			attrList();
			setState(32);
			match(FROM);
			setState(33);
			collectionName();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(34);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrListContext extends ParserRuleContext {
		public AllAttrsClauseContext allAttrsClause() {
			return getRuleContext(AllAttrsClauseContext.class,0);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public AttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitAttrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrListContext attrList() throws RecognitionException {
		AttrListContext _localctx = new AttrListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attrList);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				allAttrsClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				attr();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(39);
					match(T__0);
					setState(40);
					attr();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllAttrsClauseContext extends ParserRuleContext {
		public TerminalNode ALL_ATTRS() { return getToken(MongoGramParser.ALL_ATTRS, 0); }
		public CollectionNameContext collectionName() {
			return getRuleContext(CollectionNameContext.class,0);
		}
		public AllAttrsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allAttrsClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitAllAttrsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllAttrsClauseContext allAttrsClause() throws RecognitionException {
		AllAttrsClauseContext _localctx = new AllAttrsClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_allAttrsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(48);
				collectionName();
				setState(49);
				match(T__1);
				}
			}

			setState(53);
			match(ALL_ATTRS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MongoGramParser.WHERE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(WHERE);
			setState(56);
			predicate(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotOpContext notOp() {
			return getRuleContext(NotOpContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MongoGramParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MongoGramParser.RPAREN, 0); }
		public AndOpContext andOp() {
			return getRuleContext(AndOpContext.class,0);
		}
		public OrOpContext orOp() {
			return getRuleContext(OrOpContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_predicate, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
			case FLOAT_NUMBER:
			case INT_NUMBER:
				{
				setState(59);
				expression();
				}
				break;
			case NOT:
				{
				setState(60);
				notOp();
				setState(61);
				predicate(4);
				}
				break;
			case LPAREN:
				{
				setState(63);
				match(LPAREN);
				setState(64);
				predicate(0);
				setState(65);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PredicateContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						andOp();
						setState(71);
						predicate(4);
						}
						break;
					case 2:
						{
						_localctx = new PredicateContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						orOp();
						setState(75);
						predicate(3);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public CCmpOpContext cCmpOp() {
			return getRuleContext(CCmpOpContext.class,0);
		}
		public FCmpOpContext fCmpOp() {
			return getRuleContext(FCmpOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			operand();
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case LT:
			case EQ:
			case NEQ:
			case GTE:
			case LTE:
				{
				setState(83);
				cCmpOp();
				}
				break;
			case FGT:
			case FLT:
			case FEQ:
			case FNEQ:
			case FGTE:
			case FLTE:
				{
				setState(84);
				fCmpOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ConstOperandContext constOperand() {
			return getRuleContext(ConstOperandContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operand);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				attr();
				}
				break;
			case STRING:
			case FLOAT_NUMBER:
			case INT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				constOperand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstOperandContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(MongoGramParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(MongoGramParser.FLOAT_NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MongoGramParser.STRING, 0); }
		public ConstOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constOperand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitConstOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstOperandContext constOperand() throws RecognitionException {
		ConstOperandContext _localctx = new ConstOperandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << FLOAT_NUMBER) | (1L << INT_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MongoGramParser.ID, 0); }
		public CollectionNameContext collectionName() {
			return getRuleContext(CollectionNameContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(95);
				collectionName();
				setState(96);
				match(T__1);
				}
				break;
			}
			setState(100);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MongoGramParser.ID, 0); }
		public CollectionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitCollectionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionNameContext collectionName() throws RecognitionException {
		CollectionNameContext _localctx = new CollectionNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_collectionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MongoGramParser.NOT, 0); }
		public NotOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitNotOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOpContext notOp() throws RecognitionException {
		NotOpContext _localctx = new NotOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_notOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MongoGramParser.AND, 0); }
		public AndOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitAndOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOpContext andOp() throws RecognitionException {
		AndOpContext _localctx = new AndOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_andOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrOpContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MongoGramParser.OR, 0); }
		public OrOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitOrOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrOpContext orOp() throws RecognitionException {
		OrOpContext _localctx = new OrOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CCmpOpContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(MongoGramParser.GT, 0); }
		public TerminalNode LT() { return getToken(MongoGramParser.LT, 0); }
		public TerminalNode EQ() { return getToken(MongoGramParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MongoGramParser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(MongoGramParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(MongoGramParser.LTE, 0); }
		public CCmpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cCmpOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitCCmpOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CCmpOpContext cCmpOp() throws RecognitionException {
		CCmpOpContext _localctx = new CCmpOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cCmpOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << NEQ) | (1L << GTE) | (1L << LTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FCmpOpContext extends ParserRuleContext {
		public TerminalNode FGT() { return getToken(MongoGramParser.FGT, 0); }
		public TerminalNode FLT() { return getToken(MongoGramParser.FLT, 0); }
		public TerminalNode FEQ() { return getToken(MongoGramParser.FEQ, 0); }
		public TerminalNode FNEQ() { return getToken(MongoGramParser.FNEQ, 0); }
		public TerminalNode FGTE() { return getToken(MongoGramParser.FGTE, 0); }
		public TerminalNode FLTE() { return getToken(MongoGramParser.FLTE, 0); }
		public FCmpOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fCmpOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MongoGramVisitor ) return ((MongoGramVisitor<? extends T>)visitor).visitFCmpOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FCmpOpContext fCmpOp() throws RecognitionException {
		FCmpOpContext _localctx = new FCmpOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fCmpOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FGT) | (1L << FLT) | (1L << FEQ) | (1L << FNEQ) | (1L << FGTE) | (1L << FLTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 u\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\5\2&\n"+
		"\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\5\3\61\n\3\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6F\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\7\3\7\3\7"+
		"\5\7X\n\7\3\7\3\7\3\b\3\b\5\b^\n\b\3\t\3\t\3\n\3\n\3\n\5\ne\n\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\3\n"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\34\36\3\2\f\21\3\2"+
		"\22\27\2p\2 \3\2\2\2\4\60\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nE\3\2\2\2\f"+
		"T\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22d\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2"+
		"\30l\3\2\2\2\32n\3\2\2\2\34p\3\2\2\2\36r\3\2\2\2 !\7\5\2\2!\"\5\4\3\2"+
		"\"#\7\6\2\2#%\5\24\13\2$&\5\b\5\2%$\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'\61"+
		"\5\6\4\2(-\5\22\n\2)*\7\3\2\2*,\5\22\n\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
		"-.\3\2\2\2.\61\3\2\2\2/-\3\2\2\2\60\'\3\2\2\2\60(\3\2\2\2\61\5\3\2\2\2"+
		"\62\63\5\24\13\2\63\64\7\4\2\2\64\66\3\2\2\2\65\62\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\678\7\13\2\28\7\3\2\2\29:\7\7\2\2:;\5\n\6\2;\t\3\2\2"+
		"\2<=\b\6\1\2=F\5\f\7\2>?\5\26\f\2?@\5\n\6\6@F\3\2\2\2AB\7\30\2\2BC\5\n"+
		"\6\2CD\7\31\2\2DF\3\2\2\2E<\3\2\2\2E>\3\2\2\2EA\3\2\2\2FQ\3\2\2\2GH\f"+
		"\5\2\2HI\5\30\r\2IJ\5\n\6\6JP\3\2\2\2KL\f\4\2\2LM\5\32\16\2MN\5\n\6\5"+
		"NP\3\2\2\2OG\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2"+
		"\2SQ\3\2\2\2TW\5\16\b\2UX\5\34\17\2VX\5\36\20\2WU\3\2\2\2WV\3\2\2\2XY"+
		"\3\2\2\2YZ\5\16\b\2Z\r\3\2\2\2[^\5\22\n\2\\^\5\20\t\2][\3\2\2\2]\\\3\2"+
		"\2\2^\17\3\2\2\2_`\t\2\2\2`\21\3\2\2\2ab\5\24\13\2bc\7\4\2\2ce\3\2\2\2"+
		"da\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\32\2\2g\23\3\2\2\2hi\7\32\2\2i\25\3"+
		"\2\2\2jk\7\n\2\2k\27\3\2\2\2lm\7\b\2\2m\31\3\2\2\2no\7\t\2\2o\33\3\2\2"+
		"\2pq\t\3\2\2q\35\3\2\2\2rs\t\4\2\2s\37\3\2\2\2\f%-\60\65EOQW]d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}