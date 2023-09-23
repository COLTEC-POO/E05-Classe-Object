import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("======== Sistema Bancario ========");
        System.out.println("\n");


        // PESSOAS FISICAS
        PessoaFisica Pedro = new PessoaFisica(
                "Pedro",
                "Rua Joao e Maria 223, Belo Horizonte, MG",
                "43222-02",
                22,
                'M'
        );

        PessoaFisica Julia = new PessoaFisica(
                "Julia",
                "Rua Buraco 289,Sao Paulo, SP",
                "09266482-09",
                32,
                'F'
        );

        PessoaFisica Bruna = new PessoaFisica(
                "Bruna",
                "Rua UmDoisTres 289,Sao Paulo, SP",
                "09266482-09",
                33,
                'F'
        );

        // PESSOAS JURIDICAS
        PessoaJuridica Joao = new PessoaJuridica(
                "Joao",
                "Rua Santo Augustinho 312, Porto Alegre, RS",
                "428484-9",
                6,
                "Financeiro"
        );

        PessoaJuridica Luiz = new PessoaJuridica(
                "Luiz",
                "Rua Augustinho 541, Porto Alegre, RS",
                "428484-9",
                10,
                "Comercio"
        );

        PessoaJuridica Monica = new PessoaJuridica(
                "Monica",
                "Rua Sao Bernardo 395, Salvador, BA",
                "7652671-7",
                8,
                "Comercio"
        );


        // CONTAS
        Conta c2 = new Conta(
                7645,
                "ooup876",
                100,
                Julia,
                50000
        );

        Conta c1 = new Conta(
                29298,
                "8328aa",
                0,
                Pedro,
                40000
        );

        Conta c3 = new Conta(
                29298,
                "peosa135a",
                100,
                Joao,
                8000
        );

        System.out.println(Pedro.toString());
        System.out.println(Joao.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // Conta do Cliente Pedro e Julia exemplo

        System.out.println("===== Historico Conta Pedro =====");

        c1.depositar(2500);
        c1.sacar(200);
        c1.depositar(150);
        c1.sacar(50);

        c1.imprimirExtrato();

        // Comparando Contas

        System.out.println("Comparando as Contas C1 e C2.");
        if(c1.equals(c2)){

            System.out.println("As contas compartilham do mesmo numero! \n");
        } else{
            System.out.println("As contas nao compartilham do mesmo numero! \n");
        }

        System.out.println("Comparando as Contas C1 e C3.");
        if(c1.equals(c3)){

            System.out.println("As contas compartilham do mesmo numero! \n");
        } else{
            System.out.println("As contas nao compartilham do mesmo numero! \n");
        }

        // Comparando Pessoas Fisicas

        System.out.println("Comparando as Pessoas Fisicas Pedro e Julia.");
        if(Pedro.equals(Julia)){

            System.out.println("Compartilham do mesmo CPF! \n");
        } else{
            System.out.println("Nao compartilham do mesmo CPF! \n");
        }

        System.out.println("Comparando as Pessoas Fisicas Julia e Bruna.");
        if(Julia.equals(Bruna)){

            System.out.println("As contas compartilham do mesmo CPF! \n");
        } else{
            System.out.println("As contas nao compartilham do mesmo CPF! \n");
        }

        // Comparando Pessoas Juridicas

        System.out.println("Comparando as Pessoas Juridicas Joao e Luiz.");
        if(Joao.equals(Luiz)){

            System.out.println("As contas compartilham do mesmo CNPJ! \n");
        } else{
            System.out.println("As contas nao compartilham do mesmo CNPJ! \n");
        }

        System.out.println("Comparando as Pessoas Juridicas Joao e Monica.");
        if(Joao.equals(Monica)){

            System.out.println("As contas compartilham do mesmo CNPJ! \n");
        } else{
            System.out.println("As contas nao compartilham do mesmo CNPJ! \n");
        }

    }

}
