import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args) {
        //Em Java, usamos a 'ArrayList' para criar uma lista dinâmica
        ArrayList<Integer> quadrados = new ArrayList<>();

        //Laço 'for' para percorrer os números de 15 a 200
        for (int i = 15; i <= 200; i++) {
            int quadrado = i * i;
            quadrados.add(i * i);
        }

        //Apresentar os resultados usando outro laço 'for'
        System.out.println("Quadrados dos números de 15 a 200:");
        for (int i = 0; i < quadrados.size(); i++) {
            System.out.println("O quadrado do número " + (i + 15) + " é " + quadrados.get(i));
        }
    }
}