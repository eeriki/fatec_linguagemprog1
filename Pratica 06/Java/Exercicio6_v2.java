import java.util.Scanner;

public class Exercicio6_v2 {
    static double aplicar_desc(double valor, double desc) {
        return valor - (valor * desc / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double v = sc.nextDouble();
        System.out.println("Digite o valor do desconto(%): ");
        double d = sc.nextDouble();

        System.out.println("O valor final do produto é: " + aplicar_desc(v, d));

        sc.close();
    }
}
