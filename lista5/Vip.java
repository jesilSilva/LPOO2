package lista5;

/**
 *
 * @author Jesiel
 */
public class Vip extends Ingresso {

    @Override
    public double imprimeValor() {

        Double ingressoVip = (super.imprimeValor() * 0.20) + super.imprimeValor();
        return ingressoVip;
    }
}
