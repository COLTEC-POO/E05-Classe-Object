public class Conta {

    //atributos da classe Conta
    private Cliente dono;
    private int numero;

    private double saldo;
    private double limite;
    public Operacao[ ]operacoes= new Operacao[1000];

    //variavel para controlar o indice do vetor de operações
    public int numeroOp=0;

    //numero de contas criadas durante a execução do sistema
    public static int totalContas=0;

    //metodos da classe conta:
    //construtor:

    public Conta(){

        this.dono=new Cliente();
        this.numero=(int) (Math.random()*1000);
        this.saldo=0;
        this.limite=0;
        this.operacoes= new Operacao[1000];
        numeroOp=0;
        Conta.totalContas++;
    }

    //metodo para criar
    public Conta(Cliente dono,int numConta){
        this.saldo=0;
        this.limite=0;
        this.numero=numConta;
        this.dono=dono;
        this.operacoes=new Operacao[1000];
        numeroOp=0;
        Conta.totalContas++;
    }

    //metodos getters e setters:
    public String getDono(){
        return dono.getNome();
    }

    public void setDono(String nome){
        dono.setNome(nome);
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite<0){
            this.limite = 0;
        } else{
            this.limite = limite;
            System.out.println("Limite alterado de "+this.limite+"para "+limite);
        }
    }



    //metodo - saque: possibilita a retirada de dinheiro da conta
    public boolean sacar(double valor){
        if(valor<=this.saldo){
            operacoes[numeroOp]=new OperacaoSaque(valor);
            this.saldo-=valor;
            numeroOp++;
            return true;
        } else{
            return false;
        }
    }

    //metodo - depositar: possibilita o deposito de dinheiro na conta
    public void depositar(double valor){
        operacoes[numeroOp]=new OperacaoDeposito(valor);
        this.saldo=this.saldo+valor;
        numeroOp++;
    }

    public String toString(){
        String contaStr= "Número:"+this.numero+"\n"+
                "Nome:"+this.dono.getNome()+"\n"+
                "Saldo:"+this.saldo+"\n"+
                "Limite:"+this.limite;
        return contaStr;
    }

    /*//metodo - imprimir: imprime dados da conta
    public void imprimir (Conta conta){
        System.out.println("-Detalhamento Conta-");
        System.out.println("Número:"+getNumero());
        System.out.println("Nome:"+getDono());
        System.out.println("Saldo:"+getSaldo());
        System.out.println("Limite:"+getLimite());
    }*/

    /*//metodo - transferir: possibilita a transferencia de dinheiro da conta
    boolean transferir(Conta destino, double valor){
        boolean saqueRealizado=this.sacar(valor);
        if (saqueRealizado){
            destino.depositar(valor);
            operacoes[numeroOp].setTipo('s');
            operacoes[numeroOp].setValor(valor);
            numeroOp++;
            return true;
        }
        else{
            return false;
        }

    }*/

}
