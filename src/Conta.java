import java.util.Date;
public class Conta {
    protected Cliente cliente;
    public String Dono;
    protected String numeroConta;
    protected double saldoConta;
    protected double limiteConta;
    Operacao[] operacoes = new Operacao[1000];
    public static int totalContas = 0;
    protected Date date;


    public Conta(String dono, String numeroConta, double saldoConta, double limiteConta) {
        Dono = dono;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.limiteConta = limiteConta;
        totalContas++;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public Operacao[] getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(Operacao[] operacoes) {
        this.operacoes = operacoes;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTotalContas(int totalContas) {
        Conta.totalContas = totalContas;
    }

    // Método para Depositar
    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldoConta += valor;
            operacoes[Operacao.getTotalOperacoes()] = new Operacao('d', valor) {
                public String toString(){
                    return this.data + "  \t " + this.tipo + "  \t " + this.valor;
                }
            };
            return true;
        } else {
            return false;
        }
    }

    // Método para Sacar
    public boolean sacar(double valor) {
        if (valor <= this.saldoConta) {
            this.saldoConta -= valor;
            operacoes[Operacao.getTotalOperacoes()] = new Operacao('s', valor) {
                public String toString(){
                    return this.data + "  \t " + this.tipo + "  \t " + this.valor;
                }
            };
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String imprimir =
                "Dono da conta: " + this.getDono() +
                "\nNumero da Conta: " + this.getNumeroConta() +
                        "\nSaldo atual: " + this.getSaldoConta() +
                        "\nLimite: " + this.getLimiteConta() ;

        return imprimir;
    }
    public void imprimirExtrato(){
        if (Operacao.getTotalOperacoes() > 0) {
            for (int i=0; i< Operacao.getTotalOperacoes(); i++) {
                operacoes[i].exibirOperacao();
            }
        } else {
            System.out.println("Sem registro de operações na conta atual");
        }
    }

    public boolean equals(Object outroNumConta) {
        if(outroNumConta instanceof Conta) {
            Conta outraConta = (Conta) outroNumConta;
            return this.getNumeroConta().equals(outraConta.getNumeroConta());
        } else {
            return false;
        }
    }

}