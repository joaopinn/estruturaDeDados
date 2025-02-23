public class Questao4 {
    public static void main (String[]args){
        int linhas = 10; // Número de linhas da árvore

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } // Teste
    }
}
