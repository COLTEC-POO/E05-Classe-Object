import java.util.Date;

public class Cliente {
    String endereco;
    String nome;
    Date data;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = new Date();
    }

    public String toString() {
        return "Cliente Invalido";
    }

    public static class PessoaFisica extends Cliente {

        public String cpf;
        public int idade;
        public char sexo;

        public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
            // Pegando nome e endereco da SuperClasse, sendo Cliente
            super(nome, endereco);

            this.cpf = cpf;
            this.idade = idade;
            this.sexo = sexo;
        }

        @Override
        public String toString() {
            return "Pessoa Fisica: \n" + "Nome: " + nome + " \n" + "Endereco: " + endereco + " \n" + "Data: " + data + " \n" + "CPF: " + cpf + "\n" + "Idade: " + idade + "\n" + "Sexo: " + sexo;
        }
    }

    public static class PessoaJuridica extends Cliente {
        public  String cnpj;
        public String setor;

        public int numFunc;

        // Constructor de pessoa Juridica
        public PessoaJuridica(String nome, String endereco, String setor,String cnpj, int numFunc) {
            // Pegando dados da superClasse
            super(nome, endereco);

            // Constructor normalmente do restante dos dados
            this.cnpj = cnpj;
            this.numFunc = numFunc;
            this.setor = setor;
        }

        @Override
        public String toString() {
            return "Pessoa Juridica: \n" + "Nome: " + nome + " \n" + " Endereco: " + endereco + " \n" + " Data: " + data + " \n" + "CNPJ: " + cnpj + " NumFuncionario: " + numFunc + " Setor: " + setor;
        }
    }
}