import java.util.Scanner;

public class Exercicio7_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if (nota >= 90 && nota <= 100) System.out.println("A");
        else if (nota >= 80 && nota < 90) System.out.println("B");
        else if (nota >= 70 && nota < 80) System.out.println("C");
        else if (nota >= 60 && nota < 70) System.out.println("D");
        else if (nota >= 0 && nota < 60) System.out.println("E");
        else System.out.println("Nota inválida!");

        sc.close();
    }
}
