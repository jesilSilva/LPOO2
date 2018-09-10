
package lista5;

/**
 *
 * @author Jesiel
 */
public class Tecnico extends Assistente{

    public Tecnico(int matricula, String nome) {
        super(matricula, nome);
    }
    
    
    public Double bonusSalarial(Double salario){
        Double adicional=0.10;
        salario=salario+(salario*adicional);
        return salario;
    }
    
}
