
//class Conta equals

public class Equals {

    public static void main(String[] equalsComparacao) {

        System.out.println(new Conta(00000000001)
                .equals(new Conta(00000000002));

    }

    static class Conta {

        public int CPF;


        public Conta(int CPF) {
            this.CPF=CPF;

        }

        
        public boolean equals(Object t) {
            if (this == t) {
                return true;
            }
            if (o == null || getClass() != t.getClass()) {
                return false;
            }
            Conta conta = (conta) t;
            return CPF == conta.CPF;
        }
    }
}


//class pessoa juridica equals


public class Equals {

    public static void main(String[] equalsComparacao) {

        System.out.println(new ClientePF(00000000001)
                .equals(new ClientePF(00000000002));

    }

    static class ClientePF {

        public int contaN;


        public ClientePF(int contaN) {
            this.contaN=contaN;

        }


        public boolean equals(Object t) {
            if (this == t) {
                return true;
            }
            if (o == null || getClass() != t.getClass()) {
                return false;
            }
            ClientePF cliente = (cliente) t;
            return contaN == cliente.contaN;
        }
    }
}

//class pessoa fisica equals

public class Equals {

    public static void main(String[] equalsComparacao) {

        System.out.println(new ContaJ(00000000001)
                .equals(new ContaJ(00000000002));

    }

    static class ContaJ {

        public int CNPJ;


        public ContaJ(int CNPJ) {
            this.CNPJ=CNPJ;

        }


        public boolean equals(Object v) {
            if (this == v) {
                return true;
            }
            if (o == null || getClass() != v.getClass()) {
                return false;
            }
            ContaJ conta = (conta) v;
            return CNPJ == conta.CNPJ;
        }
    }
}