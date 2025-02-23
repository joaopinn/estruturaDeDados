import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Teste
        int numeroCarta;

        System.out.print("Digite um número de 1 a 13: ");
        numeroCarta = scanner.nextInt();

        String nomeCarta;

        switch (numeroCarta) {
            case 1:
                nomeCarta = "Ás";
                break;
            case 11:
                nomeCarta = "Valete";
                break;
            case 12:
                nomeCarta = "Rainha";
                break;
            case 13:
                nomeCarta = "Rei";
                break;
            case 2:
                nomeCarta = "Dois";
                break;
            case 3:
                nomeCarta = "Três";
                break;
            case 4:
                nomeCarta = "Quatro";
                break;
            case 5:
                nomeCarta = "Cinco";
                break;
            case 6:
                nomeCarta = "Seis";
                break;
            case 7:
                nomeCarta = "Sete";
                break;
            case 8:
                nomeCarta = "Oito";
                break;
            case 9:
                nomeCarta = "Nove";
                break;
            case 10:
                nomeCarta = "Dez";
                break;
            default:
                nomeCarta = "Número inválido! Digite um número de 1 a 13.";
                break;
        }

        System.out.println("A carta correspondente é: " + nomeCarta);
        scanner.close();
    }
}
