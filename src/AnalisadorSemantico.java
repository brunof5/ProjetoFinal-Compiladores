import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class AnalisadorSemantico {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do arquivo desejado:\n1. Deve estar presente na pasta casosTeste.\n2. Não é preciso colocar a extensão do arquivo.");
        String nomeArquivo = entrada.nextLine();
        String filename = "D:\\codes\\[5] Compiladores\\ProjetoFinal-Compiladores\\casosTeste\\" + nomeArquivo + ".txt";

        UaiScriptParser parser = getParser(filename);

        if(parser != null) {
            ParseTree ast = parser.programa();

            MyListener listener = new MyListener();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener, ast);

            System.out.println(listener.getTabelaSimbolos().toString());
        }

        entrada.close();
    }

    private static UaiScriptParser getParser(String filename) {
        UaiScriptParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(filename);
            UaiScriptLexer lexer = new UaiScriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new UaiScriptParser(tokens);
        }
        catch(NoSuchFileException e) {
            System.out.println("Nome inválido ou não existe!");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}
