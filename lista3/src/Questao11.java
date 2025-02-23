import java.util.Scanner;

public class Questao11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int dias;
        double temperatura,somaDasTemperaturas, media;
        String diaSemana;

        somaDasTemperaturas = 0;
        dias = 7;

        for( int i = 1; i <= dias; i++ ){

            System.out.print("Diga qual é o dia semana: ");
            diaSemana = scanner.nextLine();

            System.out.println("Diga qual é a temperatura desse dia: ");
            temperatura = scanner.nextDouble();
            scanner.nextLine();

            somaDasTemperaturas += temperatura;

        }

        media = somaDasTemperaturas / dias; // Teste

        System.out.printf("A temperatura média da semana foi: %.2f°C%n", media);

        scanner.close();
    }
}
