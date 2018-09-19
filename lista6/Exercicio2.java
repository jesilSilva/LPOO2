package lista6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesiel
 */
public class Exercicio2 {

    
    public static void main(String[] args) {
        
        Scanner guardar = new Scanner(System.in);
        int nNumeros = 0, contador = 0, soma = 0;

        do {

            try {
                System.out.println("Digite um numero:");
                nNumeros = guardar.nextInt();
                contador++;
            } catch (InputMismatchException e) {
                System.err.println(e);
                System.out.println("Informe um número do tipo inteiro, não use letras, caracteres especiais e nem números fracionados!");

                nNumeros = 0;

                //zerando o valor do scanner
                guardar.next();

            }

            try {
                conferirSoma(soma + nNumeros);
                
            } catch (ExcecaoAcimaDeCem e) {
                System.err.println(e);

                System.out.println("Soma:" + soma);
                if (contador > 0) {
                    System.out.println("Qtd de números somandos " + (contador - 1) );
                }
                System.out.println("Qtd de números somandos " + (contador));
                float media = soma / contador;
                System.out.println("A média dos números:" + (media));
            }

            soma = soma + nNumeros;
        } while (soma <= 100);

    }

    public static void conferirSoma(int soma) throws ExcecaoAcimaDeCem {

        if (soma > 100) {

            throw new ExcecaoAcimaDeCem("A soma não pode ultrapassar o valor 100.");
        }
    }
    
}
