package Ativdade;

public class Casa extends Construcao {

    public Casa(double valor) {
        super(valor);
    }
  
    @Override
    public double aluguel() {
        return (valor*0.10);
    }
  
}
