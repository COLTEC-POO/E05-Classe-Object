public class Main {
    public static void main(String[] args) {

        System.out.println("====Sistema Bancário====");

        // Chama a função regContas
        Conta[] contas = Conta.regContas();

//         Inicializando sem chamar regContas
//        Conta[] contas = new Conta[2];

        // Usando constructor sem regContas
//        contas[0] = new Conta (1, "senha1", 1500.0, "Dono1", 2000, new Cliente.PessoaFisica("Cliente1", "Endereco1", "CPF1", 25, 'F'));
//
//        contas[1] = new Conta (1, "senha1", 1500.0, "Dono2", 2000, new Cliente.PessoaFisica("Cliente2", "Endereco2", "CPF1", 25, 'F'));

        // Imprime dados dos clientes cadastrados
        for (Conta conta : contas) {
            System.out.println("=== Dados bancarios ===");
            System.out.println(conta.toString());
            System.out.println();

//          Cliente cliente = conta.getCliente();
//          System.out.println(cliente.toString());
//            System.out.println();
        }

        contas[0].getCliente().equals(contas[1].getCliente());

        }
    }