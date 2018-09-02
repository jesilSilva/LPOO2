package lista3;

/**
 *
 * @author Jesiel
 */
public class Tablet extends AparelhoEletronico {

    private String tipoTela;

    public Tablet(String tipoTela, String cor, double altura) {
        super(cor, altura);
        this.tipoTela = tipoTela;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

}
