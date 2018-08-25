package lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesiel
 */
public class TesteCoker {

   
    public static void main(String[] args) {
       
        Coker coker= new Coker(true, "", "", "", "");
        
        String tosa,  raca,  nome,  tipo,  cor;
                
             tosa=   JOptionPane.showInputDialog( "Precisa tosar:");
             coker.setTosa(Boolean.parseBoolean(tosa));
             raca=JOptionPane.showInputDialog("Informe a raça do cachorro:");
             coker.setRaca(raca);
             nome=JOptionPane.showInputDialog("Informe o nome do cachorro:");
             coker.setNome(nome);
             tipo=JOptionPane.showInputDialog("Informe o tipo do cachorro:");
             coker.setTipo(tipo);
             cor=JOptionPane.showInputDialog("Informe a cor do cachorro:");
             coker.setCor(cor);
             
             coker.precisaTosa();
             
             JOptionPane.showMessageDialog(null, "Dados do cachorro:\n Tosa:"+
                     coker.precisaTosa()+"\n Raça:"+coker.getRaca()+"\n Nome:"+coker.getNome()+
                     "\n Tipo:"+coker.getTipo()+"\n Cor:"+coker.getCor());
    }
    
}
