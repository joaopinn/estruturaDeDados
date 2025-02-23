import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Teste
        int dia, mes, ano;

        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();

        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        boolean dataValida = false;

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) {
            dataValida = true;
        }else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
            dataValida = true;
        } else if (mes == 2) {
            if (anoBissexto && dia >= 1 && dia <= 29) {
                dataValida = true;
            } else if (!anoBissexto && dia >= 1 && dia <= 28) {
                dataValida = true;
            }
        }

        if (dataValida) {
            System.out.println("A data informada é válida!");
        } else {
            System.out.println("A data informada é inválida!");
        }

        scanner.close();
    }
}

