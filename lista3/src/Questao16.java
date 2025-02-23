import java.util.Scanner;

public class Questao16 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        // Teste
        double cotacao, maiorCotacao;

        System.out.print("Digite a primeira cotação do dia: ");
        maiorCotacao = scanner.nextDouble();

        // A cotação ocorre de 30 em 30 minutos, das 08h às 17h
        // Isso significa que teremos 20 leituras (pois são 9 horas * 2 medições por hora)
        for (int i = 2; i <= 18; i++) {
            System.out.print("Digite a próxima cotação: ");
            cotacao = scanner.nextDouble();

            if (cotacao > maiorCotacao) {
                maiorCotacao = cotacao;
            }
        }

        System.out.println("O maior valor da cotação do dia foi: " + maiorCotacao);

        scanner.close();

    }
}
