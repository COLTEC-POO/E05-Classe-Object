public class PessoaFisica extends Cliente{
    String cpf;
    int idade;
    char sexo;
    public String toString(){
        String pessoaFisicaStr = "Nome: " + this.nome + "\n" +
                "Endereco: " + this.endereco + "\n" +
                "Data de criacao: " + this.dataCriacao + "\n" +
                "CPF: " + this.cpf + "\n" +
                "Idade: " + this.idade +
                "Sexo: " + this.sexo;
        return pessoaFisicaStr;
    }
    public void equals(PessoaFisica conta) {
        if (this.cpf == conta.cpf){
            System.out.println("iguais");
        }else {
            System.out.println("Diferentes");
        }
    }
}
