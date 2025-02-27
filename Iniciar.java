public class Iniciar {
  public static void main(String[] args) {
    //Instanciando a classe pessoa(Chamando aquela classe para o MAIN)
      Pessoa pessoa = new Pessoa();


      
      pessoa.nome = "Sizenando Silva";
      pessoa.idade = 24; //Temos acesso ao Public
      pessoa.cpf = "123456789"; //Nao temos acesso ao private
      pessoa.end = "teste"; //Temos acesso ao protected



      pessoa.escreverIdade();


      pessoa.paiPessoa = new Pessoa();
      pessoa.paiPessoa.nome = "Manoel";


      int idade = pessoa.retornarIdade();
      System.out.println(idade);

      Pessoa pessoaNova = pessoa.paiPessoa;
      System.out.println(pessoaNova);


  }
}
