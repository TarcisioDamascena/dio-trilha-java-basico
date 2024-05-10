public class ExemploForArray {

    public static void main(String[] args) {
        String alunos[] = { "Cisao", "Igao", "Savão", "Zézao" };

        //Estrutura For/Each em java representada pelo " : ";

        for(String aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
    }
}