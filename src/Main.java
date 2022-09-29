public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema Bancário\n");

        Cliente cliente1 = new PessoaFisica("Eduardo", "Belo Horizonte",20, "12345679-01", 'M');
        Cliente cliente2 = new PessoaJuridica("Coltec", "Av Antônio Carlos", "123465789-00", 30, "Educação");
        Conta contaTeste = new Conta(1202, 10000, cliente1);
        Conta contaTeste2 = new Conta(1204, 10000, cliente2);

        contaTeste.imprimirSaldo();

        contaTeste.depositar(1200);
        contaTeste.depositar(1500.55);
        contaTeste.sacar(757);

        contaTeste.extrato();

        contaTeste.mediaOperacoes();

        System.out.println (contaTeste.getTitular().toString());

        contaTeste2.imprimirSaldo();

        contaTeste2.depositar(1200);
        contaTeste2.depositar(1500.55);
        contaTeste2.sacar(757);

        contaTeste2.extrato();

        contaTeste2.mediaOperacoes();

        System.out.println (contaTeste2.getTitular().toString());
    }
}