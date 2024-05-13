public class FormatadorCep {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("4508220");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
        throw new CepInvalidoException();
        
        return "45089-220";
    }
}