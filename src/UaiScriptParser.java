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
		RULE_tipo = 4, RULE_bloco = 5, RULE_elemento = 6, RULE_numero = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucao", "expressao", "condicao", "tipo", "bloco", "elemento", 
			"numero"
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				instrucao();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4196158L) != 0) );
			setState(21);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				tipo();
				setState(24);
				match(VAR);
				setState(25);
				match(FL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				tipo();
				setState(28);
				match(VAR);
				setState(29);
				match(OpAtrib);
				setState(30);
				expressao();
				setState(31);
				match(FL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(VAR);
				setState(34);
				match(OpAtrib);
				setState(35);
				expressao();
				setState(36);
				match(FL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(VAR);
				setState(39);
				match(OpCrem);
				setState(40);
				match(FL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(Truco);
				setState(42);
				condicao(0);
				setState(43);
				bloco();
				setState(44);
				match(MeiPau);
				setState(45);
				bloco();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(Truco);
				setState(48);
				condicao(0);
				setState(49);
				bloco();
				setState(50);
				match(Corri);
				setState(51);
				bloco();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				match(Truco);
				setState(54);
				condicao(0);
				setState(55);
				bloco();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(TodaVida);
				setState(58);
				condicao(0);
				setState(59);
				bloco();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				match(Ler);
				setState(62);
				match(VAR);
				setState(63);
				match(FL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				match(Mostrar);
				setState(65);
				expressao();
				setState(66);
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
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(UaiScriptParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(UaiScriptParser.VAR, i);
		}
		public List<TerminalNode> OpArit() { return getTokens(UaiScriptParser.OpArit); }
		public TerminalNode OpArit(int i) {
			return getToken(UaiScriptParser.OpArit, i);
		}
		public TerminalNode OpCrem() { return getToken(UaiScriptParser.OpCrem, 0); }
		public TerminalNode AP() { return getToken(UaiScriptParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(UaiScriptParser.FP, 0); }
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
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressao);
		try {
			int _alt;
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				elemento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NumI:
				case NumR:
					{
					setState(71);
					numero();
					}
					break;
				case VAR:
					{
					setState(72);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(75);
						match(OpArit);
						setState(78);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NumI:
						case NumR:
							{
							setState(76);
							numero();
							}
							break;
						case VAR:
							{
							setState(77);
							match(VAR);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NumI:
				case NumR:
					{
					setState(85);
					numero();
					}
					break;
				case VAR:
					{
					setState(86);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89);
				match(OpCrem);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(AP);
				setState(91);
				expressao();
				setState(92);
				match(FP);
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
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode BoolValue() { return getToken(UaiScriptParser.BoolValue, 0); }
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(97);
				match(BoolValue);
				}
				break;
			case 2:
				{
				setState(98);
				expressao();
				setState(99);
				match(OpRel);
				setState(100);
				expressao();
				}
				break;
			case 3:
				{
				setState(102);
				match(AP);
				setState(103);
				condicao(0);
				setState(104);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicao);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(OpLog);
					setState(110);
					condicao(3);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(116);
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
			setState(118);
			match(AB);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				instrucao();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4196158L) != 0) );
			setState(124);
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
			setState(126);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NumI() { return getToken(UaiScriptParser.NumI, 0); }
		public TerminalNode NumR() { return getToken(UaiScriptParser.NumR, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UaiScriptListener ) ((UaiScriptListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==NumI || _la==NumR) ) {
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
		case 3:
			return condicao_sempred((CondicaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicao_sempred(CondicaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001E\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0005\u0002Q\b\u0002"+
		"\n\u0002\f\u0002T\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002X\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"_\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"k\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003p\b\u0003\n\u0003"+
		"\f\u0003s\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004"+
		"\u0005y\b\u0005\u000b\u0005\f\u0005z\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0001\u0006\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000\u0001\u0004\u0002"+
		"\u0000\u000b\u000b\u0016\u0019\u0001\u0000\u0017\u0018\u008f\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004^\u0001\u0000"+
		"\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000"+
		"\nv\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e\u0080\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0003\b\u0004\u0000\u0018\u0019\u0005\u0016"+
		"\u0000\u0000\u0019\u001a\u0005\u0015\u0000\u0000\u001aE\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0003\b\u0004\u0000\u001c\u001d\u0005\u0016\u0000\u0000"+
		"\u001d\u001e\u0005\u0010\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000"+
		"\u001f \u0005\u0015\u0000\u0000 E\u0001\u0000\u0000\u0000!\"\u0005\u0016"+
		"\u0000\u0000\"#\u0005\u0010\u0000\u0000#$\u0003\u0004\u0002\u0000$%\u0005"+
		"\u0015\u0000\u0000%E\u0001\u0000\u0000\u0000&\'\u0005\u0016\u0000\u0000"+
		"\'(\u0005\u000f\u0000\u0000(E\u0005\u0015\u0000\u0000)*\u0005\u0005\u0000"+
		"\u0000*+\u0003\u0006\u0003\u0000+,\u0003\n\u0005\u0000,-\u0005\u0006\u0000"+
		"\u0000-.\u0003\n\u0005\u0000.E\u0001\u0000\u0000\u0000/0\u0005\u0005\u0000"+
		"\u000001\u0003\u0006\u0003\u000012\u0003\n\u0005\u000023\u0005\u0007\u0000"+
		"\u000034\u0003\n\u0005\u00004E\u0001\u0000\u0000\u000056\u0005\u0005\u0000"+
		"\u000067\u0003\u0006\u0003\u000078\u0003\n\u0005\u00008E\u0001\u0000\u0000"+
		"\u00009:\u0005\b\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0003\n\u0005"+
		"\u0000<E\u0001\u0000\u0000\u0000=>\u0005\t\u0000\u0000>?\u0005\u0016\u0000"+
		"\u0000?E\u0005\u0015\u0000\u0000@A\u0005\n\u0000\u0000AB\u0003\u0004\u0002"+
		"\u0000BC\u0005\u0015\u0000\u0000CE\u0001\u0000\u0000\u0000D\u0017\u0001"+
		"\u0000\u0000\u0000D\u001b\u0001\u0000\u0000\u0000D!\u0001\u0000\u0000"+
		"\u0000D&\u0001\u0000\u0000\u0000D)\u0001\u0000\u0000\u0000D/\u0001\u0000"+
		"\u0000\u0000D5\u0001\u0000\u0000\u0000D9\u0001\u0000\u0000\u0000D=\u0001"+
		"\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000"+
		"\u0000F_\u0003\f\u0006\u0000GJ\u0003\u000e\u0007\u0000HJ\u0005\u0016\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JR\u0001\u0000"+
		"\u0000\u0000KN\u0005\f\u0000\u0000LO\u0003\u000e\u0007\u0000MO\u0005\u0016"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S_\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000UX\u0003\u000e\u0007\u0000VX\u0005\u0016"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y_\u0005\u000f\u0000\u0000Z[\u0005\u0011\u0000\u0000"+
		"[\\\u0003\u0004\u0002\u0000\\]\u0005\u0012\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^F\u0001\u0000\u0000\u0000^I\u0001\u0000\u0000\u0000^W\u0001\u0000"+
		"\u0000\u0000^Z\u0001\u0000\u0000\u0000_\u0005\u0001\u0000\u0000\u0000"+
		"`a\u0006\u0003\uffff\uffff\u0000ak\u0005\u000b\u0000\u0000bc\u0003\u0004"+
		"\u0002\u0000cd\u0005\r\u0000\u0000de\u0003\u0004\u0002\u0000ek\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0011\u0000\u0000gh\u0003\u0006\u0003\u0000hi\u0005"+
		"\u0012\u0000\u0000ik\u0001\u0000\u0000\u0000j`\u0001\u0000\u0000\u0000"+
		"jb\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000kq\u0001\u0000\u0000"+
		"\u0000lm\n\u0002\u0000\u0000mn\u0005\u000e\u0000\u0000np\u0003\u0006\u0003"+
		"\u0003ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0007\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\t\u0001\u0000\u0000"+
		"\u0000vx\u0005\u0013\u0000\u0000wy\u0003\u0002\u0001\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\u0014\u0000\u0000"+
		"}\u000b\u0001\u0000\u0000\u0000~\u007f\u0007\u0001\u0000\u0000\u007f\r"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0002\u0000\u0000\u0081\u000f"+
		"\u0001\u0000\u0000\u0000\n\u0013DINRW^jqz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}