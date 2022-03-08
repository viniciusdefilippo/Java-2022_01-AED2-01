package oo.retangulo;

import java.util.Scanner;

public class RetanguloEstruturada {
    public static void main(String Args[]) {

        float base, altura, area, perimetro;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a base do retângulo (em m): ");
        base = input.nextFloat();

        System.out.print("Informe a altura do retângulo (em m): ");
        altura = input.nextFloat();

        area = altura * base;
        perimetro = 2 * (altura + base);

        System.out.printf("A area é: %.2f m2\n", area);
        System.out.printf("O perimetro é: %.2f m\n", perimetro);
    }
}
