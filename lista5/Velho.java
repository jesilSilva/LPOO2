package lista5;

/**
 *
 * @author Jesiel
 */
public class Velho extends Imovel{
    
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public String precoComDesconto(){
        return "O valor do imovél com desconto é: R$"+(getPreco()-getDesconto()) ;
    }
    
}
