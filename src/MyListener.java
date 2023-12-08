import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

public class MyListener extends UaiScriptBaseListener {

    /* A lógica para a checagem de erros é feita da seguinte forma:
     * 1. Checagem variaveis duplicadas
     * 2. Checagem variaveis não declaradas
     * 3. Checagem tipos incompativeis
     * Ou seja, por exemplo, mesmo se uma instrução com VAR tenha os 3 erros, somente aparecerá o 1º erro
    */

    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();
    private String tipoElemento = null;

    @Override
    public void exitInstrucao(UaiScriptParser.InstrucaoContext ctx) {

        // tipo VAR OpAtrib expressao FL (declaração)
        if(ctx.tipo() != null && ctx.VAR() != null && ctx.OpAtrib() != null && ctx.expressao() != null && ctx.FL() != null) {
            String id = ctx.VAR().getText();
            String tipo = ctx.tipo().getText().toString();
            if(!verificarVarDuplicacao(id, ctx.start)) {
                if(!verificarTipoIncompativelExpressao(id, tipo, ctx.start)) {
                    // declaração sucedida
                    tabelaSimbolos.put(id, tipo);
                }
            }
        }

        // tipo VAR FL (declaração)
        else if(ctx.tipo() != null && ctx.VAR() != null && ctx.FL() != null) {
            String id = ctx.VAR().getText();
            if(!verificarVarDuplicacao(id, ctx.start)) {
                // declaração sucedida
                String tipo = ctx.tipo().getText().toString();
                tabelaSimbolos.put(id, tipo);
            }
        }

        // VAR OpAtrib expressao FL
        else if(ctx.VAR() != null && ctx.OpAtrib() != null && ctx.expressao() != null && ctx.FL() != null) {
            String id = ctx.VAR().getText();
            if(!verificarVarNaoDeclarada(id, ctx.start)) {
                verificarTipoIncompativelExpressao(id, null, ctx.start);
            }
        }

        // VAR OpCrem FL
        else if(ctx.VAR() != null && ctx.OpCrem() != null && ctx.FL() != null) {
            String id = ctx.VAR().toString();
            if(!verificarVarNaoDeclarada(id, ctx.start)) {
                verificarTipoIncompativelOpCrem(id, ctx.start);
            }
        }

        // Ler VAR FL
        else if(ctx.Ler() != null && ctx.VAR() != null && ctx.FL() != null) {
            String id = ctx.VAR().toString();
            if(!verificarVarNaoDeclarada(id, ctx.start)) {
                verificarTipoIncompativelTexto(id, ctx.start);
            }
        }

        tipoElemento = null;
    }

    @Override
    public void enterExpressao(UaiScriptParser.ExpressaoContext ctx) {

        // AP expressao OpCrem? FP (considerando o OpCrem)
        if(ctx.OpCrem() != null) {
            UaiScriptParser.ElementoContext elemento = ctx.expressao(0).elemento();
            String tipo = verificarTipoElemento(elemento);
            if(!tipo.equals("cado") && !tipo.equals("tiquim")) {
                imprimirTipo(elemento.getText().toString(), tipo);
                System.out.println("\tTipo esperado: cado ou tiquim");
                imprimirErro(ctx.expressao(0).start);
            }
            if(tipoElemento != null && !tipo.equals(tipoElemento)) {
                tipoElemento = "indefinido";
            }
        }

        // elemento
        if(ctx.elemento() != null) {
            if(tipoElemento == null) {
                tipoElemento = verificarTipoElemento(ctx.elemento());
            }
            else if(!tipoElemento.equals("indefinido")) {
                tipoElemento = verificarTipoElemento(ctx.elemento());
            }
        }

        // expressao OpArit expressao
        else if(ctx.OpArit() != null) {

            UaiScriptParser.ElementoContext elemento1 = ctx.expressao(0).elemento();
            String tipo1 = "indefinido";
            if(elemento1 != null) {
                tipo1 = verificarTipoElemento(elemento1);
            }
            
            UaiScriptParser.ElementoContext elemento2 = ctx.expressao(1).elemento();
            String tipo2 = "indefinido";
            if(elemento2 != null) {
                tipo2 = verificarTipoElemento(elemento2);
            }

            if(!tipo1.equals("indefinido") && tipo2.equals("indefinido")) {
                tipoElemento = tipo1;
            }
            else if(tipo1.equals("indefinido") && !tipo2.equals("indefinido")) {
                tipoElemento = tipo2;
            }
            else if(!tipo1.equals(tipo2)) {
                tipoElemento = "indefinido";
            }
        }
    }

    private String verificarTipoElemento(UaiScriptParser.ElementoContext ctx) {
        if(ctx.BoolValue() != null) {
            return ctx.BoolValue().getText().toString();
        }
        else if(ctx.NumI() != null) {
            return "cado";
        }
        else if(ctx.NumR() != null) {
            return "tiquim";
        }
        else if(ctx.Str() != null) {
            return "trem";
        }
        else if(ctx.VAR() != null) {
            String id = ctx.VAR().toString();

            if(verificarVarNaoDeclarada(id, ctx.start)) {
                return "indefinido";
            }
            else {
                return tabelaSimbolos.get(id);
            }
        }
        return "indefinido";
    }

    // Checagem variável duplicada
    private boolean verificarVarDuplicacao(String id, Token start) {
        if(tabelaSimbolos.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já foi declarada!");
            imprimirErro(start);
            return true;
        }
        else {
            return false;
        }
    }

    // Checagem variável não declarada
    private boolean verificarVarNaoDeclarada(String id, Token start) {
        if(!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não foi declarada!");
            imprimirErro(start);
            return true;
        }
        else {
            return false;
        }
    }

    // Checagem tipos incompatíveis para expressao
    private boolean verificarTipoIncompativelExpressao(String id, String tipo, Token start) {
        // se a variável foi declarada
        if(tipo == null) {
            tipo = tabelaSimbolos.get(id);
        }
        
        if(!tipo.equals(tipoElemento)) {
            imprimirTipo(id, tipo);
            System.out.println("\tTipo da expressao: " + tipoElemento);
            imprimirErro(start);
            return true;
        }
        else {
            return false;
        }
    }

    // Checagem tipos incompatíveis para OpCrem
    private void verificarTipoIncompativelOpCrem(String id, Token start) {
        String tipo = tabelaSimbolos.get(id);
        
        if(!tipo.equals("cado") && !tipo.equals("tiquim")) {
            imprimirTipo(id, tipo);
            System.out.println("\tTipo esperado: cado ou tiquim");
            imprimirErro(start);
        }
    }

    // Checagem tipos incompatíveis para texto
    private void verificarTipoIncompativelTexto(String id, Token start) {
        String tipo = tabelaSimbolos.get(id);
        
        if(!tipo.equals("trem")) {
            imprimirTipo(id, tipo);
            System.out.println("\tTipo esperado: trem");
            imprimirErro(start);
        }
    }

    // Imprime no terminal o tipo de id, função auxiliar para verificarTipoIncompativel*
    private void imprimirTipo(String id, String tipo) {
        System.out.println("Tipo incompatível com a variável/valor: " + id);
        System.out.println("\tTipo de " + id + ": " + tipo);
    }

    // Imprime no terminal a linha e posições referentes a certo erro
    private void imprimirErro(Token start) {
        System.out.println("\tLinha: " + start.getLine());
        System.out.println("\tPos Inicial: " + start.getStartIndex());
        System.out.println("\tPos Final: " + start.getStopIndex());
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
