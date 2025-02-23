import java.util.Scanner;

public class Questao3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int jogador1, jogador2, soma;

        System.out.print("Jogador 1, digite o número de dedos: ");
        jogador1 = scanner.nextInt();

        System.out.print("Jogador 2, digite o número de dedos: ");
        jogador2 = scanner.nextInt();

        soma = jogador1 + jogador2;

        if (soma % 2 == 0) {
            System.out.println("O resultado foi " + soma + " (PAR)!");
        } else {
            System.out.println("O resultado foi " + soma + " (ÍMPAR)!");
        }

        scanner.close(); // Teste

    }
}
