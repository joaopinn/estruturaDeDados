import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // teste
        DecimalFormat df = new DecimalFormat("#.##");

        String moeda;
        double euro, dolarCanadense, dolarAmericano, pesoArgentino, real;
        double resultado = 0; // Variável para armazenar a conversão

        euro = 6.00 ;
        dolarAmericano = 5.81;
        dolarCanadense = 4.03;
        pesoArgentino = 0.28;

        System.out.print("Digite reais você tem: ");
        real = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite qual moeda você quer: euro, dólar americano, dólar canadense, peso argentino: ");
        moeda = scanner.nextLine().toLowerCase(); ;

        switch (moeda) {
            case "euro":
                resultado = real / euro;
                System.out.println("Você terá em euro: " + df.format(resultado));
                break;
            case "dólar americano":
                resultado = real / dolarAmericano;
                System.out.println("Você terá em dólar americano: " + df.format(resultado));
                break;
            case "dólar canadense":
                resultado = real / dolarCanadense;
                System.out.println("Você terá em dólar canadense: " + df.format(resultado));
                break;
            case "peso argentino":
                resultado = real / pesoArgentino;
                System.out.println("Você terá em peso argentino: " + df.format(resultado));
                break;
            default:
                System.out.println("Opção inválida");

                scanner.close();
        }

    }
}
