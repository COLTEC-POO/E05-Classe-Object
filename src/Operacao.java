import java.util.Date;
public abstract class Operacao {
    protected double valor;
    protected Date data;
    protected char tipo;
    private static int totalOperacoes = 0;
    public Operacao(char tipo, double valor) {
        this.valor = valor;
        data = new Date();
        this.tipo = tipo;
        totalOperacoes++;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static int getTotalOperacoes() {
        return totalOperacoes;
    }

    public static void setTotalOperacoes(int totalOperacoes) {
        Operacao.totalOperacoes = totalOperacoes;
    }

    public char getTipo(){
        return this.tipo;
    }

    public void setTipo(char tipo) {
        if (tipo == 'd' || tipo == 's') {
            this.tipo = tipo;
        }
        else{
            System.out.println("Erro!");
        }
    }

    public void exibirOperacao() {
        System.out.println(this.data + "  \t " + this.tipo + "  \t " + this.valor);
    }

    public String toString(){
        return this.data + "  \t " + this.tipo + "  \t " + this.valor;
    }

}
