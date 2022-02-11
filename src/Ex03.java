import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quant = 5;
        int[] numeros = new int[quant];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Entre com %dº número: ", i + 1);
            numeros[i] = entrada.nextInt();
        }

        System.out.printf("Entre com o número a pesquisar:");
        int num = entrada.nextInt();

        int cont = 0;
        System.out.printf("Encontrado na(s) posição(ões):\n", num);
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == num){
                cont++;
                System.out.printf("%d, ", i);
            }
        }

        if(cont == 0){
            System.out.println("Número não encontrado");
        }
    }
}
