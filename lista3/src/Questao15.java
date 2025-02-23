import java.util.Scanner;

public class Questao15 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        double temperaturaMinima, temperaturaMaxima, menorTemperatura, maiorTemperatura;

        System.out.println("Diga qual é a menor temperatura do dia 1: ");
        menorTemperatura = scanner.nextDouble();

        System.out.println("Diga qual é a maior temperatura do dia 1: ");
        maiorTemperatura = scanner.nextDouble();

        for (int i = 2; i <= 7; i ++ ){

            System.out.print("Digite a temperatura mínima do dia " + i + ": ");
            temperaturaMinima = scanner.nextDouble();

            System.out.print("Digite a temperatura máxima do dia " + i + ": ");
            temperaturaMaxima = scanner.nextDouble();

            if (temperaturaMinima < menorTemperatura) {
                menorTemperatura = temperaturaMinima;
            }

            if (temperaturaMaxima > maiorTemperatura) {
                maiorTemperatura = temperaturaMaxima;
            }
        }

        System.out.println("A menor temperatura da semana foi: " + menorTemperatura);
        System.out.println("A maior temperatura da semana foi: " + maiorTemperatura);

        scanner.close(); // Teste
    }
}
