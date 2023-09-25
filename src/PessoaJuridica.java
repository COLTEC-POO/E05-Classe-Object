public class PessoaJuridica extends Cliente{
    String cnpj;
    int numFuncionarios;
    String setor;

    public String toString(){
        String pessoaJuridicaStr = "Nome: " + this.nome + "\n" +
                "Endereco: " + this.endereco + "\n" +
                "Data de criacao: " + this.dataCriacao + "\n" +
                "CNPJ: " + this.cnpj + "\n" +
                "Num. Funcionarios: " + this.numFuncionarios +
                "Setor: " + this.setor;
        return pessoaJuridicaStr;
    }

    public void equals(PessoaJuridica conta) {
        if (this.cnpj == conta.cnpj){
            System.out.println("iguais");
        }else {
            System.out.println("Diferentes");
        }
    }
}
