package lista6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesiel
 */
public class Exercicio3 {

   
    
   public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int[] vetor = new int[10];
        int posicao = 0, valor = 0;

        System.out.println("Preencha as 10 posições:");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Digite a posição do array:");
                posicao = leitura.nextInt();
                System.out.println("Digite o valor para o array:");
                valor = leitura.nextInt();
                System.out.println("----------------------------");
                vetor[posicao] = valor;
            } catch (ArrayIndexOutOfBoundsException e) {

                System.err.println(e);
                System.out.println(" O Array com 10 posições, favor informe um indice que esteja dentro desse intervalo, lembrando que o indice começa no valor 0.");
            } catch (InputMismatchException e) {
                leitura.next();
                System.err.println(e);
                System.out.println("O Array é do tipo inteiro, digite um número inteiro.");
            }

        }

        System.out.println("Valores guardado com sucesso!!!");

       
    }
}
