import java.util.Scanner;

public class Exercicio10_v2 {
    static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        tabuada(numero);

        sc.close();
    }
}
