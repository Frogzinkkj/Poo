import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        ContaBancaria contaBancaria = new ContaBancaria(1234, "Andre", 5000);
//
//        contaBancaria.deposito(300);
//        contaBancaria.sacar(1500);
//
//        System.out.println("-----------------------------------");
//
//        Retangulo retangulo = new Retangulo(0, 0);
//
//        retangulo.calcularArea();
//        retangulo.calcularPerimetro();
//
//        System.out.println("-----------------------------------");

        Scanner sc = new Scanner(System.in);
        Agenda pessoas = new Agenda();

        while(true) {
            System.out.println("Escolha uma Opção: \n");
            System.out.println("1- Cadastrar Pessoa\n");
            System.out.println("2- Excluir Pessoas\n");
            System.out.println("3- Localizar Pessoas\n");
            switch (sc.nextInt()) {
                case 1 -> pessoas.cadastrar();
            }

            sc.nextLine();
        }






    }
}