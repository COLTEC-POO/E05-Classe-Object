public class Main {
    public static void main(String[] args){

        // inicialização Cliente

        PessoaFisica jessica = new PessoaFisica();
        jessica.nome = "Jéssica Alves";
        jessica.cpf = "123.455.789-11";
        jessica.endereco = "Rua Laranjeiras";
        jessica.idade = 21;
        jessica.sexo = 'f';

        PessoaFisica mateus = new PessoaFisica();
        mateus.cpf = "121.555.999-10";

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.nome = "Banco X";
        empresa.cnpj = "10.510.789/0001-12";
        empresa.endereco = "Avenida Raja Gabaglia, 822";
        empresa.setor = "Financeiro";
        empresa.numFuncionarios = 52;

        PessoaJuridica empresa2 = new PessoaJuridica();
        empresa2.cnpj = "10.510.789/0001-12";

        // inicialização Conta

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();
        Conta suaEmpresa = new Conta();

        minhaConta.setDono(jessica);
        minhaConta.setNumConta(1013);
        minhaConta.setSaldo(1500);
        minhaConta.setLimite(10000);

        suaConta.setNumConta(1111);

        suaEmpresa.setDono(empresa);
        suaEmpresa.setNumConta(1212);
        suaEmpresa.setSaldo(7000);
        suaEmpresa.setLimite(90000);

        // inicialização Operações

        OperacaoDeposito deposito = new OperacaoDeposito(8000);
        OperacaoSaque saque = new OperacaoSaque(200);

        // impressão dados da conta

        System.out.println("--------------------- Dados Pessoa Física ----------------------");

        System.out.println(jessica.toString());

        System.out.println("--------------------- Dados Conta ----------------------");

        System.out.println(minhaConta.toString());

        System.out.println("--------------------- Dados Pessoa Jurídica ----------------------");

        System.out.println(empresa.toString());

        System.out.println("--------------------- Dados Conta ----------------------");

        System.out.println(suaEmpresa.toString());

        // operações

        System.out.println("--------------------- Operações ----------------------");

        System.out.println(deposito.toString());
        System.out.println(saque.toString());
        System.out.print("\n");

        // verifica se os CPF's são iguais

        System.out.println("--------------------- Comparações ----------------------");

        // compara número da conta

        if(minhaConta.equals(suaConta)){
            System.out.println("O número da conta é IGUAL");
        }
        else {
            System.out.println("O número da conta é DIFERENTE");
        }

        // compara cpf

        if(jessica.equals(mateus)){
            System.out.println("Os CPF's são IGUAIS");
        }
        else {
            System.out.println("Os CPF's são DIFERENTES");
        }

        // compara cnpj

        if(empresa.equals(empresa2)){
            System.out.println("Os CNPJ's são IGUAIS");
        }
        else {
            System.out.println("Os CNPJ's são DIFERENTES");
        }
    }
}