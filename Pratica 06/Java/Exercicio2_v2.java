import java.util.Scanner;

public class Exercicio2_v2 {
    static double calcular_area(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do retângulo:");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = sc.nextDouble();

        double area = calcular_area(base, altura);
        System.out.println("A área do retângulo é: " + area);

        sc.close();
    }
}
