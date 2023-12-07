// Generated from UaiScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UaiScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Cado=1, Tiquim=2, Trem=3, Paia=4, Truco=5, MeiPau=6, Corri=7, TodaVida=8, 
		Ler=9, Mostrar=10, BoolValue=11, OpArit=12, OpRel=13, OpLog=14, OpCrem=15, 
		OpAtrib=16, AP=17, FP=18, AB=19, FB=20, FL=21, VAR=22, NumI=23, NumR=24, 
		Str=25, WS=26;
	public static final int
		RULE_programa = 0, RULE_instrucao = 1, RULE_expressao = 2, RULE_condicao = 3, 
		RULE_tipo = 4, RULE_bloco = 5, RULE_elemento = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucao", "expressao", "condicao", "tipo", "bloco", "elemento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cado'", "'tiquim'", "'trem'", "'paia'", "'truco'", "'meiPau'", 
			"'corri'", "'todaVida'", "'ler'", "'mostrar'", null, null, null, null, 
			null, "'<-|'", "'('", "')'", "'{'", "'}'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Cado", "Tiquim", "Trem", "Paia", "Truco", "MeiPau", "Corri", "TodaVida", 
			"Ler", "Mostrar", "BoolValue", "OpArit", "OpRel", "OpLog", "OpCrem", 
			"OpAtrib", "AP", "FP", "AB", "FB", "FL", "VAR", "NumI", "NumR", "Str", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "UaiScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UaiScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UaiScriptParser.EOF, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				instrucao();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4196158L) != 0) );
			setState(19);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(UaiScriptParser.VAR, 0); }
		public TerminalNode FL() { return getToken(UaiScriptParser.FL, 0); }
		public TerminalNode OpAtrib() { return getToken(UaiScriptParser.OpAtrib, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode OpCrem() { return getToken(UaiScriptParser.OpCrem, 0); }
		public TerminalNode Truco() { return getToken(UaiScriptParser.Truco, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode MeiPau() { return getToken(UaiScriptParser.MeiPau, 0); }
		public TerminalNode Corri() { return getToken(UaiScriptParser.Corri, 0); }
		public TerminalNode TodaVida() { return getToken(UaiScriptParser.TodaVida, 0); }
		public TerminalNode Ler() { return getToken(UaiScriptParser.Ler, 0); }
		public TerminalNode Mostrar() { return getToken(UaiScriptParser.Mostrar, 0); }
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucao);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				tipo();
				setState(22);
				match(VAR);
				setState(23);
				match(FL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				tipo();
				setState(26);
				match(VAR);
				setState(27);
				match(OpAtrib);
				setState(28);
				expressao(0);
				setState(29);
				match(FL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(VAR);
				setState(32);
				match(OpAtrib);
				setState(33);
				expressao(0);
				setState(34);
				match(FL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(VAR);
				setState(37);
				match(OpCrem);
				setState(38);
				match(FL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(Truco);
				setState(40);
				condicao(0);
				setState(41);
				bloco();
				setState(42);
				match(MeiPau);
				setState(43);
				bloco();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(Truco);
				setState(46);
				condicao(0);
				setState(47);
				bloco();
				setState(48);
				match(Corri);
				setState(49);
				bloco();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				match(Truco);
				setState(52);
				condicao(0);
				setState(53);
				bloco();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(TodaVida);
				setState(56);
				condicao(0);
				setState(57);
				bloco();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				match(Ler);
				setState(60);
				match(VAR);
				setState(61);
				match(FL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				match(Mostrar);
				setState(63);
				expressao(0);
				setState(64);
				match(FL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public TerminalNode OpCrem() { return getToken(UaiScriptParser.OpCrem, 0); }
		public TerminalNode OpArit() { return getToken(UaiScriptParser.OpArit, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolValue:
			case VAR:
			case NumI:
			case NumR:
			case Str:
				{
				setState(69);
				elemento();
				}
				break;
			case AP:
				{
				setState(70);
				match(AP);
				setState(71);
				expressao(0);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpCrem) {
					{
					setState(72);
					match(OpCrem);
					}
				}

				setState(75);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(79);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(80);
					match(OpArit);
					setState(81);
					expressao(3);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OpRel() { return getToken(UaiScriptParser.OpRel, 0); }
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
		public TerminalNode OpLog() { return getToken(UaiScriptParser.OpLog, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		return condicao(0);
	}

	private CondicaoContext condicao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicaoContext _localctx = new CondicaoContext(_ctx, _parentState);
		CondicaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_condicao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(88);
				expressao(0);
				}
				break;
			case 2:
				{
				setState(89);
				expressao(0);
				setState(90);
				match(OpRel);
				setState(91);
				expressao(0);
				}
				break;
			case 3:
				{
				setState(93);
				match(AP);
				setState(94);
				condicao(0);
				setState(95);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicao);
					setState(99);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(100);
					match(OpLog);
					setState(101);
					condicao(3);
					}
					} 
				}
				setState(106);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode Cado() { return getToken(UaiScriptParser.Cado, 0); }
		public TerminalNode Tiquim() { return getToken(UaiScriptParser.Tiquim, 0); }
		public TerminalNode Trem() { return getToken(UaiScriptParser.Trem, 0); }
		public TerminalNode Paia() { return getToken(UaiScriptParser.Paia, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode AB() { return getToken(UaiScriptParser.AB, 0); }
		public TerminalNode FB() { return getToken(UaiScriptParser.FB, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(AB);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				instrucao();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4196158L) != 0) );
			setState(115);
			match(FB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(UaiScriptParser.VAR, 0); }
		public TerminalNode NumI() { return getToken(UaiScriptParser.NumI, 0); }
		public TerminalNode NumR() { return getToken(UaiScriptParser.NumR, 0); }
		public TerminalNode BoolValue() { return getToken(UaiScriptParser.BoolValue, 0); }
		public TerminalNode Str() { return getToken(UaiScriptParser.Str, 0); }
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitElemento(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62916608L) != 0)) ) {
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
		case 2:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 3:
			return condicao_sempred((CondicaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condicao_sempred(CondicaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ax\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005p\b\u0005\u000b\u0005"+
		"\f\u0005q\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0000\u0002\u0004\u0006\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0002"+
		"\u0001\u0000\u0001\u0004\u0002\u0000\u000b\u000b\u0016\u0019\u0081\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004M\u0001"+
		"\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000"+
		"\u0000\nm\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e\u0010"+
		"\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0003\b\u0004\u0000\u0016\u0017\u0005\u0016\u0000\u0000\u0017\u0018\u0005"+
		"\u0015\u0000\u0000\u0018C\u0001\u0000\u0000\u0000\u0019\u001a\u0003\b"+
		"\u0004\u0000\u001a\u001b\u0005\u0016\u0000\u0000\u001b\u001c\u0005\u0010"+
		"\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0015"+
		"\u0000\u0000\u001eC\u0001\u0000\u0000\u0000\u001f \u0005\u0016\u0000\u0000"+
		" !\u0005\u0010\u0000\u0000!\"\u0003\u0004\u0002\u0000\"#\u0005\u0015\u0000"+
		"\u0000#C\u0001\u0000\u0000\u0000$%\u0005\u0016\u0000\u0000%&\u0005\u000f"+
		"\u0000\u0000&C\u0005\u0015\u0000\u0000\'(\u0005\u0005\u0000\u0000()\u0003"+
		"\u0006\u0003\u0000)*\u0003\n\u0005\u0000*+\u0005\u0006\u0000\u0000+,\u0003"+
		"\n\u0005\u0000,C\u0001\u0000\u0000\u0000-.\u0005\u0005\u0000\u0000./\u0003"+
		"\u0006\u0003\u0000/0\u0003\n\u0005\u000001\u0005\u0007\u0000\u000012\u0003"+
		"\n\u0005\u00002C\u0001\u0000\u0000\u000034\u0005\u0005\u0000\u000045\u0003"+
		"\u0006\u0003\u000056\u0003\n\u0005\u00006C\u0001\u0000\u0000\u000078\u0005"+
		"\b\u0000\u000089\u0003\u0006\u0003\u00009:\u0003\n\u0005\u0000:C\u0001"+
		"\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u0005\u0016\u0000\u0000=C\u0005"+
		"\u0015\u0000\u0000>?\u0005\n\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0005"+
		"\u0015\u0000\u0000AC\u0001\u0000\u0000\u0000B\u0015\u0001\u0000\u0000"+
		"\u0000B\u0019\u0001\u0000\u0000\u0000B\u001f\u0001\u0000\u0000\u0000B"+
		"$\u0001\u0000\u0000\u0000B\'\u0001\u0000\u0000\u0000B-\u0001\u0000\u0000"+
		"\u0000B3\u0001\u0000\u0000\u0000B7\u0001\u0000\u0000\u0000B;\u0001\u0000"+
		"\u0000\u0000B>\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000\u0000"+
		"DE\u0006\u0002\uffff\uffff\u0000EN\u0003\f\u0006\u0000FG\u0005\u0011\u0000"+
		"\u0000GI\u0003\u0004\u0002\u0000HJ\u0005\u000f\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005"+
		"\u0012\u0000\u0000LN\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000"+
		"MF\u0001\u0000\u0000\u0000NT\u0001\u0000\u0000\u0000OP\n\u0002\u0000\u0000"+
		"PQ\u0005\f\u0000\u0000QS\u0003\u0004\u0002\u0003RO\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U\u0005\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0006"+
		"\u0003\uffff\uffff\u0000Xb\u0003\u0004\u0002\u0000YZ\u0003\u0004\u0002"+
		"\u0000Z[\u0005\r\u0000\u0000[\\\u0003\u0004\u0002\u0000\\b\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0011\u0000\u0000^_\u0003\u0006\u0003\u0000_`\u0005"+
		"\u0012\u0000\u0000`b\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000"+
		"aY\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000bh\u0001\u0000\u0000"+
		"\u0000cd\n\u0002\u0000\u0000de\u0005\u000e\u0000\u0000eg\u0003\u0006\u0003"+
		"\u0003fc\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0007\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\t\u0001\u0000\u0000"+
		"\u0000mo\u0005\u0013\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u0014\u0000\u0000"+
		"t\u000b\u0001\u0000\u0000\u0000uv\u0007\u0001\u0000\u0000v\r\u0001\u0000"+
		"\u0000\u0000\b\u0011BIMTahq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}