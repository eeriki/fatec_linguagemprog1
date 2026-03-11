// Importa os módulos Locale e Scanner
import java.util.Locale;
import java.util.Scanner;

class sorveteria {
    // Função principal
    public static void main(String[] args) {
        // Configura o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);

        // cria instÂncia da biblioteca scanner
        Scanner scanner = new Scanner(System.in);

        // entradas
        System.out.print("Digite o nome do produto: ");
        String nome_produto = scanner.nextLine();
        int quantidade_produto = perguntaQuantidade(scanner);
        System.out.print("Digite o preço unitário: R$");
        double preco_unitario = scanner.nextDouble();

        //Saídas
        System.out.println(" ----- Informações do produto -----");
        System.out.println("Nome: " + nome_produto);
        System.out.printf("Quantidade em estoque: " + quantidade_produto);
        System.out.printf("\nPreço unitário: R$%.2f%n", preco_unitario);
        scanner.close();
    }

    public static int perguntaQuantidade(Scanner sc){
        // Entrada
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = sc.nextInt();
        
        // Processamento
        if(quantidade < 0){
            System.out.println("Erro. A quantidade não pode ser um valor negativo. Por favor, tente novamente.");
            // repete a pergunta - scanner é o mesmo importado da classe main
            return perguntaQuantidade(sc);
        }

        return quantidade;
    }
}