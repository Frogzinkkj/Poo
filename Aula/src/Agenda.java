import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    Scanner sc;

    private List<Pessoas> pessoas;



    public Agenda(){
        pessoas = new ArrayList<>();
    }


    public void cadastrar(Pessoas pessoa){
        pessoas.add(pessoa);

    }
    public void remover(String nome){
        for(Pessoas p : pessoas){
            if(p.getNome().equalsIgnoreCase(nome)){
                pessoas.remover(p);
                break;
            }
        }
    }
    public void editar(Pessoas pessoa){
        for (Pessoas p: pessoas){
            if(p.getNome().equalsIgnoreCase(pessoa.getNome())){
                p=pessoa;
                break;
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
