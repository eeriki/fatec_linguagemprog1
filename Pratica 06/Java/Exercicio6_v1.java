import java.util.Scanner;

public class Exercicio6_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println("Digite o valor do desconto(%): ");
        double desc = sc.nextDouble();

        double final_valor = valor - (valor * desc / 100);

        System.out.println("O valor final do produto é: " + final_valor);

        sc.close();
    }
}
