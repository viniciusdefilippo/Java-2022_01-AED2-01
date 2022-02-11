import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] sorteados = new int[6];
        int[] apostados = new int[6];

        System.out.println("Números Sorteados:");
        System.out.println("==================");
        for (int i = 0; i < sorteados.length; i++) {
            System.out.printf("Entre com %dº número: ", i + 1);
            sorteados[i] = entrada.nextInt();
        }

        System.out.println("Números Apostados:");
        System.out.println("==================");
        for (int i = 0; i < apostados.length; i++) {
            System.out.printf("Entre com %dº número: ", i + 1);
            apostados[i] = entrada.nextInt();
        }

        int cont = 0;
        for (int i = 0; i < apostados.length; i++) {
            for (int j = 0; j < sorteados.length; j++) {
                if (apostados[i] == sorteados[j]) {
                    cont++;
                }
            }
        }
        System.out.printf("O apostador teve: %d acerto(s)", cont);
    }
}
