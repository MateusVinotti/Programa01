import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo (a1): ");
        int a1 = scanner.nextInt();

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Digite a razão (r): ");
        int r = scanner.nextInt();

        int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "-ésimo termo da Progressão Aritmética é: " + an);

        scanner.close();
    }

}
