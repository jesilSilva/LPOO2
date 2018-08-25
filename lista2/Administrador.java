package lista2;

/**
 *
 * @author Jesiel
 */
public class Administrador extends  Empregado{
    
    private float ajudaDeCusto;

    public Administrador(float salario, String nome, int idade, float altura, String sexo) {
        super(salario, nome, idade, altura, sexo);
    }

    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public float obterLucros(){
        return   ( super.getSalario()+this.ajudaDeCusto);
    }
    
}
