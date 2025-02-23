import java.util.Scanner;

public class Questao9 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int totalAlunos = 25;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Aluno " + i + ":");

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();

            System.out.print("Nota 4: ");
            double nota4 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.printf("Média do aluno %d: %.2f%n", i, media);
            System.out.println("--------------------------");
        } // Teste

        scanner.close();
    }
}
