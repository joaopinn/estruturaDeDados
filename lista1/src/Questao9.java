import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // teste
        DecimalFormat df = new DecimalFormat("#.##");

        int distancia;
        double tempo, velocidade;

        System.out.print("Digite a distância ( em km ): ");
        distancia = scanner.nextInt();

        System.out.print("Digite o tempo ( em horas ): ");
        tempo = scanner.nextDouble();

        velocidade = distancia / tempo;

        System.out.println("A velocidade média é: " + df.format(velocidade) + " km/hr.");

        scanner.close();
    }
}
