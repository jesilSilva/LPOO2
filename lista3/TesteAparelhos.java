package lista3;

/**
 *
 * @author Jesiel
 */
public class TesteAparelhos {

    public static void main(String args[]) {

        Computador computador = new Computador("", "", 0);

        computador.setIp("05505");
        computador.setCor("Azul");
        computador.setAltura(15.0);

        Telefone telefone = new Telefone(0, "", 0);

        telefone.setNumero(8445500);
        telefone.setCor("rosa");
        telefone.setAltura(0.80);

        Tablet tablet = new Tablet("", "", 0);

        tablet.setTipoTela("Toucher");
        tablet.setCor("Branco");
        tablet.setAltura(0.90);

        System.out.println("Dados do Computador:\n"
                + "IP:" + computador.getIp()
                + "Cor:" + computador.getCor()
                + "Altura:" + computador.getAltura());

        System.out.println("Dados do Telefone\n"
                + "Número:" + telefone.getNumero()
                + "Cor:" + telefone.getCor()
                + "Altura:" + telefone.getAltura());

        System.out.println("Dados do Tablet\n"
                + "Tipo tela:" + tablet.getTipoTela()
                + "Cor:" + tablet.getCor()
                + "Altura:" + tablet.getAltura());

    }

}
