package aquecimento;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número:");
        int num = entrada.nextInt();

        for(int i=1; i <=10; i++){
            System.out.printf("%d X %d = %d\n", num, i, (num*i));
        }
    }
}
