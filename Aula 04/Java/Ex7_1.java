import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de status (1=Disponível, 2=Reposição, 3=Descontinuado)");
        int codigo_status = scanner.nextInt();

        switch (codigo_status) {
            case 1:
                System.out.println("Status: Disponível.");
                break;
            case 2:
                System.out.println("Status: Em reposição.");
                break;
            case 3:
                System.out.println("Status: Descontinuado.");
            default:
                System.out.println("Código de status inválido.");
        }

        scanner.close();
    }
}
