package lista5;

/**
 *
 * @author Jesiel
 */
public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public String Mia() {
        return "Miau miau miau miau!!!";
    }

    @Override
    public String caminhar() {
        return "O gato caminha...";
    }

    
}
