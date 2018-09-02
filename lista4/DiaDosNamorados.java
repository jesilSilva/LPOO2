package lista4;

/**
 *
 * @author Jesiel
 */
public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    String retornarMensagem(String remetente) {
      return remetente+" Feliz dia dos namorados meu bem!";
    }

    
}
