import java.util.Scanner;

public class Exemplo1 {
    public static void exibirMenu() {
        System.out.println("---------------------------------");
        System.out.println("     MENU DE ESTOQUE     ");
        System.out.println("---------------------------------");
        System.out.println("1. Adicionar novo produto");
        System.out.println("2. Listar produtos em estoque");
        System.out.println("3. Sair");
        System.out.println("---------------------------------");
    } //Bloco encolhido
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome_produto1 = "";
        int quant_produto1 = 0;
        double valor_produto1 = 0.0;
        boolean rodando = true;

        while (rodando){
            exibirMenu(); //Chamada da função
            //Continuação do código
        }
    }
}
