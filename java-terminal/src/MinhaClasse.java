import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oi, fui executado pelo Terminal");
        System.out.println("Digite seu nome: ");

        String texto = scanner.nextLine();
        System.out.println("Seu nome é : " + texto + "?");
    }
}