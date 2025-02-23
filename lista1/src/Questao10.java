import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // teste

        // Definições
        double coberturaPorLitro = 6.0;
        int capacidadeLata = 18;
        int capacidadeGalao = 4;
        double precoLata = 80.0;
        double precoGalao = 25.0;

        // Entrada do usuário
        System.out.print("Digite o tamanho da área a ser pintada (m²): ");
        double area = scanner.nextDouble();

        // Calcula a quantidade de tinta necessária com 10% de folga
        double litrosNecessarios = (area / coberturaPorLitro) * 1.1;

        // Opção 1: Apenas latas de 18 litros
        int latasApenas = (int) Math.ceil(litrosNecessarios / capacidadeLata);
        double custoLatasApenas = latasApenas * precoLata;

        // Opção 2: Apenas galões de 3,6 litros
        int galoesApenas = (int) Math.ceil(litrosNecessarios / capacidadeGalao);
        double custoGaloesApenas = galoesApenas * precoGalao;

        // Opção 3: Misturar latas e galões para minimizar desperdício
        int latasMisturado = (int) (litrosNecessarios / capacidadeLata);
        double restante = litrosNecessarios % capacidadeLata;
        int galoesMisturado = (int) Math.ceil(restante / capacidadeGalao);
        double custoMisturado = (latasMisturado * precoLata) + (galoesMisturado * precoGalao);

        // Exibir resultados
        System.out.println("\nOpções de compra:");
        System.out.println("1) Apenas latas de 18 litros: " + latasApenas + " latas - Custo: R$ " + custoLatasApenas);
        System.out.println("2) Apenas galões de 3,6 litros: " + galoesApenas + " galões - Custo: R$ " + custoGaloesApenas);
        System.out.println("3) Misturando latas e galões: " + latasMisturado + " latas e " + galoesMisturado + " galões - Custo: R$ " + custoMisturado);

        scanner.close();
    }
}

