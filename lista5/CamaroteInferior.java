package lista5;

/**
 *
 * @author Jesiel
 */
public class CamaroteInferior extends Vip {

    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String localizacao() {
        return "Localização:" + getLocalizacao();
    }

}
