import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double [] matriz_A = new double[20];
        double [] matriz_B = new double[20];
        double [] matriz_C = new double[20];

        System.out.println("Digite os valores de A: ");
        for (int i = 0; i < 20; i++) {
            matriz_A[i] = sc.nextDouble();
        }

        System.out.println("Digite os valores de B: ");
        for (int i = 0; i < 20; i++) {
            matriz_B[i] = sc.nextDouble();
        }

        for (int i = 0; i < 20; i++) {
            matriz_C[i] = matriz_A[i] + matriz_B[i];
        }
        System.out.println("Matriz C (A + B): ");
        for (int i = 0; i < 20; i++) {
            System.out.print(matriz_C[i] + " ");
        }  
        sc.close();      
    }
}
