import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Teste

        double preco1, preco2, preco3, preco4, preco5, media;

        System.out.println("Digite o preço do produto 1: ");
        preco1 = scanner.nextDouble();

        System.out.println("Digite o preço do produto 2: ");
        preco2 = scanner.nextDouble();

        System.out.println("Digite o preço do produto 3: ");
        preco3 = scanner.nextDouble();

        System.out.println("Digite o preço do produto 4: ");
        preco4 = scanner.nextDouble();

        System.out.println("Digite o preço do produto 5: ");
        preco5 = scanner.nextDouble();

        media = (preco1 + preco2 + preco3 + preco4 + preco5 ) / 5;

        System.out.printf("A média dos preços dos 5 produtos é: %.2f reais", media);
    }
}
