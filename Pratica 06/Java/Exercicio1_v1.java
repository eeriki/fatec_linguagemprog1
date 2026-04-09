import java.util.Scanner;

public class Exercicio1_v1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        scanner .close();
    }
}
