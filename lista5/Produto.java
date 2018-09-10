package lista5;

/**
 *
 * @author Jesiel
 */
public class Produto {
    
    private String nomeLoja;
    private Double preco;
    private String descricao;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto(String nomeLoja, Double preco, String descricao) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }
    
    
    
    public String getDescricao(){
        return "Produtos de informática";
    }
    
    
}
