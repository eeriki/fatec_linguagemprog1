import java.util.Scanner;

public class Exercicio8_v2 {
    static String tipo(double a, double b, double c) {
        if (a == b && a == c && b == c) return "Equilátero";
        else if (a == b || a == c || b == c) return "Isósceles";
        else return "Escaleno";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado A:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor do lado B:");
        double b = sc.nextDouble();
        System.out.println("Digite o valor do lado C:");
        double c = sc.nextDouble();

        System.out.println(tipo(a, b, c));

        sc.close();
    }
}
