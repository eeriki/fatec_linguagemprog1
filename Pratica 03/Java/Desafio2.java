import java.util.Scanner;

public class Desafio2 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (numero <= 10); {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
        }
        System.out.println("Obrigado! Você digitou um número maior que 10.");
        sc.close();
    }
}
