import java.util.Scanner;
public class Ex5_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        if (quantidade < 5) {
            System.out.println("AVISO: O estoque deste produto está baixo!");
        } else {
            System.out.println("Estoque OK.");
        }

        scanner.close();
    }   
}
