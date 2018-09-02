package lista4;

/**
 *
 * @author Jesiel
 */
public class Natal extends CartaoWeb{

   
    
    @Override
     String retornarMensagem(String remetente){
        return remetente+" Feliz Natal!";
    }

    public Natal(String destinatario) {
        super(destinatario);
    }
     
     
}
