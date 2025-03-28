package Ativdade;

public abstract  class Construcao {
	  public int numeroComodos;
	  public float tamanhoCasa;
	  public String endereco;
	  protected double valor;
	  protected double aluguel;
	  
	  public Construcao(double valor){
	    this.valor = valor; 
	  }
	  public Construcao(String endereco){
	    this.endereco = endereco;
	  }

	  public abstract double aluguel();

	  public void descrever (){
	    System.out.println("Tamanho da casa :" + tamanhoCasa);
	    System.out.println("Numero de comodos :" + numeroComodos);
	    System.out.println("Endereço: "+ endereco);
	    System.out.println("Valor da casa:"+ valor);
	    System.out.println("Possivel Aluguel da casa: "+ aluguel);
	  }




	    
	}

