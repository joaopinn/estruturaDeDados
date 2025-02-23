import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        double preco, total;
        String produto;

        System.out.print("Digite o nome do produto: ");
        produto = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        (preco) = scanner.nextDouble();

        System.out.print("Digite a quantidade de itens comprados: ");
        quantidade = scanner.nextInt();

        total = preco * quantidade;

        // Formata o total para exibir exatamente duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O total deu: " + df.format(total) + " reais");

        scanner.close();
    } // teste 1
}