public class OperacaoSaque extends Operacao{
    /* Tipo da operação */
   /* private char tipo;

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo){
        this.tipo='s';
    }*/

    public OperacaoSaque(double valor){
        setTipo('s');
        setValor(valor);
    }


}
