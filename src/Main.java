
public class Main {
    public static void main(String[] args) {
        boolean saoIguais;

        Conta contaEmp = new Conta(new PessoaJuridica());
        System.out.println(contaEmp.toString());
        contaEmp.depositar(100_000);

        Conta contaUm = new Conta(new PessoaFisica());
        System.out.println(contaUm.toString());
        Conta contaDois = new Conta(new PessoaFisica());
        System.out.println(contaDois.toString());

        System.out.println("\nCOMPARANDO CONTAS DE PESSOAS FISICAS:");
        saoIguais = contaDois.equals(contaUm);
        if(saoIguais){
            System.out.println("Sao Iguais");
        }else{
            System.out.println("Sao Diferentes");
        }

        contaEmp.tranferencia(contaUm, 12000);
        contaEmp.tranferencia(contaDois, 20000);

        contaUm.sacar(5000);
        contaDois.sacar(10000);

        contaUm.imprimirExtratoDetalhado();
        contaDois.imprimirExtratoDetalhado();

        System.out.println("\nA media de operações por conta criada é: " + (contaUm.nOperacoesRealizadas()/contaUm.getNumContasCriadas()));
    }
}
