import java.util.Scanner;

public class Questao10 {
    public static void main ( String[] args ){
        Scanner scanner = new Scanner(System.in);

        String letra; // Teste

        System.out.println("Olá, digite uma letra e direi se é vogal ou consoante: ");
        letra = scanner.nextLine().toLowerCase(); // Converte para minúsculo para evitar erros

        if ("aeiou".contains(letra)) {
            System.out.println("A letra é uma vogal.");
        } else if (letra.matches("[a-z]")) { // Verifica se é uma única letra válida
            System.out.println("A letra é uma consoante.");
        } else {
            System.out.println("Entrada inválida. Digite apenas uma letra.");
        }

        scanner.close();
    }
}
