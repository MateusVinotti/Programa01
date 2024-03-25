import java.util.Scanner;

public class Exercicio06 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }

}
