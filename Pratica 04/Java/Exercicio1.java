public class Exercicio1 {
    public static void main(String[] args) {
        int [] matriz_A = {2, 4, 6, 8, 10, 12, 14, 16};
        int [] matriz_B = new int[8];
        
        for (int i = 0; i < matriz_A.length; i++) {
            matriz_B[i] = matriz_A[i] * 3;
        }
        System.out.println("Matriz B: ");
        for (int i = 0; i < matriz_B.length; i++) {
            System.out.print(matriz_B[i] + " ");
        }
    }
}
