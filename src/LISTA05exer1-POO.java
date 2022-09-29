//class Pessoa Juridica
public class PessoaJ {
    public String nome;
        public int conta;
        public double saldo;

        public String toString() {
            String PessoaJStr = "Nome: " + this.nome + "\n" +
                    "Quantidade: " + this.conta + "\n" +
                    "Valor: " + this.saldo;

            return PessoaJStr;
        }
    }
}




//class man
public class Main {
    public static void main(String[] args) {
        PessoaJ pj = new PessoaJ();
        pj.nome = "Bruna";
        pj.conta = 00001-1;
        pj.saldo = 10.000;

       //impressões
        System.out.println(pj.toString());
    }
}

//class Pessoa Fisica

public class PessoaF {
    public String nome;
        public int conta;
        public double saldo;

        public String toString() {
            String PessoaFStr = "Nome: " + this.nome + "\n" +
                    "Quantidade: " + this.conta + "\n" +
                    "Valor: " + this.saldo;

            return PessoaFStr;
        }
    }
}




//class main
public class Main {
    public static void main(String[] args) {
        PessoaF pf = new PessoaF();
        pf.nome = "Bruna";
        pf.conta = 00001-1;
        pf.saldo = 10.000;

       //impressões
        System.out.println(pf.toString());
    }
}

//class Conta
public class Conta {
    public String nome;
        public int conta;
        public double saldo;

        public String toString() {
            String ContaStr = "Nome: " + this.nome + "\n" +
                    "Numero conta: " + this.conta + "\n" +
                    "Saldo: " + this.saldo;

            return ContaStr;
        }
    }
}




//class main
public class Main {
    public static void main(String[] args) {
        Conta contab = new Conta();
        contab.nome = "Bruna";
        contab.conta = 00001-1;
        contab.saldo = 10.000;

       //impressões
        System.out.println(contab.toString());
    }
}

// Class Operacao Deposito
public class OperacaoDeposito {
    public String nome;
        public int conta;
        public double valor;

        public String toString() {
            String OperacaoDepositoStrStr = "Nome: " + this.nome + "\n" +
                    "Numero conta: " + this.conta + "\n" +
                    "Valor: " + this.valor;

            return OperacaoDepositoStr;
        }
    }
}




//class main
public class Main {
    public static void main(String[] args) {
        OperacaoDeposito opd = new OperacaoDeposito();
        opd.nome = "Bruna";
        opd.conta = 00001-1;
        opd.valor = 10.000;

       //impressões
        System.out.println(opd.toString());
    }
}

// class Operacao Saque

public class OperacaoSaque {
    public String nome;
        public int conta;
        public double valor;

        public String toString() {
            String OperacaoSaqueStr = "Nome: " + this.nome + "\n" +
                    "Numero conta: " + this.conta + "\n" +
                    "Valor: " + this.valor;

            return OperacaoSaqueStr;
        }
    }
}

//class main

//class main
public class Main {
    public static void main(String[] args) {
        OperacaoSaque ops = new OperacaoDeposito();
        ops.nome = "Bruna";
        ops.conta = 00001-1;
        ops.valor = 12.000;

       //impressões
        System.out.println(ops.toString());
    }
}

