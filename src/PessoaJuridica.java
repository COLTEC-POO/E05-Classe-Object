public class PessoaJuridica extends Cliente{
    private String cnpj;
    private int numFuncionarios;//Número de funcionários da PJ
    private String setor;//Setor de atuação da PJ (financeiro, educação, veículos, etc)

    public PessoaJuridica(){
        this.cnpj="XX.XXX.XXX/0001-XX";
        this.numFuncionarios=0;
        this.setor="INVALIDO";
    }

    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public void setNumFuncionarios(int numfuncionarios){
        this.numFuncionarios=numfuncionarios;
    }
    public int getNumFuncionarios(){
        return this.numFuncionarios;
    }
    public void setSetor(String setor){
        this.setor=setor;
    }
    public String getSetor(){
        return this.setor;
    }
    /*public void imprimirClientePJ(PessoaJuridica cliente){
        imprimirCliente(cliente);
        System.out.println("CNPJ:"+getCnpj());
        System.out.println("Número de funcionários:"+getNumFuncionarios());
        System.out.println("Setor"+getSetor());
    }*/
    public String toString(){
        String pessoajuridicaStr= "CNPJ:"+this.cnpj+"\n"+
                "Número de funcionários:"+this.numFuncionarios+"\n"+
                "Setor:"+this.setor;
        return pessoajuridicaStr;
    }
}
