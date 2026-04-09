import java.util.Scanner;

public class Exercicio1_v2 {
    static void verificar_numero(int num) {
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        verificar_numero(num);
        sc.close();
    }
}