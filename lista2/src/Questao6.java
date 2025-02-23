import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Teste

        double totalPreco, desconto, valorDesconto, valorTotal;

        System.out.print("Digite o total da compra: ");
        totalPreco = scanner.nextDouble();

        if (totalPreco < 50.00) {
            desconto = 0.05;
        } else if (totalPreco < 100.00) {
            desconto = 0.10;
        } else if (totalPreco < 200.00) {
            desconto = 0.20;
        } else if (totalPreco < 500.00) {
            desconto = 0.25;
        } else {
            desconto = 0.30;
        } // <-- Removido o ponto e vírgula desnecessário aqui

        valorDesconto = totalPreco * desconto;
        valorTotal = totalPreco - valorDesconto;

        System.out.printf("O desconto será de: R$ %.2f%n", valorDesconto);
        System.out.printf("O valor total será de: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
