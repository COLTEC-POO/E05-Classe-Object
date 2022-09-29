public class PessoaJuridica extends Cliente {

    private String cnpj;
    private int numFuncionarios;
    private String setor;

    PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String toString() {
        String pessoaJStr = "==== Dados da conta ====\nNome............: " + this.getNome() +
                "\nCNPJ............: " + this.cnpj + "\nSetor...........: " + this.setor +
                "\nEndereco........: " + this.getEndereco() + "\nNum Funcionarios: " + this.numFuncionarios + "\n";
        return pessoaJStr;
    }

}