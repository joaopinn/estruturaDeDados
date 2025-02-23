import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        float areaTotal = 0, areacomodo = 1;

        Scanner sc = new Scanner(System.in);

        while (areacomodo > 0){
            System.out.println("digite area de um cômodo: ");
            areacomodo = sc.nextFloat();
            areaTotal = areacomodo + areaTotal;
        }

        System.out.println("A área total é de " + areaTotal + " metros²");

    }
} // Teste
