import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo de viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média da viagem (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double litrosCombustivel = (tempoViagem * velocidadeMedia) / 12.0;

        System.out.printf("Quantidade de litros de combustível gasta: %.2f\n", litrosCombustivel);

        scanner.close();
    }

}
