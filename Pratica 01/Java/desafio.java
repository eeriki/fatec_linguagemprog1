import java.util.Locale;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        // Define o ponto como separador decimal
        Locale.setDefault(Locale.US);

        //Abre o teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println(" --- Simulador Financeiro (Java) --- ");

        // Entradas
        System.out.println("Informe o Ganho: ");
        double ganho = scanner.nextDouble();

        System.out.println("Informe o Investimento: ");
        double investimento = scanner.nextDouble();

        if(investimento == 0) {
            System.out.println("Investimento não pode ser igual a zero");
            scanner.close();
            return;
        }
        // Processamento do cálculo e definição da variável de resultado
        double roi = ((ganho - investimento) / investimento) * 100;
        
        // Saída
        System.out.printf("Resultado: %.2f%n", roi);

        scanner.close();
    }
}
