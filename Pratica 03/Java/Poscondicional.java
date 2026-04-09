import java.util.Scanner;

public class Poscondicional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int estoque;

        do{
            System.out.print("Digite a quantidade (não pode ser negativa: ");
            estoque = sc.nextInt();
    
        } while (estoque < 0);
        System.out.println("Parabéns, você digitou o número errado.");
        sc.close();
    }
}
