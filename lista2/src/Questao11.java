import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;

        System.out.print("Digite um ano para verificar se é bissexto: ");
        ano = scanner.nextInt();

        // Verifica as condições para um ano ser bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close(); // Teste
    }
}
