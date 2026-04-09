import java.util.Scanner;

public class Exercicio9_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase ou uma palavra: ");
        String texto = sc.nextLine().toLowerCase();
        int cont = 0;

        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) cont++;
        }

        System.out.println("Vogais: "+ cont);

        sc.close();
    }
}
