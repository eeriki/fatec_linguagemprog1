import java.util.Scanner;

public class Exercicio8_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado A:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor do lado B:");
        double b = sc.nextDouble();
        System.out.println("Digite o valor do lado C:");
        double c = sc.nextDouble();

        if (a == b && a==c && b == c) System.out.println("Equilátero");
        else if (a == b || a == c || b == c) System.out.println("Isósceles");
        else System.out.println("Escaleno");

        sc.close();
    }
}
