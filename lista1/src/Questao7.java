import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao7 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in); // teste
        DecimalFormat df = new DecimalFormat("#.##");

        int pessoas;
        double conta, contaPorPessoa;

        System.out.print("Digite o valor da conta: ");
        conta = scanner.nextDouble();

        System.out.print("Digite o número de pessoas sem contar com a aniversariante: ");
        pessoas = scanner.nextInt();

        contaPorPessoa = conta / pessoas;

        System.out.println("A conta no total deu " + df.format(conta) + " reais, por pessoa deu: " + df.format(contaPorPessoa) + " reais");

        scanner.close();
    }
}
