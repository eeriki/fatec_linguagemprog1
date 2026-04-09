import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Usamos 'String[]' para arrays de Strings de tamanho fixo
        String[] matriz_A = new String[10];
        
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "o nome: ");
            matriz_A[i] = scanner.nextLine();
        }

        //Apresentar os nomes
        System.out.println("\n--- Nomes Inseridos ---");
        for (String nome : matriz_A) {
            System.out.println(nome);
        }
    }
}
