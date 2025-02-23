import java.util.Scanner;
import java.util.Random;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Teste
        Random random = new Random();

        System.out.print("Digite o número máximo da rifa: ");
        int maxRifa = scanner.nextInt();

        System.out.print("Digite o número que você quer apostar: ");
        int aposta = scanner.nextInt();

        int sorteado = random.nextInt(maxRifa) + 1; // Gera um número entre 1 e maxRifa

        System.out.println("O número sorteado foi: " + sorteado);

        if (aposta == sorteado) {
            System.out.println("Parabéns! Você ganhou a rifa!");
        } else {
            System.out.println("Que pena! Tente novamente da próxima vez.");
        }

        scanner.close();
    }
}
