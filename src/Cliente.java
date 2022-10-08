import java.util.Date;
import java.util.Scanner;
public class Cliente {
    private static int numClientes = 0;
    private String Endereco;
    private String Nome;
    private Date Data;

    public Cliente(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        this.setNome(entrada.nextLine());

        System.out.println("Endereço: ");
        this.setEndereco(entrada.nextLine());

        this.setData(new Date());

        entrada.close();

        numClientes++;

    }

    public String getEndereco() {  
        return this.Endereco;
    }
    public String getNome() { 
        return this.Nome;
    }
    public Date getData() {  
        return this.Data;
    }

    public void setEndereco(String Endereco){
        this.Endereco=Endereco;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setData(Date Data){
        this.Data = new Date();
    }

    public void imprimirDados(){

    }
    
  
    
}
