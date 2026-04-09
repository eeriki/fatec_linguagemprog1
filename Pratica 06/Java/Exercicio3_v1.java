import java.util.Scanner;

public class Exercicio3_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "";

        while (senha.length() < 8) {
            System.out.println("Digite uma senha:");
            senha = sc.nextLine();
        }

        System.out.println("Senha válida!");
        sc.close();
    }
}
