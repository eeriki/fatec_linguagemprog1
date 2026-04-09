import java.util.Scanner;

public class Exercicio4_v2 {
    static String gerar_mensagem(String nome, int idade) {
        return "Bem-vindo " + nome + ", você tem " + idade + " anos!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println(gerar_mensagem(nome, idade));

        sc.close();
    }
}
