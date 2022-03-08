package oo.retangulo;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {


        Retangulo ret = new Retangulo();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a base do retângulo (em m): ");
        ret.setBase(entrada.nextFloat());

        System.out.print("Informe a largura do retângulo: ");
        ret.setAltura(entrada.nextFloat());

        System.out.printf("A area é: %.2f m2\n", ret.calcularArea());
        System.out.printf("O perimetro é: %.2f m\n", ret.calcularPerimetro());

    }
}
