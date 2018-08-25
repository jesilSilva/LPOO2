package lista2;

/**
 *
 * @author Jesiel
 */
public class Coker extends Cachorro {

    private boolean tosa;

     public Coker(boolean tosa, String raca, String nome, String tipo, String cor) {
        super(raca, nome, tipo, cor);
        this.tosa = tosa;
    }
    
    public boolean precisaTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

   

}
