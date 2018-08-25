package lista2;

/**
 *
 * @author Jesiel
 */ 
    public class Empregado extends Pessoa {
    
    private float salario;

    public Empregado(float salario,String nome, int idade, float altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario=salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float obterLucros(){
        return salario;
    }
    
    
}
