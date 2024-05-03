public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = false;
        boolean condicao2 = true;

        // Verifica se ambas as expressoes sao verdadeiras
        if (condicao1 && condicao2) {
            System.out.print("As duas condições são verdadeiras! ");
        }
        // Verifica se apenas uma das condições é verdadeira
        if (condicao1 || condicao2) {
            System.out.print("Uma das duas condições é verdadeira! ");
        }

    }
}
