import java.util.Scanner;

public class Questao3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in); // teste

        double comprimento, largura, area;

        System.out.print("Digite o tamanho do comprimento: ");
        comprimento = scanner.nextDouble();

        System.out.print("Digite o tamanho da largura: ");
        largura = scanner.nextDouble();

        area = largura * comprimento;

        System.out.println("A área é " + area + " em metros");

        scanner.close();
    }
}
