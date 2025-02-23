import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao2 {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in); // teste

        int altura;
        double peso, imc, alturaMetro;

        System.out.print("Digite a sua altura: ");
        altura = scanner.nextInt();

        System.out.print("Digite o seu peso: ");
        peso = scanner.nextDouble();

        alturaMetro = altura / 100.0;
        imc = peso / ( alturaMetro * alturaMetro );

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O seu IMC é: " + df.format(imc));

        scanner.close();
    }
}
