package lista4;

/**
 *
 * @author Jesiel
 */
public class School extends Building {

    private boolean areaVerde;

    public School(boolean areaVerde, int numeroDePessoas, boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado) {
        super(numeroDePessoas, usoDeEnergiaRenovavel, numeroDeLampadas, usoDeArCondicionado);
        this.areaVerde = areaVerde;
    }

    public boolean isAreaVerde() {
        return areaVerde;
    }

    public void setAreaVerde(boolean areaVerde) {
        this.areaVerde = areaVerde;
    }

}
