package Ativdade;

public class Apartamento extends  Construcao{

    public Apartamento(double valor) {
        super(valor);
    }

    @Override
    public double aluguel() {
        return (valor*0.10);
    }
  
}
