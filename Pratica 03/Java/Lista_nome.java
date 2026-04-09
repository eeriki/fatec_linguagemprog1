import java.util.ArrayList;

public class Lista_nome {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");

        System.out.println("Interando sobre uma lista em Java:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
