import java.util.Objects;
public class Conta {
    //atributos
    private  int totalContas=0;
    private int numConta;
    private Cliente Cliente;
    private double saldo;
    private double limite;
    private boolean tipo;
    private Operacao[] operações = new Operacao[1000];
    private int Numop=0;


    //Getters
    public int getnumConta(){
        return this.numConta;
    }
    public Cliente getCliente(){
        return this.Cliente;
    }
    public Double getsaldo(){
        return this.saldo;
    }
    public Double getlimite(){
        return this.limite;
    }
    public boolean gettipo(){
        return this.tipo;
    }
    public int getNumOp(){
        return this.Numop;
    }
    public int gettotalContas(){
        return this.totalContas;
    }
    
    

    //Setters
    public void setnumConta(int numConta){
         this.numConta = numConta;
    }
    public void setcCliente(Cliente Cliente){
         this.Cliente = Cliente;
    }
    public void setsaldo(Double saldo){
         this.saldo = saldo;
    }
    public void setlimite(double limite){
        this.limite = limite;
    }
    public void settotalContas(int totalContas){
        this.totalContas = totalContas;
    }

    //Ações

        public Conta(Cliente tipo){
            this.operações[0] = new Operacao();
            this.Cliente = tipo;
            this.numConta = totalContas;
            this.limite = 0;
            this.saldo = 0;
            this.Numop = 0;
            settotalContas(this.gettotalContas() + 1);
        }
        

    //Metodo para fazer depositos
    //Para criar um metodo basta colocar o public + retorno +nome + (tipo parametro)
    public boolean depositar(double valor){
        if (valor>=0) {
            this.saldo = this.saldo + valor;
            operações[Numop]=new OperacaoDeposito(valor);
            Numop++;
            return true;
        } else {
            return false;
        }
        
    }

    //Metodo para saque 

    public boolean sacar(double valor){ //Para ter retorno se funcionou

        if(valor<=this.saldo){
            this.saldo-= valor;
            operações[Numop]=new OperacaoDeposito(valor);
            Numop++;
            return true; 
        }
        else{
            return false;
        }
    }

    public String toString() {
		String dadosCliente ="Numero da Conta: " + this.numConta + "\n" +
						 	 "Limite: " + this.limite + "\n" +
						 	 "Saldo: " + this.saldo;
						 
		return dadosCliente;
	}

    public boolean equals(Object objeto) {

            Conta CompararConta = (Conta) objeto;
        
            if(this.numConta == CompararConta.numConta) {
                return true;
            }else {
                return false;
            }

    }
}