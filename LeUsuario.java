import java.util.Scanner;
public class LeUsuario {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner( System.in );
        System.out.println("O numero que você digitou foi: "+in.nextLine());
    }
}