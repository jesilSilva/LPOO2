package lista5;

/**
 *
 * @author Jesiel
 */
public class Assistente extends Funcionario{
    
    private int matricula;

    public Assistente(int matricula,String nome) {
       super(nome);
       setMatricula(matricula);
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        return "Nome:"+getNome()+"\n Matricula:"+getMatricula();
    }
    
    
}
