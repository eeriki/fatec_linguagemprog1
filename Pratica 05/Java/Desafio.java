import java.util.Scanner;

public class Desafio {
    public static void exibir_menu() {
        System.out.println("-------------------------------" );
        System.out.println("     SORVETERIA     ");
        System.out.println("-------------------------------");
    }

    public static String verificar_estoque(int quant) {
        if (quant < 5) {
            return "[REPOSIÇÃO NECESSÁRIA]";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes_insumos = new String[3];
        int[] quantidades = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomes_insumos[i] = sc.nextLine();

            System.out.print("Digite a quantidade de " + nomes_insumos[i] + ": ");
            quantidades[i] = sc.nextInt();
            sc.nextLine();
        }
        
        exibir_menu();

        for (int i = 0; i < 3; i++) {
            String aviso = verificar_estoque(quantidades[i]);
            System.out.println("Produto: " + nomes_insumos[i] + " | Estoque: " + quantidades[i] + " unidades " + aviso);
        }
    }
}