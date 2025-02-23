import java.util.Scanner;

public class Questao2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;

        for ( numero = 0; numero <= 20; numero++ ){
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " (PAR)!");
            } else {
                System.out.println("O número " + numero + " (ÍMPAR)!");
            } // Teste
        }
    }
}
