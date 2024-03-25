import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = A + B;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = A - B;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = A * B;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador não definido.");
                break;
        }

        scanner.close();
    }

}
