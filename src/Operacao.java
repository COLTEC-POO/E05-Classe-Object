import java.util.Date;

// Classe principal de Operacao
public class Operacao {
    double valor;

    Date data;

    char tipo;

    static int qtdOperacao = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;

        data = new Date();
    }

    public void imprimirExtrato() {
        System.out.println(" " + data + "  " + tipo + "  " + valor);
    }

    public static class OperacaoSaque extends Operacao {
        public OperacaoSaque(double valor) {
            super('s', valor);
            qtdOperacao++;
        }

        @Override
        public void imprimirExtrato() {
            System.out.println(" " + data + " s" + " " + valor);
        }
    }

    public static class OperacaoDeposito extends Operacao {
        public OperacaoDeposito(double valor) {
            super('d', valor);
            qtdOperacao++;
        }

        @Override
        public void imprimirExtrato() {
            System.out.println(" " + data + " d" + " " + valor);
        }
    }
}


