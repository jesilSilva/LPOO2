package lista3;

/**
 *
 * @author Jesiel
 */
public class Computador extends AparelhoEletronico {

    private String ip;

    public Computador(String ip, String cor, double altura) {
        super(cor, altura);
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
