public class Pessoa{

  String nome, cpf ,end,email;
  int idade;
  String telefone;
  Pessoa paiPessoa;
  Pessoa maePessoa;


  void escreverNome(){
    
    System.out.println(nome);

  }
  void escreverIdade(){

    System.out.println(idade);

  }
  int retornarIdade(){
    return idade;
  }

  Pessoa qumeEOPai(){
    return paiPessoa;
  }








  
}
