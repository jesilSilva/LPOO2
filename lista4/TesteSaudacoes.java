package lista4;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesiel
 */
public class TesteSaudacoes {

    public static void main(String args[]) {

        CartaoWeb[] cartaoWeb = new CartaoWeb[3];

        Aniversario aniversario = new Aniversario("");
        Natal natal = new Natal("");
        DiaDosNamorados diaDosNamorados = new DiaDosNamorados("");

        cartaoWeb[0] = aniversario;
        cartaoWeb[1] = natal;
        cartaoWeb[2] = diaDosNamorados;

        for (int i = 0; i < cartaoWeb.length; i++) {
            String remetente = JOptionPane.showInputDialog("Informe o remetente");

            JOptionPane.showMessageDialog(null, cartaoWeb[i].retornarMensagem(remetente));
        }

    }

}
