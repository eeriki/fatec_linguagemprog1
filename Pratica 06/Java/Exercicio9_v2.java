import java.util.Scanner;

public class Exercicio9_v2 {
    static int contar(String texto) {
        int cont = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase ou uma palavra: ");
        String texto = sc.nextLine();
        System.out.println("Vogais: " + contar(texto));

        sc.close();
    }
}
