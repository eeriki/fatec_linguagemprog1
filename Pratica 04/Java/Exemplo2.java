import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        //Usamos 'int[]' para arrays de tamanho fixo
        Scanner scanner = new Scanner(System.in);
        int[] matriz_A = new int[15];
        int[] matriz_B = new int[15];

        System.out.println("--- Preenchendo a Matriz A ---");
        for (int i = 0; i < 15; i++) {
            while (true) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º elemento para a Matriz A: ");
                    matriz_A[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                }
            }
        }
        // Construir a Matriz B com os quadrados de A
        for (int i = 0; i < 15; i++) {
            matriz_B[i] = matriz_A[i] * matriz_A[i];
        }
        // Apresentar os resultados
        System.out.println("\nMatriz A:");
        for (int elemento : matriz_A) {
            System.out.print(elemento + " ");
        }
        System.out.println("\nMatriz B (Quadrados da Matriz A):");
        for (int elemento : matriz_B) {
            System.out.print(elemento + " ");
        }
    }
}
