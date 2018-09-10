package lista5;

/**
 *
 * @author Jesiel
 */
public class CamaroteSuperior extends Vip{
    
    
    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    @Override
    public double imprimeValor(){
        
        Double ingressoCamarote = (super.imprimeValor() + adicional) ;
        return ingressoCamarote;
    }
    
    
    
}
