package lista6;

/**
 *
 * @author Jesiel
 */
public class Program {
    
   public static void main(String[] args) {

        int[] x = new int[10];
        try {
            for (int i = 0; i < x.length; i++) {
                x[i] = i;
            }
            for (int i = 0; i <= x.length; i++) {
                System.out.println(x[i]);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.err.println(e+" Erro na lógica que percorre o array");
        }

    }
}

