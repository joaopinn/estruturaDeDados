import java.util.Scanner;

public class Questao14 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        // Teste
        double preco, menorPreco;
        int mercado;

        mercado = 1;

        System.out.print("Para termos como base e saber qual é o menor preço entre os mercados, diga o valor do primeiro merdado: ");
        menorPreco = scanner.nextDouble();

        for ( int i = 2; i <= 6; i++){

            System.out.print("Diga o preço dos últimos 30 dias do mercado " + i + ": ");
            preco = scanner.nextDouble();

            if ( preco < menorPreco ){
                menorPreco = preco;
                mercado = i;
            }
        }

        System.out.printf("O mercado " + mercado + " tem o menor preço no valor de: %.2f%n", menorPreco);
    }
}
