package lista2;

/**
 *
 * @author Jesiel
 */
public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    private String sexo;

      public Pessoa(String nome, int idade, float altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
