import java.util.Scanner;

public class Questao7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int pontos;
        String carta;

        pontos = 0;

        do {
            System.out.println("Você tem carta na mão?");
            carta = scanner.nextLine();

            if (carta.equals("sim")) { // Use .equals() para comparar strings
                System.out.println("Quantos pontos ela vale?");
                pontos += scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha pendente
            } else if (carta.equals("não")) {
                System.out.println("Você, no total, tem essa pontuação: " + pontos);
            }

        } while (!carta.equals("não"));
    } // Teste
}
