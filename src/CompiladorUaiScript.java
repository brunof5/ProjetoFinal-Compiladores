import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class CompiladorUaiScript {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do arquivo desejado:\n1. Deve estar presente na pasta casosTeste.\n2. Não é preciso colocar a extensão do arquivo.");
        String nomeArquivo = entrada.nextLine();
        String filename = "D:\\codes\\[5] Compiladores\\ProjetoFinal-Compiladores\\casosTeste\\" + nomeArquivo + ".txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            UaiScriptLexer lexer = new UaiScriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UaiScriptParser parser = new UaiScriptParser(tokens);

            ParseTree ast = parser.programa();

            System.out.println(ast.toStringTree());

            // interface gráfica
            JFrame frame = new JFrame("Árvore Sintática foda");

            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), ast);
            viewer.setScale(1.75);
            panel.add(viewer);

            JScrollPane scroll = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            scroll.setVisible(true);

            frame.add(scroll);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);
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
