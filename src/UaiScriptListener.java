// Generated from UaiScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UaiScriptParser}.
 */
public interface UaiScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(UaiScriptParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(UaiScriptParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(UaiScriptParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(UaiScriptParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(UaiScriptParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(UaiScriptParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(UaiScriptParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(UaiScriptParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(UaiScriptParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(UaiScriptParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(UaiScriptParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(UaiScriptParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(UaiScriptParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(UaiScriptParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link UaiScriptParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(UaiScriptParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link UaiScriptParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(UaiScriptParser.NumeroContext ctx);
}