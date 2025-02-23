import java.util.Scanner;

public class Questao8 {
    public static void main ( String[] args ){

        Scanner scanner = new Scanner(System.in); // Teste

        int jogador1, jogador2;

        System.out.println("Joagador 1, jogue o dado e diga qual número caiu: ");
        jogador1 = scanner.nextInt();

        System.out.println("Joagador 2, jogue o dado e diga qual número caiu: ");
        jogador2 = scanner.nextInt();

        if ( jogador1 > jogador2 ) {
            System.out.println("A vez será do jogador 1!");
        } else if ( jogador1 == jogador2 ) {
            System.out.println("Os dois jogadores ficarão uma rodada sem jogar!");
        } else {
            System.out.println("Será a vez do jogador 2!");
        }

    }
}
