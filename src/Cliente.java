import java.util.Date;

public class Cliente {
    private String nome;
    private String end;

    private Date data;

    public Cliente() {
        this.nome = "";
        this.end = "";
        this.data = new Date();
    }

    //Get
    public Date getDate() {
        return data;
    }
    public String getNome() {
        return nome;
    }

    public String getEnd() {
        return end;
    }

    //Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnd(String end) {
        this.end = end;
    }





    //IMPRIMIR
    public String toString(){
        return "Cliente Inválido.";
    }


}