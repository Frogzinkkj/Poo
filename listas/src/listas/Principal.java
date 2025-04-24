package listas;

import java.util.Scanner;

import listas.menu.MenuPessoa;

public class Principal {
  public static void main(String[] args) {
    CadastroAbstract pessoas = new PessoaCadastro();
    Scanner sc = new Scanner(System.in);
    MenuPessoa menu = new MenuPessoa();

    while(true){
      System.out.println("Escolha uma Opção: \n");
      System.out.println("1- Cadastrar Pessoa\n");
      System.out.println("2- Excluir Pessoas\n");
      System.out.println("3- Localizar Pessoas\n");
      switch (sc.nextInt()) {
        case 1:
            menu.cadastrar(pessoas);
          break;
        case 2:
            menu.excluir(pessoas);
          break;
          
        case 3:
            menu.localizar(pessoas);
          break;
        default:
          break;
      }
      sc.nextLine();
      
    }
  }
  
}
