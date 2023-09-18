import java.util.Scanner;

public class Conta {

    // Variaveis privadas basicas da conta
    final int numero;
    final String senha;
    private double saldo;
    final String dono;
    private double limite;

    // inicializando cliente;
    final Cliente cliente;

    // Inicializando o array de operacoes
    final Operacao[] operacoes;

    // Numeros de Operacoes;
    private int numOp;

    // Comparando Contas
    public boolean equals(Object outro) {
        if(outro instanceof Conta) {
            Conta outraConta = (Conta) outro;
            return this.numero.equals(outraConta.numero);
        } else {
            return false;
        }
    };

    // Construtor da Conta
    public Conta(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;

        this.cliente = cliente;

        setLimite(limite);

        this.operacoes = new Operacao[1000];

        this.numOp = 0;
    }

    // Metodo para verificar o valor depositado e salvar a operacao
    public void depositar(double valor) {

        if (valor >= 0) {
            this.saldo += valor;

            this.operacoes[numOp] = new Operacao.OperacaoDeposito(valor);
            numOp++;
        } else {
            System.out.println("Depositado R$: " + valor);
        }
    }

    // Metodo para verificar o valor a ser sacado e salvar a operacao
    public void sacar(double valor) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
            numOp++;
        } else {
            System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + valor);
        }
    }

    // Metodo para registrar contas no array
    public static Conta[] regContas() {
        Scanner linhaDeComando = new Scanner(System.in);

        // TIPO[] nomeArray = new TIPO[TAMANHO];
        int tamanho = 2;

        Conta[] contas = new Conta[tamanho];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Digite o nome do dono:");
            String dono = linhaDeComando.nextLine();

            System.out.println("Digite o endereco do dono:");
            String endereco = linhaDeComando.nextLine();

            System.out.println("Digite o numero da conta:");
            int numero = linhaDeComando.nextInt();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite a senha da conta:");
            String senha = linhaDeComando.nextLine();

            System.out.println("Digite o saldo da conta:");
            double saldo = linhaDeComando.nextDouble();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite o limite da conta:");
            double limite = linhaDeComando.nextDouble();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite 'P' para Pessoa Fisica ou 'J' para Pessoa Juridica:");
            char tipoCliente = linhaDeComando.nextLine().charAt(0);

            Cliente cliente;

            if(tipoCliente == 'P' || tipoCliente == 'p') {
                System.out.println("Digite o CPF:");
                String cpf = linhaDeComando.nextLine();

                System.out.println("Digite a idade:");
                int idade = linhaDeComando.nextInt();
                linhaDeComando.nextLine();

                System.out.println("Digite o Sexo: ");
                char sexo = linhaDeComando.nextLine().charAt(0);

                cliente = new Cliente.PessoaFisica(dono, endereco, cpf, idade, sexo);
            } else if (tipoCliente == 'J' || tipoCliente == 'j') {
                // Salvando os Dados como Pessoa Juridica
                System.out.println("Digite o CNPJ:");
                String cnpj = linhaDeComando.nextLine();

                System.out.println("Digite a idade:");
                int numFunc = linhaDeComando.nextInt();
                linhaDeComando.nextLine();

                System.out.println("Digite o setor:");
                String setor = linhaDeComando.nextLine();

                cliente = new Cliente.PessoaJuridica(dono, endereco, setor, cnpj, numFunc);
            } else {
                System.out.println("Tipo de cliente inválido. A conta não será criada.");
                continue;
            }

            contas[i] = new Conta(numero, senha, saldo, dono, limite, cliente);
        }

        for (Conta contaAtual : contas) { System.out.println("Contas Cadastradas: " + contaAtual.getDono());
            System.out.println();}
        return contas;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta de " + this.getDono());
        for (int i = 0; i < numOp; i++) {
            System.out.println(operacoes[i].toString());
        }
    }

    // Imprimir dados de conta
    public String toString() {
        return "Número da Conta: " + this.numero + "\nSenha: " + this.senha + "\nSaldo: R$" + this.saldo + "\nDono: " + getDono() + "\nLimite: R$" + this.limite + "\n \n=== Dados como cliente === \n" + getCliente().toString();
    }

    public String getDono() { return dono; }

    public Cliente getCliente() {
        return cliente;
    }

    public void setLimite(double limite) {
        if(limite >= 0) {
            this.limite = limite;
        } else {
            this.limite = 0;
        }
    }
}