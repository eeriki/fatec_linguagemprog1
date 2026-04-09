import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] matriz_A = new int[15];
        int[] matriz_B = new int[15];

        System.out.println("Digite 15 números:");

        for (int i = 0; i < 15; i++) {
            matriz_A[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            matriz_B[i] = matriz_A[i] * matriz_A[i];
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < 15; i++) {
            System.out.print(matriz_A[i] + " ");
        }

        System.out.println("Matriz B (quadrados):");
        for (int i = 0; i < 15; i++) {
            System.out.print(matriz_B[i] + " ");
        }

        sc.close();
    }
}