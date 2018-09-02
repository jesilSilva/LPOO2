package lista4;

/**
 *
 * @author Jesiel
 */
public abstract class Building implements CarbonFootprint {

    private int numeroDePessoas;
    private boolean usoDeEnergiaRenovavel;
    private int numeroDeLampadas;
    private boolean usoDeArCondicionado;

    public Building(int numeroDePessoas, boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado) {
        this.numeroDePessoas = numeroDePessoas;
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
        this.numeroDeLampadas = numeroDeLampadas;
        this.usoDeArCondicionado = usoDeArCondicionado;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public boolean isUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public int getNumeroDeLampadas() {
        return numeroDeLampadas;
    }

    public void setNumeroDeLampadas(int numeroDeLampadas) {
        this.numeroDeLampadas = numeroDeLampadas;
    }

    public boolean isUsoDeArCondicionado() {
        return usoDeArCondicionado;
    }

    public void setUsoDeArCondicionado(boolean usoDeArCondicionado) {
        this.usoDeArCondicionado = usoDeArCondicionado;
    }

    @Override
    public double getCarbonFootprint() {
        int formulaCO2 = 0;
        Double km = 1.0;
        Double emissao = km / formulaCO2;
        if (this.usoDeArCondicionado == true && this.usoDeEnergiaRenovavel == true) {
            formulaCO2 = 700;
            emissao = km / formulaCO2;
        } else {
            if (this.usoDeArCondicionado == false && this.usoDeEnergiaRenovavel == true) {
                formulaCO2 = 600;
                emissao = km / formulaCO2;
            } else {
                if (this.usoDeArCondicionado == true && this.usoDeEnergiaRenovavel == false) {
                    formulaCO2 = 600;
                    emissao = km / formulaCO2;
                } else {
                    if (this.usoDeArCondicionado == false && this.usoDeEnergiaRenovavel == false) {
                        formulaCO2 = 300;
                        emissao = km / formulaCO2;
                    }
                }
            }
        }
        
            return emissao;
        }

    }
