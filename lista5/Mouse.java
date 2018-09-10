package lista5;

/**
 *
 * @author Jesiel
 */
public class Mouse extends Produto {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String getDescricao(){
        return "Esse produto foi comprado na "+super.getNomeLoja()+" O tipo de mouse é:"+this.tipo+" mouse optico, Saída USB.  1.600 DPI, "
                + " custou:"+super.getPreco()+"R$";
    }

    public Mouse(String tipo, String nomeLoja, Double preco, String descricao) {
        super(nomeLoja, preco, "mouse optico, Saída USB.  1.600 DPI.");
        this.tipo = tipo;
    }
        
    
}
