public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    @Override
    public String toString() {
        return "Data: " + this.data + "\tTipo: Saque\tValor: " + this.valor;
    }

}
