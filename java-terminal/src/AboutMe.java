import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        // Criando o objeto Scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua Altura: ");
        double altura = scanner.nextDouble();

       System.out.println(" ");

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}