import java.util.ArrayList;
import java.util.Scanner;

public class Desafio_MVP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> produtos = new ArrayList<>();

        while (true) {
            System.out.println("----MENU----");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {

                System.out.print("Nome do produto: ");
                String nome_prod = sc.nextLine();

                System.out.print("Quantidade em estoque: ");
                int quant_est = Integer.parseInt(sc.nextLine());

                System.out.print("Preço unitário: R$ ");
                double preco_unit = Double.parseDouble(sc.nextLine());

                if (quant_est < 0) {
                    System.out.println("ERRO: A quantidade não pode ser negativa.");
                } else {
                    // Simulando "dicionário" com array
                    String[] produto = {
                        nome_prod,
                        String.valueOf(quant_est),
                        String.valueOf(preco_unit)
                    };

                    produtos.add(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                }

            } else if (opcao.equals("2")) {

                System.out.println("----ESTOQUE----");

                for (String[] i : produtos) {
                    System.out.println(
                        "Produto: " + i[0] +
                        " | Qtd: " + i[1] +
                        " | R$ " + i[2]
                    );
                }

            } else if (opcao.equals("3")) {
                System.out.println("Saindo do sistema...");
                break;

            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}