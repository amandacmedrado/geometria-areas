import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gravar = new Scanner(System.in);

        triangulo triangulo1 = new triangulo();
        System.out.printf("Digite o valor da altura do triangulo: ");
        double alturaTriangulo1 = gravar.nextDouble();
        triangulo1.setAlturaTr(alturaTriangulo1);

        System.out.printf("Digite o valor da base do triangulo: ");
        double baseTriangulo1 = gravar.nextDouble();
        triangulo1.setBaseTr(baseTriangulo1);

        System.out.println("A área do triângulo é de: " + triangulo1.calcularArea());

        circulo circulo1 = new circulo();
        System.out.println("Digite o valor do raio do circulo: ");
        double raioCirculo1 = gravar.nextDouble();
        circulo1.setRaio(raioCirculo1);

        System.out.println("A área do circulo com raio " + circulo1.getRaio() + " é de " + circulo1.calcularArea());

        quadrado quadrado1 = new quadrado();
        System.out.printf("Digite o valor do lado do quadrado: ");
        double ladoQuadrado1 = gravar.nextDouble();
        quadrado1.setLadoQ(ladoQuadrado1);

        System.out.printf("Digite o valor do outro lado do quadrado: ");
        double ladoQuadrado2 = gravar.nextDouble();
        quadrado1.setLadoQ(ladoQuadrado2);

        System.out.println("A área do quadrado é de: " + quadrado1.calcularArea());

        



}
}
