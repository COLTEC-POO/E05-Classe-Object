public class PessoaFisica extends Cliente {

    String cpf;
    int idade;
    char sexo;

    // construtor

    public PessoaFisica() {
        this.cpf = "000.000.000-00";
        this.idade = 0;
        this.sexo = 'm';
    }

    // impressão dados pessoa física

    public String toString() {

        String pessoaFisicaStr = "Nome: " + this.nome + "\n" + "Endereco: " + this.endereco + "\n" +
                "CPF: " + this.cpf + "\n" + "Idade: " + this.idade + "\n" + "Sexo: " + this.sexo + "\n" +
                "Data criação do cliente: " + this.data;

        return pessoaFisicaStr;
    }


    public boolean equals(Object obj) {

        PessoaFisica contaPF = (PessoaFisica) obj;

        if (this.cpf.equals(contaPF.cpf)){
            return true;
        }
        else{
            return false;
        }
    }

}