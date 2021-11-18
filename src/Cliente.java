import java.util.Date;
public class Cliente {

    //Conteudo classe cliente

    String nome;
    String endereco;
    Date data;

    //-----------------------------------------------------------------------------------------------------//

    Cliente (){
        this.data =  new Date();
    }

    public String toString(){
        return "Cliente invalido.";
    }

    //-----------------------------------------------------------------------------------------------------//
}