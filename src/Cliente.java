import java.util.Date;

// Classe Cliente que representa um cliente genérico
public class Cliente {
    String endereco;
    String nome;
    Date data;

    // Construtor do Cliente
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = new Date();
    }

    // Sobrescreve a função toString()
    @Override
    public String toString() {
        return "Cliente Invalido";
    }

    // Classe interna PessoaFisica que representa um cliente pessoa física
    public static class PessoaFisica extends Cliente {
        public String cpf;
        public int idade;
        public char sexo;

        // Construtor de PessoaFisica
        public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
            // Chama o construtor da superClasse Cliente
            super(nome, endereco);

            this.cpf = cpf;
            this.idade = idade;
            this.sexo = sexo;
        }

        // Sobrescreve a função toString() para exibir informações de PessoaFisica
        @Override
        public String toString() {
            return "Pessoa Fisica: \n" +
                    "Nome: " + nome + " \n" +
                    "Endereço: " + endereco + " \n" +
                    "Data: " + data + " \n" +
                    "CPF: " + cpf + "\n" +
                    "Idade: " + idade + "\n" +
                    "Sexo: " + sexo;
        }

        // Sobrescreve a função equals para comparar objetos PessoaFisica com base no CPF
        @Override
        public boolean equals(Object outroCliente) {
            if (outroCliente instanceof Cliente.PessoaFisica) {
                Cliente.PessoaFisica pessoaFisica = (Cliente.PessoaFisica) outroCliente;

                if (this.cpf.equals(pessoaFisica.cpf)) {
                    System.out.println("CPFs sao iguais, logo, os clientes sao iguais");
                    return true;
                } else {
                    System.out.println("CPFs nao sao iguais, logo, os clientes nao sao iguais");
                }
            }
            return false;
        }
    }

    // Classe interna PessoaJuridica que representa um cliente pessoa jurídica
    public static class PessoaJuridica extends Cliente {
        public String cnpj;
        public String setor;
        public int numFunc;

        // Construtor de PessoaJuridica
        public PessoaJuridica(String nome, String endereco, String setor, String cnpj, int numFunc) {
            // Chama o construtor da superClasse Cliente
            super(nome, endereco);

            this.cnpj = cnpj;
            this.numFunc = numFunc;
            this.setor = setor;
        }

        // Sobrescreve a função toString() para exibir informações de PessoaJuridica
        @Override
        public String toString() {
            return "Pessoa Juridica: \n" +
                    "Nome: " + nome + " \n" +
                    "Endereço: " + endereco + " \n" +
                    "Data: " + data + " \n" +
                    "CNPJ: " + cnpj + "\n" +
                    "NumFuncionarios: " + numFunc + "\n" +
                    "Setor: " + setor;
        }

        // Sobrescreve a função equals para comparar objetos PessoaJuridica com base no CNPJ
        @Override
        public boolean equals(Object outroCliente) {
            if (outroCliente instanceof Cliente.PessoaJuridica) {
                Cliente.PessoaJuridica pessoaJuridica = (Cliente.PessoaJuridica) outroCliente;

                if (this.cnpj.equals(pessoaJuridica.cnpj)) {
                    System.out.println("CNPJs sao iguais, logo, os clientes sao iguais");
                    return true;
                } else {
                    System.out.println("CNPJs nao sao iguais, logo, os clientes nao sao iguais");
                }
            }
            return false;
        }
    }
}
