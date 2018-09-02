package lista3;

/**
 *
 * @author Jesiel
 */
public abstract class AparelhoEletronico {
    
    private String cor;
   private double altura;

    public AparelhoEletronico(String cor, double altura) {
        this.cor = cor;
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  
}
