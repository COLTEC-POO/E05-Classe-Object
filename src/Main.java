public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Sistema Bancario.");

        PessoaJuridica erick = new PessoaJuridica();
        erick.setCnpj("14479890661");

        PessoaJuridica clone = new PessoaJuridica();
        clone.setCnpj("14479870661");

        Conta contaErick = new Conta(erick);
        Conta contaClone = new Conta(clone);

        contaErick.setNumConta(333);
        contaClone.setNumConta(333);

        if(erick.equals(clone)){
            System.out.println("CLONE!!!");
        }else{
            System.out.println("Tudo certo.");
        }








//        PessoaJuridica jCliente = new PessoaJuridica();
//        Conta jConta = new Conta(jCliente);



    }
}