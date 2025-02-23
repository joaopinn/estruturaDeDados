import java.util.Scanner;

public class Questao5 {
    public static void main (String[] args ){
        Scanner scanner = new Scanner ( System.in );

        String sexo;
        double horario, ingresso, metade, promocaoIngresso;

        ingresso = 24;
        metade = ingresso / 2;
        promocaoIngresso = ingresso * 0.70;

        System.out.println("Você é homem ou mulher? ");
        sexo = scanner.nextLine();

        System.out.println("Você chegou em qual horário ( em horas ) ? ");
        horario = scanner.nextDouble();

        if ( sexo.equalsIgnoreCase("mulher") && horario >= 22 ) {
            System.out.println("Você não pagará nada");
        } else {
            System.out.println("Você chegou depois do horário, pagará " + metade + " reais");
        } if ( sexo.equalsIgnoreCase("homem") && horario >= 22 ) {
            System.out.printf("Você pagará com 70% de desconto: %.2f" + promocaoIngresso + " reais");
        } else {
            System.out.println("Você chegou depois do horário, pagará " + ingresso + " reais");
        } // Teste
    }
}
