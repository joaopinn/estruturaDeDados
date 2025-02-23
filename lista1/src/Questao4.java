import java.util.Scanner;

public class Questao4 {

    public static void main( String[] args){
        Scanner scanner = new Scanner (System.in); // teste

        double area, lado1, lado2, lado3, lado4;

        System.out.print("Digite a medida do lado 1: ");
        lado1 = scanner.nextDouble();

        System.out.print("Digite a medida do lado 2: ");
        lado2 = scanner.nextDouble();

        System.out.print("Digite a medida do lado 3: ");
        lado3 = scanner.nextDouble();

        System.out.print("Digite a medida do lado 4: ");
        lado4 = scanner.nextDouble();

        area = lado1 + lado2 + lado3 + lado4;

        System.out.println("A soma de todos os lados é: " + area + " em metros");

        scanner.close();
    }

}
