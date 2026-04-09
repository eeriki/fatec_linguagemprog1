import java.util.Scanner;

public class Exercicio7_v2 {
    static String classificar(int nota) {
        if (nota >= 90 && nota <= 100) return "A";
        else if (nota >= 80 && nota < 90) return "B";
        else if (nota >= 70 && nota < 80) return "C";
        else if (nota >= 60 && nota < 70) return "D";
        else if (nota >= 0 && nota < 60) return "E";
        else return "Nota inválida!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();
        System.out.println(classificar(nota));

        sc.close();
    }
}
