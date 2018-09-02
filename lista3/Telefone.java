package lista3;

/**
 *
 * @author Jesiel
 */
public class Telefone  extends AparelhoEletronico{

private int numero;

    public Telefone(int numero, String cor, double altura) {
        super(cor, altura);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
