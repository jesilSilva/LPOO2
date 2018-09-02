package lista4;

/**
 *
 * @author Jesiel
 */
public class House extends Building{
    
    private double areaOcupada;

    public House(double areaOcupada, int numeroDePessoas, boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado) {
        super(numeroDePessoas, usoDeEnergiaRenovavel, numeroDeLampadas, usoDeArCondicionado);
        this.areaOcupada = areaOcupada;
    }

    public double getAreaOcupada() {
        return areaOcupada;
    }

    public void setAreaOcupada(double areaOcupada) {
        this.areaOcupada = areaOcupada;
    }
    
    
}
