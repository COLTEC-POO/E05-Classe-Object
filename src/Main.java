public class Main {
    public static void main(String[] args) {


        /*Conta contaMaria = new Conta();
        contaMaria.depositar(500);
        contaMaria.depositar(300);
        contaMaria.depositar(400);
        contaMaria.sacar(300);
        System.out.println("Extrato Bancario");
        contaMaria.extrato();
        System.out.println("");*/


        Cliente clienteJose, clienteMaria, clienteMaria2;

        clienteJose = new PessoaFisica("Jose", "Rua das Gracas",
                "12345678912", 23, 'm' );
        clienteMaria = new PessoaJuridica("RR", "Rua dos Anjos",
                "555555555", 55, "educacao");

        clienteMaria2 = new PessoaJuridica("RR", "Rua dos Anjos",
                "555555555", 55, "educacao");

        System.out.println("Pessoa Fisica");
        System.out.println(clienteJose.toString());
        System.out.println("");
        System.out.println("Pessoa Juridica Maria");
        System.out.println(clienteMaria.toString());
        System.out.println("");
        System.out.println("Pessoa Juridica Maria 2");
        System.out.println(clienteMaria2.toString());;
        System.out.println("");
        //Verificando se o CNPJ da clienteMaria é igual ao da clienteMaria2
        System.out.println("Verificando se o CNPJ da Maria é igual ao da Maria2");
        if(clienteMaria.equals(clienteMaria2)) {
            System.out.println("Sao iguais");
        } else{
            System.out.println("Nao sao iguais");
        }

        System.out.println("");

        System.out.println("Verificando se o numero da conta C1 é igual a C2");
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.setNumeroConta(12);
        c2.setNumeroConta(12);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("");

        if(c1.equals(c2)){
            System.out.println("Sao iguais");
        } else{
            System.out.println("Nao sao iguais");
        }

    }
}