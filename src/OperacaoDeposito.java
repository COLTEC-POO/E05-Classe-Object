public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    @Override
    public String toString() {
        return "Data: " + this.data + "\tTipo: Deposito\tValor: " + this.valor;
    }
}
