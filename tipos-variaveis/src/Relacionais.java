public class Relacionais {

    public static void main(String[] args) {
        String nome1 = "Tarcisio";
        String nome2 = new String("Tarcísio");

        System.out.println(nome1.equals(nome2));

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2; ");
        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2; ");
        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2; ");
        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2; ");
        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2; ");
    }
}
