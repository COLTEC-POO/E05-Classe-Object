import java.util.Date;
public class Cliente {
    private String endereco;
    private String nome;
    protected Date data;

    public Cliente(String nome, String endereco) {
            this.endereco = endereco;
            this.nome = nome;
        }
        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Date getData() {
            return data;
        }

        public void setData(Date data) {
            this.data = data;
        }

        void imprimir(){
            System.out.println("Cliente Invalido");
        }

    }
