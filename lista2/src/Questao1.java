import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, sucessor, possivelSucessor; // Teste

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        System.out.print("Digite o número que acha que é o sucessor dele: ");
        possivelSucessor = scanner.nextInt();

        sucessor = numero + 1;

        if ( possivelSucessor == sucessor ) {
            System.out.println("O número " + possivelSucessor + " é sucessor do " + numero);
        } else {
            System.out.println("O número " + possivelSucessor + " não é sucessor do " + numero);
        }

        scanner.close();

    }
}
