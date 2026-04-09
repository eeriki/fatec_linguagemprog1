import java.util.Scanner;

public class Desafio {
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
        System.out.println("---- RELATÓRIO DE ESTOQUE ----");
        for (int i = 0; i < 3; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + nomes_insumos[i] + " | Estoque: " + quantidades[i] + " unidades [REPOSIÇÃO NECESSÁRIA]");
            } else {
                System.out.println("Produto: " + nomes_insumos[i] + " | Estoque: " + quantidades[i] + " unidades");
            }
        }
        sc.close();
    }
}