import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_secreto = 7;
        int palpite = 0;

        while (palpite != numero_secreto) {
            System.out.println("Adivinhe o número: ");
            palpite = sc.nextInt();

            if (palpite < numero_secreto) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numero_secreto) {
                System.out.println("Tente um número menor!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto!");
            }
        }
    }

}
