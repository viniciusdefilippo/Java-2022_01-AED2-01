package aquecimento;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com primeiro número:");
        int x = entrada.nextInt();

        System.out.println("Entre com segundo número:");
        int y = entrada.nextInt();

        if (x > y) {
            int aux = y;
            y = x;
            x = aux;
        }

        System.out.println("Menor número: " + x);
        System.out.println("Maior número: " + y);

        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }

    }
}
