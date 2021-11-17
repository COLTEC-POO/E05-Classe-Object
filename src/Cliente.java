import java.util.Date;
public class Cliente {
    String nome;
    Date data;
    String endereco;

    Cliente (){
        this.data =  new Date();
    }
    public String toString(){
        return "Cliente invalido.";
    }
}
