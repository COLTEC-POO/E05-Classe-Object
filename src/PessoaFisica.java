import java.util.Date;
public class PessoaFisica extends Cliente {
    protected String cpf;
    protected int idade;
    protected char sexo;
    protected Date data;

    PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
            super(nome,endereco);
            this.cpf = cpf;
            this.idade = idade;
            this.sexo = sexo;
    }
        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }
        public Date getData() {
            return data;
        }

        @Override
        public void setData(Date data) {
            this.data = data;
        }

    public String toString() {
        String imprimir =
                "\n================ Pessoa Física ==================\n" +
                "Nome: " + this.getNome() + "\n" +
                "Endereco: " + this.getEndereco() + "\n" +
                "CPF: " + this.getCpf() +"\n" +
                "Idade: " + this.getIdade() +"\n" +
                "Sexo: " + this.getSexo() ;
        return imprimir;
    }

    public boolean equals(Object outraPF) {
        if(outraPF instanceof PessoaFisica) {
            PessoaFisica outro = (PessoaFisica) outraPF;
            return this.getCpf().equals(((PessoaFisica) outraPF).getCpf());
        } else {
            return false;
        }
    }

}