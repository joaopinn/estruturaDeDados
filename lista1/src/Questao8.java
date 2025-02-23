import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao8 {
    public static void main ( String [] args) {
        Scanner scanner = new Scanner(System.in); // teste
        DecimalFormat df = new DecimalFormat("#.##");

        double preco1, preco2, preco3, preco4, preco5, media;

        System.out.print("Digite o preço do produto: ");
        preco1 = scanner.nextDouble();

        System.out.print("Digite o preço do produto: ");
        preco2 = scanner.nextDouble();

        System.out.print("Digite o preço do produto: ");
        preco3 = scanner.nextDouble();

        System.out.print("Digite o preço do produto: ");
        preco4 = scanner.nextDouble();

        System.out.print("Digite o preço do produto: ");
        preco5 = scanner.nextDouble();

        media = ( preco1 + preco2 + preco3 + preco4 + preco5 ) / 5;

        System.out.println("A média do preço do produto é " + df.format(media));

        scanner.close();
    }
}
