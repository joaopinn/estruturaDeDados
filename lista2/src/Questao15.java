import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nível de cinza (0 a 255): ");
        int nivelCinza = scanner.nextInt();

        if (nivelCinza < 0 || nivelCinza > 255) {
            System.out.println("Valor inválido! O nível de cinza deve estar entre 0 e 255.");
        } else if (nivelCinza < 128) {
            System.out.println("Tom ESCURO.");
        } else {
            System.out.println("Tom CLARO.");
        }

        scanner.close(); // Teste
    }
}
