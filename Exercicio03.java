import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro (A): ");
        int numeroA = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (B): ");
        int numeroB = scanner.nextInt();

        if (numeroA == numeroB) {
            System.out.println("A sequência de números informada é inválida, pois os números são iguais.");
        } else {
            if (numeroA > numeroB) {
                System.out.println("O número A (" + numeroA + ") é maior que o número B (" + numeroB + ").");
            } else {
                System.out.println("O número B (" + numeroB + ") é maior que o número A (" + numeroA + ").");
            }
        }

        scanner.close();
    }

}
