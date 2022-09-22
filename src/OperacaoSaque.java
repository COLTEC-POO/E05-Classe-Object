public class OperacaoSaque extends Operacao{

    public OperacaoSaque(){

    }

    public OperacaoSaque(Double valor){
        setTipo('s');
        setValor(valor);
        SalvaOperacao();
    }

    public String toString(){
        String product = "\nData: " + this.data + " Operação: Saque Valor: R$ " + this.valor;
        return product;
    }


}