import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema bancário");

        Cliente cliente1 = new PessoaFisica("Gabriel", "Bairro Liberdade", 21, "1111111111", 'M');
        Cliente cliente2 = new PessoaJuridica("Empresa Qualquer", "Bairro Liberdade", "22222222", 20, "Industria");
        Conta conta1 = new Conta(100, 5000, 1, cliente1);
        Conta conta2 = new Conta(200, 100000, 1, cliente2);

        conta1.imprimir();
        conta2.imprimir();
        System.out.println("Número de contas criadas = " + Conta.contadorNumContas);


        conta1.depositar(2000);
        conta2.depositar(5000);
        conta1.sacar(500);
        conta2.sacar(1000);
        conta1.extrato();
        conta2.extrato();
        System.out.println("Número de operações = " + Operacao.totalOperacoes);
    }
}