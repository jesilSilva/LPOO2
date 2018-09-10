package lista5;

import java.util.Scanner;

/**
 *
 * @author Jesiel
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tecnico tecnico = new Tecnico(0, "");

        tecnico.setMatricula(556);
        tecnico.setNome("Joao");

        System.out.println("Dados do técnico:");
        System.out.println("Matricula:" + tecnico.getMatricula());
        System.out.println("Nome:" + tecnico.getNome());
        System.out.println("Bônus salárial:" + tecnico.bonusSalarial(1000.00));

        Administrativo administrativo = new Administrativo(0, "");

        administrativo.setMatricula(5545);
        administrativo.setNome("Joana");

        System.out.println("Dados do administrativo:");
        System.out.println("Matricula:" + administrativo.getMatricula());
        System.out.println("Nome:" + administrativo.getNome());
        System.out.println("Adicional Salárial:" + administrativo.adicional(2000.0));

        // Testando a herança e poliformismo de animal
        Animal animal;
        animal = new Cachorro();
        Cachorro cachorro = (Cachorro) animal;

        Gato gato = new Gato("", "");

        System.out.println("Informações sobre os animais:");
        System.out.println("O cachorro vai latir:" + cachorro.late());
        System.out.println("O gato vai miar:" + gato.Mia());
        System.out.println("O Cachorro vai caminhar:" + cachorro.caminhar());
        System.out.println("O gato vai caminhar:" + gato.caminhar());

        // Testando a herança de pessoa
        Rica rica = new Rica();

        rica.setNome("João");
        rica.setIdade(30);
        rica.setDinheiro(30000.00);
        System.out.println("Dados da pessoa rica:");
        System.out.println("Nome:" + rica.getNome());
        System.out.println("Idade:" + rica.getIdade());
        System.out.println("Valor em dinheiro:" + rica.getDinheiro());
        System.out.println("Valor em compras:" + rica.fazCompras(1000.00));

        Pobre pobre = new Pobre();

        pobre.setNome("Miguel");
        pobre.setIdade(35);
        System.out.println("Dados da pessoa pobre:");
        System.out.println("Nome:" + pobre.getNome());
        System.out.println("Idade:" + pobre.getIdade());
        System.out.println("Trabalha:" + pobre.trabalha());

        Miseravel miseravel = new Miseravel();

        miseravel.setNome("Ricardo");
        miseravel.setIdade(30);
        System.out.println("Dados da pessoa miserável:");
        System.out.println("Nome:" + miseravel.getNome());
        System.out.println("Idade:" + miseravel.getIdade());
        System.out.println("Mendigar:" + miseravel.mendiga());

        Ingresso ingresso = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tipo do ingresso, Digite 1 para normal e 2 para vip:");
        int opcao = scanner.nextInt();
        if (opcao == 1) {

            Normal normal = new Normal();
            normal.setValorIngresso(2000);
            System.out.println("O ingresso é normal.");

            System.out.println(normal.ingressoNormal());
        }else if(opcao==2){
             System.out.println("O ingresso é do tipo vip");
            System.out.println("Informe 1 para camarote superior e 2 para camarote inferior");
            opcao=scanner.nextInt();
            if(opcao==1){
                CamaroteSuperior camaroteSuperior= new CamaroteSuperior();
                camaroteSuperior.setValorIngresso(200);
                camaroteSuperior.setAdicional(10);
                System.out.println("No camarote superior");
                System.out.println("O valor do ingresso é:"+camaroteSuperior.imprimeValor());
            }else if(opcao==2){
                CamaroteInferior camaroteInferior= new CamaroteInferior();
                camaroteInferior.setLocalizacao("Setor leste");
                camaroteInferior.setValorIngresso(200);
                System.out.println("Está localizado no "+camaroteInferior.getLocalizacao());
                System.out.println("O valor do ingresso é:"+camaroteInferior.getValorIngresso());
            }
        }
        
        
//        Imovel imovel=null;
        System.out.println("Informe 1 para um novo imóvel ou 2 para um velho imóvel.");
        opcao=scanner.nextInt();
        if(opcao==1){
//            Novo novo= (Novo)imovel;
            Novo novo = new Novo();
            novo.setAdicional(200);
            novo.setEndereco("Rua sem nome prédio sem andar");
            novo.setPreco(20000);
            System.out.println("Dados do imóvel novo:");
            System.out.println("Endereço:"+novo.getEndereco());
            System.out.println("Preço:"+novo.getPreco());
            System.out.println("Valor com o adicional:"+novo.valorComAdicional());            
        }else if(opcao==2){
            Velho velho= new Velho();
            
            velho.setEndereco("Valparaíso");
            velho.setDesconto(300);
            velho.setPreco(20000);
            System.out.println("Dados do imóvel velho:");
            System.out.println("Endereço:"+velho.getEndereco());
            System.out.println("Preço:"+velho.getPreco());
            System.out.println("Valor do desconto:"+velho.getDesconto());
        }
        

    }

}
