import java.io.IOException;
import java.nio.file.NoSuchFileException;

import java.util.Scanner;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class ExemploLexer {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do arquivo desejado:\n1. Deve estar presente na pasta casosTeste.\n2. Não é preciso colocar a extensão do arquivo.");
        String nomeArquivo = entrada.nextLine();
        String filename = "D:\\codes\\[5] Compiladores\\ProjetoFinal-Compiladores\\casosTeste\\" + nomeArquivo + ".txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            UaiScriptLexer lexer = new UaiScriptLexer(input);

            Token token;
            while(!lexer._hitEOF) {
                token = lexer.nextToken();
                int lexemaIndex = token.getType();
                String lexema = lexer.getVocabulary().getSymbolicName(token.getType());
                if(lexema.equals("EOF")) {
                    continue;
                }
                if((lexemaIndex >= 1 && lexemaIndex <= 10) || (lexemaIndex >= 16 && lexemaIndex <= 21)) {
                    System.out.println("Token: <" + lexema + ">");
                }
                else {
                    System.out.println("Token: <" + lexema + ", " + token.getText() + ">");
                }
                System.out.println("\tLinha: " + token.getLine());
                System.out.println("\tPos Inicial: " + token.getStartIndex());
                System.out.println("\tPos Final: " + token.getStopIndex());
            }
        }
        catch(NoSuchFileException e) {
            System.out.println("Nome inválido ou não existe!");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        entrada.close();
    }
}
