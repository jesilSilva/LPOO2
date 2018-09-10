package lista5;

import java.util.ArrayList;

/**
 *
 * @author Jesiel
 */
public class TesteProdutos {

    public static void main(String[] args) {

        ArrayList< Produto> carrinho = new ArrayList();

        Mouse mouse1 = new Mouse("Óptico", "PrimeTech", 25.0, "Um excelente mouse");

        Mouse mouse2 = new Mouse("Simples", "Fujioka", 30.0, "Mouse para uso do dia a dia.");

        Livro livro1 = new Livro("Machado de Assis", "Fenac", 30.0, "Este livro relata a história da literatura brasileira");

        carrinho.add(mouse1);
        carrinho.add(mouse2);
        carrinho.add(livro1);

        for (int i = 0; i < carrinho.size(); i++) {

            System.out.println(carrinho.get(i).getDescricao());

        }

    }

}
