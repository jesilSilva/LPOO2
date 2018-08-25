package lista2;

/**
 *
 * @author Jesiel
 */
public class Cachorro extends Animal {

    private String raca;
    private String nome;

    public Cachorro(String raca, String nome, String tipo, String cor) {
        super(tipo, cor);
        this.raca = raca;
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return super.toString() + "\n Raça:" + raca + "\n Nome:" + nome;
    }

}
