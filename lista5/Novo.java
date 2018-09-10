package lista5;

/**
 *
 * @author Jesiel
 */
public class Novo extends Imovel {

    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public String valorComAdicional() {

        return "O valor com adicional é: R$" + (super.getPreco() + getAdicional());
    }

}
