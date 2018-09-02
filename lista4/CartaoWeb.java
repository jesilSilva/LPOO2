package lista4;

/**
 *
 * @author Jesiel
 */
public abstract class CartaoWeb {

private String destinatario;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

abstract String retornarMensagem(String remetente);

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }


}
