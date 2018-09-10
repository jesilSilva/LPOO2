package lista5;

/**
 *
 * @author Jesiel
 */
public class Livro extends Produto {

private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String autor, String nomeLoja, Double preco, String descricao) {
        super(nomeLoja, preco, descricao);
        this.autor = autor;
    }

@Override
    public String getDescricao(){
        return "Esse livro foi comprado na loja:"+super.getNomeLoja()+" ,este livro é sobre infraestrutura de TI, foi escrito pelo autor:"+this.autor+
                "e custou:"+super.getPreco();
    }


}
