import java.util.Scanner;

public class Questao6 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        // Teste
        double preco;
        int opcao;

        preco = 0;

        do {
            System.out.println("O que você deseja? \n1. Adicionar produto\n2. Encerrar");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O preço desse produto é: ");
                    preco += scanner.nextDouble();
                    break;
                case 2:
                    System.out.printf("O total da compra deu: %.2f%n", preco + " reais");
                    System.out.println("Encerrando...");
                    break;
                default:
                    break;
            }
        } while ( opcao != 2);
    }
}
