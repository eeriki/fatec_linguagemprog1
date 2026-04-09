import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String usuario = sc.nextLine();
        String senha_correta = "senha123";
        String senha = "";

        while (!senha.equals(senha_correta)) {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        }

        System.out.println("Bem-vindo, " + usuario + "!");
        sc.close();
    }
}
