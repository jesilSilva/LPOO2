package lista2;

/**
 *
 * @author Jesiel
 */
public class Animal {

    private String tipo;
    private String cor;

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Dados do Animal: \n Tipo:" + tipo + "\n Cor:" + cor;
    }

}
