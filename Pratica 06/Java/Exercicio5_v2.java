import java.util.Scanner;

public class Exercicio5_v2 {
    static double converter(double c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();
        System.out.println("A temperatura em Fahrenheit é: " + converter(c));

        sc.close();
    }
}
