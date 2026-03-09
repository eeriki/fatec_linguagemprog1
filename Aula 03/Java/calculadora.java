import java.util.Locale;
import java.util.Scanner; // Importa biblioteca para leitura de dados

public class calculadora {
    public static void main(String[] args) {
        // Configura o ponto como separador decimal (Padrão americano/programação)
        Locale.setDefault(Locale.US);

        // Passo 1: Instanciar o objeto Scanner para der a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Passo 2: Entrada de dados e declaração das variáveis

        System.out.println("--- Calculadora de Negócios (Java) ---");

        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        // Passo 3: Processamento (Cálculos)
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        // Passo 4: Saída de resultados formatados
        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Subtração: %.2f%n", subtracao);
        System.out.printf("Multiplicação: %.2f%n", multiplicacao);
        System.out.printf("Divisão: %.2f%n", divisao);
        
        // Passo 5: Fechar o Scanner (Boa prática de gerenciamento de memória)
        sc.close();
    }
}
