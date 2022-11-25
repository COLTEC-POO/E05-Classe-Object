public class Main {
    public static void main(String[] args){

        Cliente clienteF = new PessoaFisica("Gabriella Aguiar", "Rua Alta, bairro Baixo", 19, "123.456.789-00", 'F');
        Cliente clienteJ = new PessoaJuridica("Empresa T.I", "Rua da Bahia, Centro", "12.345.678/0001-00", 50, "T.I");
        Conta contaA = new Conta(1234, 3500, 1, clienteF);
        Conta contaB = new Conta(9876, 1000000, 1, clienteJ);

        contaA.imprimir();
        System.out.println("");
        contaB.imprimir();
        System.out.println("");
        System.out.println("Número de contas criadas = " + Conta.iNumContas + "\n");


        contaA.depositar(2000);
        contaB.depositar(5000);
        contaA.sacar(500);
        contaB.sacar(1000);
        contaA.extrato();
        System.out.println("");
        contaB.extrato();
        System.out.println("");
        System.out.println("Número de operações = " + Operacao.totalOperacoes);
    }
}

