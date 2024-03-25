import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("Distância entre os pontos: %.2f\n", distancia);

        scanner.close();
    }

}
