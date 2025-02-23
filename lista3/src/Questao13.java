import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int jogadores, carta, maiorCarta, vencedor;
        maiorCarta = 0;
        vencedor = 0;

        System.out.print("Quantos jogadores tem na mesa? ");
        jogadores = scanner.nextInt(); // Teste

        for ( int i = 1; i <= jogadores; i++){

            System.out.print("Jogador " + i + ", diga qual o número da sua carta: ");
            carta = scanner.nextInt();

            if ( carta > maiorCarta) {  // Se a carta atual for maior que a maiorCarta registrada
                maiorCarta = carta;
                vencedor = i;  // Armazena o número do jogador que tem a maior carta
            }

        }

        System.out.println("O jogador " + vencedor + " venceu com a carta de valor " + maiorCarta);
        scanner.close();

    }
}
