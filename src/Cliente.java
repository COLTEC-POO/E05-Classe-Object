import java.util.Date;

public class Cliente {

    String endereco;
    String nome;
    Date data;

    // construtor

    public Cliente() {
        this.endereco = "x";
        this.nome = "x";
        this.data = new Date();
    }

    public void imprimir(){
        System.out.println("Cliente inválido");
    }
}