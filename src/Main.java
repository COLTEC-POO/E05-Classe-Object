public class Main {
    public static void main (String [] args){
        System.out.println("============== Sistema Bancário ================");
        Conta c1 = new Conta(
                "Marina LVM",
                "20423423",
                1000,
                5000
        );
        Conta c2 = new Conta (
                "Bruna FF",
                "20423429",
                200,
                1000
        );

        c1.depositar(1000);
        c1.sacar(300);
        c1.sacar(100);
        System.out.println(c1.toString());              // imprime dados do Cliente c1 por meio do toString()
        c1.imprimirExtrato();                           // imprime Operacoes realizadas Data - Hora - Tipo - Valor

        PessoaFisica pf1 = new PessoaFisica(
                "Filipe Ret",
                "Avenida Princesa Isabel 130, RJ, BRA",
                "123.123.123",
                28,
                'M'
        );
        PessoaFisica pf2 = new PessoaFisica(
                "Ariel BS",
                "Avenida Contorno 1700, Contagem, BRA",
                "123.123.123",
                23,
                'F'
        );
        PessoaJuridica pj1 = new PessoaJuridica(
                "Apple Inc",
                "Cupertino, California, EUA",
                "222.222.222",
                130579,
                "Tecnologia"
        );
        PessoaJuridica pj2 = new PessoaJuridica(
                "Microsoft Corporation",
                "Redmond, Washington, EUA",
                "444.783.241",
                221000,
                "Tecnologia"
        );
        System.out.println(pf1.toString());              // imprime dados de Pessoa Fisica pf1 por meio do toString()
        System.out.println(pj1.toString());             // imprime dados de Pessoa Juridica pj1 por meio do toString()

        System.out.println("\n========= Comparacao com metodo equals() =========");
        // Comparar Contas - NumConta
        if (c1.equals(c2)) {
            System.out.println("Contas iguais!");
        } else {
            System.out.println("Contas diferentes!");
        }

        // Comparar Pessoas Fisicas - CPF
        if (pf1.equals(pf2)) {
            System.out.println("PF iguais!");
        } else {
            System.out.println("PF diferentes!");
        }

        // Comparar Pessoas Juridicas - CNPJ
        if (pj1.equals(pj2)) {
            System.out.println("PJ iguais!");
        } else {
            System.out.println("PJ diferentes!");
        }
    }
}

