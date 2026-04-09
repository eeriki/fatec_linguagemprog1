import java.util.Scanner;

public class Exercicio5_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + f);

        sc.close();
    }
}
