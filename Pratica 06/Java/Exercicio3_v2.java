import java.util.Scanner;

public class Exercicio3_v2 {
    static boolean validar_senha(String senha) {
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "";

        while (!validar_senha(senha)) {
            System.out.println("Digite uma senha: ");
            senha = sc.nextLine();
        }

        System.out.println("Senha válida!");
        sc.close();
    }
}
