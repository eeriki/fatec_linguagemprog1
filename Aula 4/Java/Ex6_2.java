import java.util.Scanner;
public class Ex6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        if (quantidade < 1) {
            System.out.println("Status: Em falta.");
        } else if (quantidade < 5) {
            System.out.println("Status: Alerta de estoque baixo");
        } else {
            System.out.println("Status: Estoque OK.");
        }

        scanner.close();
    }
}
