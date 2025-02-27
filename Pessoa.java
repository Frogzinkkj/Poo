//Criando Uma classe 
public class Pessoa{

  //Criando Atributos para a classe(caracteristicas)
  public int idade;
  String telefone;
  Pessoa paiPessoa;
  Pessoa maePessoa;

  //Definindo Status Public, Protected e private do Atributo
  public String nome,email;
  private String cpf;
  protected String end;

//Criando metodos para a classe (Funcôes / Açôes)
  void escreverNome(){
    
    System.out.println(nome);

  }
  void escreverIdade(){

    System.out.println("Você tem "+idade+" anos");

  }
  int retornarIdade(){
    return idade;
  }

  Pessoa qumeEOPai(){
    return paiPessoa;
  }








  
}
