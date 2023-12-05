import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener extends UaiScriptBaseListener {

    // checagem variaveis duplicadas OK
    // checagem variaveis não declaradas OK?
    // checagem tipos incompativeis 
    
    // <id, tipo>
    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

    @Override
    public void exitInstrucao(UaiScriptParser.InstrucaoContext ctx) {

        // tipo VAR FL
        if(ctx.tipo() != null && ctx.VAR() != null && ctx.FL() != null) {
            regraInstrucaoVerificarVarDuplicacao(ctx);
        }

        // tipo VAR OpAtrib expressao FL
        if(ctx.tipo() != null && ctx.VAR() != null && ctx.OpAtrib() != null && ctx.expressao() != null && ctx.FL() != null) {
            regraInstrucaoVerificarVarDuplicacao(ctx);
        }

        // VAR OpAtrib expressao FL
        if(ctx.VAR() != null && ctx.OpAtrib() != null && ctx.expressao() != null && ctx.FL() != null) {
            regraInstrucaoVerificarVarNaoDeclarada(ctx);
        }

        // VAR OpCrem FL
        if(ctx.VAR() != null && ctx.OpCrem() != null && ctx.FL() != null) {
            regraInstrucaoVerificarVarNaoDeclarada(ctx);

            String id = ctx.VAR().toString();

            // checagem tipos incompatíveis
            if(tabelaSimbolos.containsKey(id)) {
                String tipo = tabelaSimbolos.get(id);

                if(!tipo.equals("cado") || !tipo.equals("tiquim")) {
                    System.out.println("Tentativa de tipo incompatível com a variável " + id);
                    System.out.println("\tTipo de " + id + ": " + tipo);
                    System.out.println("\tTipo esperado: cado ou tiquim");
                    regraInstrucaoImprimir(ctx);
                }
            }
        }
    }

    @Override
    public void exitElemento(UaiScriptParser.ElementoContext ctx) {
        TerminalNode idAux = ctx.VAR();

        if(idAux != null) {
            String id = idAux.toString();
            if(!tabelaSimbolos.containsKey(id)) {
                System.out.println("Variável " + id + " não foi declarada!");
                System.out.println("\tLinha: " + ctx.start.getLine());
                System.out.println("\tPos Inicial: " + ctx.start.getStartIndex());
                System.out.println("\tPos Final: " + ctx.start.getStopIndex());
            }
        }
    }

    // Checagem variável duplicada para a regra instrucao
    private void regraInstrucaoVerificarVarDuplicacao(UaiScriptParser.InstrucaoContext ctx) {
        String tipo = ctx.tipo().getText().toString();
        String id = ctx.VAR().toString();
        
        if(tabelaSimbolos.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já foi declarada!");
            regraInstrucaoImprimir(ctx);
        }
        else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    // Checagem variável não declarada para a regra instrucao
    private void regraInstrucaoVerificarVarNaoDeclarada(UaiScriptParser.InstrucaoContext ctx) {
        String id = ctx.VAR().toString();

        if(!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não foi declarada!");
            regraInstrucaoImprimir(ctx);
        }
    }

    private void regraInstrucaoImprimir(UaiScriptParser.InstrucaoContext ctx) {
        System.out.println("\tLinha: " + ctx.start.getLine());
        System.out.println("\tPos Inicial: " + ctx.start.getStartIndex());
        System.out.println("\tPos Final: " + ctx.start.getStopIndex());
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
