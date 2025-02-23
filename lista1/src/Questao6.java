import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao6 {
    public static void main ( String[] args ){
        Scanner scanner = new Scanner(System.in); // teste
        DecimalFormat df = new DecimalFormat("#.##");

        double total, conta, couvert, taxaGarcom;

        couvert = 10.00;

        System.out.print("Digite o valor da conta: ");
        conta = scanner.nextDouble();

        taxaGarcom = conta * 0.2;

        total = conta + taxaGarcom + couvert;

        System.out.println("A conta total, somando o valor mais as taxas, deu: " + df.format(total) + " reais");

        scanner.close();
    }
}
