import java.util.Scanner;

public class Questao2 {
    public static void main ( String[] args ){
        Scanner scanner = new Scanner (System.in);

        double temperatura; // Teste

        System.out.print("Digite a temperatura: ");
        temperatura = scanner.nextDouble();

        if ( temperatura > 17) {
            System.out.println(" Tudo normal nas terras de Cuçumarim");
        } else {
            System.out.println("Frio da moléstia");
        }

        scanner.close();
    }
}
