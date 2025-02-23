import java.util.Scanner;

public class Questao10 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double preco1, preco2, preco3, preco4, preco5, preco6, media;

        System.out.println("Digite o preco do mercado 1: ");
        preco1 = scanner.nextDouble();

        System.out.println("Digite o preco do mercado 2: ");
        preco2 = scanner.nextDouble();

        System.out.println("Digite o preco do mercado 3: ");
        preco3 = scanner.nextDouble();

        System.out.println("Digite o preco do mercado 4: ");
        preco4 = scanner.nextDouble();

        System.out.println("Digite o preco do mercado 5: ");
        preco5 = scanner.nextDouble();

        System.out.println("Digite o preco do mercado 6: ");
        preco6 = scanner.nextDouble();

        media = (preco1 + preco2 + preco3 + preco4 + preco5 + preco6) / 6; // Teste

        System.out.printf("A média do preco do produto é: %.2f%n", media);

        scanner.close();
    }
}
