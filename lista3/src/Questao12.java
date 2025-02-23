import java.util.Scanner;

public class Questao12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int pesoBagagem, totalBagagens, precoQuilo;
        double pesoMedio, total;

        precoQuilo = 10;
        pesoBagagem = 0;

        System.out.print("Diga quantas bagagens tem: ");
        totalBagagens = scanner.nextInt();

        for (int i = 1; i <= totalBagagens; i++ ){

            System.out.print("Diga qual é o peso dessa bagagem: ");
            pesoBagagem += scanner.nextDouble();

        } // Teste

        pesoMedio = pesoBagagem / totalBagagens;
        total = pesoMedio * precoQuilo;

        System.out.printf("O peso médio das bagagens foi: %.2f kg%n", pesoMedio);
        System.out.printf("O preço médio da bagagem foi: %.2f reais%n", total);
    }
}
