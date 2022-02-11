import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] sorteados = new int[6];
        int[] apostados = new int[6];

        preencheVetor(sorteados, "\nNúmeros Sorteados:");
        preencheVetor(apostados, "\nNúmeros Apostados:");

        ordena(sorteados);
        ordena(apostados);

        int cont = apuraResultados(apostados, sorteados);
        apresentaResultados(cont, apostados, sorteados);

    }


    public static void apresentaResultados(int cont, int[] apostados, int[] sorteados) {
        System.out.println("\nDezenas Sorteadas: ");
        System.out.println("====================");
        printVetor(sorteados);
        System.out.println("\nDezenas Apostadas: ");
        System.out.println("====================");
        printVetor(apostados);

        if (cont == 0) {
            System.out.printf("\nO apostador não teve acertos");
        } else if (cont == 1) {
            System.out.printf("\nO apostador teve apenas %d acerto", cont);
        } else {
            System.out.printf("\nO apostador teve %d acertos", cont);
        }
    }

    public static void ordena(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void printVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d, ", v[i]);
        }
        System.out.println();
    }

    public static int apuraResultados(int[] apostados, int[] sorteados) {

        int cont = 0;
        for (int i = 0; i < apostados.length; i++) {
            for (int j = 0; j < sorteados.length; j++) {
                if (apostados[i] == sorteados[j]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void preencheVetor(int[] v, String msg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(msg);
        System.out.println("==================");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Entre com %dº número: ", i + 1);
            v[i] = entrada.nextInt();
        }
    }

}
