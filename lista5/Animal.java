package lista5;

/**
 *
 * @author Jesiel
 */
public abstract class Animal {

    private String nome;
    private String raca;

    public Animal() {
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public abstract String caminhar();

}
