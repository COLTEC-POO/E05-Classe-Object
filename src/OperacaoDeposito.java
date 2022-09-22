public class OperacaoDeposito extends Operacao{
    
    public OperacaoDeposito(){

    }

    public OperacaoDeposito(Double valor){
        setTipo('d');
        setValor(valor);
        SalvaOperacao();
    }

    public String toString(){
        String product = "\nData: " + this.data + " Operação: Deposito Valor: R$ " + this.valor;
        return product;
    }

}
