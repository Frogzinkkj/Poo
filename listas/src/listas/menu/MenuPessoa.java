package listas.menu;

import java.util.Scanner;

import java.util.List;

import listas.CadastroAbstract;
import listas.Pessoa;

public class MenuPessoa extends MenuAbstract {
  Pessoa pessoa = new Pessoa();
  Scanner sc = new Scanner(System.in);
  @Override
  public void cadastrar(CadastroAbstract cadastro) {
    System.out.println("Nome:");
    pessoa.setNome(sc.next());
    System.out.println("Sexo:");
    pessoa.setSexo(sc.next());
    System.out.println("Endereço:");
    pessoa.setEndereco(sc.next());
    System.out.println("Telefone:");
    pessoa.setTelefone(sc.next());

    if(cadastro.cadastrar(pessoa)){
      System.out.println("Pessoa cadastrada! \n");
    }else{
      System.out.println("Pessoa nao cadastrada disgraca \n");
    }
  }

  @Override
  public void excluir(CadastroAbstract cadastro) {
    System.out.println("-------------------------------------------------------------------*");
    System.out.println("Digite o nome da pessoa que deseja excluir: ");
    System.out.println("-------------------------------------------------------------------*");
    Scanner sc = new Scanner(System.in);
    String nome = sc.next();
    boolean p = cadastro.excluir(nome);
    if(p){
      System.out.println("Pessoa Excluida com Sucesso \n");
    }else{
      System.out.println("Pessoa nao encotrada\n");
    }
  }

  @Override
  public void localizar(CadastroAbstract cadastro) {

    System.out.println("-------------------------------------------------------------------*");
    System.out.println("Digite o nome da pessoa que deseja localizar: ");
    System.out.println("-------------------------------------------------------------------*");
    Scanner sc = new Scanner(System.in);
    String nome = sc.next();
    Pessoa p = cadastro.localizar(nome);
    if(p == null){
      System.out.println(" Pessoa nao encontrada\n");
    }else{
      System.out.println("Nome: " + p.getNome() + " Encontrado!\n");
    }
    
  }
  
}
