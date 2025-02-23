import java.util.Scanner;

public class Questao3 {
    public static void main(String[]ARGS){
        Scanner scanner = new Scanner(System.in);

        int numero, resultado, multiplicacao;

        System.out.println("Digite o número que você deseje saber a multiplicação dele até 10: ");
        numero = scanner.nextInt();

        for (multiplicacao = 0; multiplicacao <= 10; multiplicacao ++){
            resultado = numero * multiplicacao;
            System.out.println("Tábuada: " + numero + " * " + multiplicacao + " = " + resultado);
        } // Teste
    }
}
