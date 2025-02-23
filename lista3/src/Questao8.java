import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teste
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Me diga qual foi a nota da sua prova 1: ");
        nota1 = scanner.nextDouble();

        System.out.println("Me diga qual foi a nota da sua prova 2: ");
        nota2 = scanner.nextDouble();

        System.out.println("Me diga qual foi a nota da sua prova 3: ");
        nota3 = scanner.nextDouble();

        System.out.println("Me diga qual foi a nota da sua prova 4: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média foi de: %.2f%n", media);

        scanner.close(); // Boa prática fechar o Scanner após o uso
    }
}
