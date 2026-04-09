import java.util.Scanner;

public class Exemplo2 {
    public static void calcular_e_exibir_media(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calcular_e_exibir_media(7.5, 8.0);
        calcular_e_exibir_media(6.0, 9.0);
    }
}
