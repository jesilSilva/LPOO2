package lista5;

/**
 *
 * @author Jesiel
 */
public class Administrativo extends Assistente{

    public Administrativo(int matricula, String nome) {
        super(matricula, nome);
    }
    
    
    
    public Double adicional(Double salario){
        double adicional=0.20;
        
        salario= salario+(salario*adicional);
        return salario;
    }
    
}
