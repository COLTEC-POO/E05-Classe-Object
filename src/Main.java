public class Main {
    public static void main(String[] args) {

        System.out.println("====Sistema Bancário====");

        // Chama a função regContas
//        Conta[] contas = Conta.regContas();

        // Inicializando sem chamar regContas
        Conta[] contas = new Conta[1];

        // Usando constructor sem regContas
        contas[0] = new Conta(2, "senha2", 1500.0, "Dono2", 2000, new Cliente.PessoaFisica("Cliente2", "Endereco2", "CPF2", 25, 'F'));

        // Fazendo saques com cliente cadastrado no index 0
        contas[0].depositar(2000.0);
        contas[0].sacar(550.0);



        // Imprime dados dos clientes cadastrados
        for (Conta conta : contas) {
//            Cliente cliente = conta.getCliente();
            System.out.println(contas[0]);

//            System.out.println(cliente.toString());

            System.out.println("=== Extrato da Conta ===");
            conta.imprimirExtrato();

            // Espaco entre as contas
            System.out.println();
        }
    }
}