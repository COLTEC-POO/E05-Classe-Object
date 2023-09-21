public class Main {
    public static void main(String[] args) {

        System.out.println("====Sistema Bancario====");

//         Inicializando sem chamar regContas
           Conta[] contas = new Conta[2];

//         Usando constructor sem regContas
        contas[0] = new Conta (1, "", 0, "", 0, new Cliente.PessoaJuridica("", "", "","1", 'F'));

        contas[1] = new Conta (1, "", 0, "", 0, new Cliente.PessoaJuridica("", "", "", "1", 'F'));

        // Comparando cliente, se for pessoa fisica Compara o CPF, se for juridica, compara CNPJ
        contas[0].getCliente().equals(contas[1].getCliente());

        // Comparando a conta, compara o numero dela
        contas[0].equals(contas[1]);

    }
    }