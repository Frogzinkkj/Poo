public class ContaBancaria {
    private int conta;
    private String nome;
    private double saldo;

    public ContaBancaria(int conta, String nome, double saldo) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public boolean deposito (double deposito) {
        if(deposito>0){
            saldo += deposito;
        }else{
            System.out.println("Valor invalido");
            return false;
        }
        return true;
    }


    public boolean sacar (double sacar) {
        if (sacar > 0) {
            if (sacar>saldo) {
                System.out.println("Não é possível sacar um valor maior ao seu saldo atual.");
                return false;
            }
        } else {
            this.saldo -= sacar;
            System.out.println("Seu saldo atual é " + saldo);
        }
        return true;
    }
}
