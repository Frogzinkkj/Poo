public class Retangulo {

    float largura;
    float altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public boolean calcularArea() {
        if (largura > 0 && altura > 0) {
            float area = this.largura * this.altura;
            System.out.println("A area do Retangulo é " + area);
        } else {
            System.out.println("Valor invalido!");
        }
        return true;
    }

    public boolean calcularPerimetro() {
        if (largura > 0 && altura > 0) {
            float perimetro = 2 * (this.largura * this.altura);
            System.out.println("O perimetro do Retangulo é " + perimetro);
        } else {
            System.out.println("Valor invalido");
            return false;
        }
        return true;
    }
}
