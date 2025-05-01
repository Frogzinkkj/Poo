public class Pessoas {

    private String nome;
    private String Telefone;

    public Pessoas(){

    }

    public Pessoas(String nome, String telefone) {
        this.nome = nome;
        Telefone = telefone;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


