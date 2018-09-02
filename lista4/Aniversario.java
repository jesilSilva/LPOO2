package lista4;

/**
 *
 * @author Jesiel
 */
public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
        return remetente + " Feliz aniversário!";
    }

}
