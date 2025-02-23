import java.util.Scanner;

public class Questao4 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner (System.in);

        double nota1, nota2, nota3, resultado;

        System.out.println("Digite a nota da primeira avaliação: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da sua segunda avaliação: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da sua terceira avaliação: ");;
        nota3 = scanner.nextDouble();

        resultado = (nota1 + nota2 + nota3) / 3; // Teste

        if ( resultado > 7 ){
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }

        scanner.close();
    }
}
