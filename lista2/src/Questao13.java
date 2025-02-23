import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Teste
        int dia, mes;

        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();

        boolean primavera = (mes == 9 && dia >= 22) || (mes == 10) || (mes == 11) || (mes == 12 && dia <= 21);
        boolean outono = (mes == 3 && dia >= 20) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 21);

        if (primavera) {
            System.out.println("A data informada está na PRIMAVERA.");
        } else if (outono) {
            System.out.println("A data informada está no OUTONO.");
        } else {
            System.out.println("A data informada não pertence nem à primavera nem ao outono.");
        }

        scanner.close();
    }
}
