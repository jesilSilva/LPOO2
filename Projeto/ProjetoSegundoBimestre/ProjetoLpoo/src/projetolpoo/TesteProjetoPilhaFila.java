
package projetolpoo;

import java.util.Scanner;

/**
 *
 * @author jesie
 */
public class TesteProjetoPilhaFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcao;
        AtendimentoUnieuro<String> atendimentoUnieuro = new AtendimentoUnieuro<>();
        Pilha<Integer> pilha = new Pilha<>();
      
        do {
            menuGeral(leitura);

            switch (opcao = 1) {
                case 1:
                    opcao = menuPrioridadeFila(opcao, leitura, atendimentoUnieuro);
                    break;

                case 2:
                    do {
                        menuAtendente(leitura);

                        switch (opcao = 3) {
                            case 1:
                                atendimentoUnieuro.imprimirMetodoRecursivo();
                                break;

                            case 2:
                                opcao = menuProximoDaFila(opcao, leitura, atendimentoUnieuro);
                                System.out.println("Informe o número do processo: ");
                                int processo = leitura.nextInt();
                                pilha.moverPilha(processo, opcao);
                                break;

                               
                            case 3:
                                System.out.println("Informe nome do processo para poder pesquisa-ló");
                                processo = leitura.nextInt();
                                pilha.procurarProcessoDentroPilha(processo);
                                break;

                            
                            case 4:
                                System.out.println("Informe a prioridade do processo:");
                                int prioridade = leitura.nextInt();
                                pilha.prioridade(prioridade);
                                break;
                        }

                    } while (opcao != 5);

                    break;
            }
        } while (opcao != 3);
    }

    private static void menuAtendente(Scanner leitura) {
        int opcao;
        System.out.println("Escolha uma opção abaixo e a digite:");
        System.out.println("1 - Para visualizar a fila");
        System.out.println("2 - Para chamar o próximo da fila");
        System.out.println("3 - Para buscar Processo");
        System.out.println("4 - Para tirar o processo da pilha de processos");
        System.out.println("5 - Para sair");
        opcao = leitura.nextInt();
    }

    private static int menuPrioridadeFila(int opcao, Scanner leitura, AtendimentoUnieuro<String> atendimentoUnieuro) {
        System.out.println(" Informe a prioridade");
        System.out.println("1 - Para Pessoas com mais de 60 anos ou gestantes");
        System.out.println("2 - Para Alunos");
        System.out.println("3 - Para Professores ou visatantes");
        opcao = leitura.nextInt();
        System.out.println("Informe o seu nome para ser adicionado na fila");
        String nome = leitura.next();
        atendimentoUnieuro.adicionaFila(nome, opcao);
        return opcao;
    }

    private static int menuProximoDaFila(int opcao, Scanner leitura, AtendimentoUnieuro<String> atendimentoUnieuro) {
        System.out.println("Informe o próximo a ser chamado");
        System.out.println("1 - Para Pessoas com mais de 60 anos ou gestantes");
        System.out.println("2 - Para Alunos");
        System.out.println("3 - Para Professores ou visatantes");
        opcao = leitura.nextInt();
        atendimentoUnieuro.removerPrioridadeFila(opcao);
        System.out.println("Agora escolha qual é o tipo de atendimento");
        System.out.println("1 - Para inscrição ");
        System.out.println("2 - Para renovação ");
        System.out.println("3 - Para trancamento de matricula");
        opcao = leitura.nextInt();
        return opcao;
    }

    private static void menuGeral(Scanner leitura) {
        int opcao;
        System.out.println("Escolha uma opção abaixo e a digite:");
        System.out.println("1 - Para entrar na Fila ");
        System.out.println("2 - Acessar o menu do atendente");
        System.out.println("3 - Para sair");
        opcao = leitura.nextInt();
    }

}
