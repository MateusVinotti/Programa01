import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();

        String mesCorrespondente;

        switch (numeroMes) {
            case 1:
                mesCorrespondente = "Janeiro";
                break;
            case 2:
                mesCorrespondente = "Fevereiro";
                break;
            case 3:
                mesCorrespondente = "Março";
                break;
            case 4:
                mesCorrespondente = "Abril";
                break;
            case 5:
                mesCorrespondente = "Maio";
                break;
            case 6:
                mesCorrespondente = "Junho";
                break;
            case 7:
                mesCorrespondente = "Julho";
                break;
            case 8:
                mesCorrespondente = "Agosto";
                break;
            case 9:
                mesCorrespondente = "Setembro";
                break;
            case 10:
                mesCorrespondente = "Outubro";
                break;
            case 11:
                mesCorrespondente = "Novembro";
                break;
            case 12:
                mesCorrespondente = "Dezembro";
                break;
            default:
                mesCorrespondente = "Mês inválido";
                break;
        }

        System.out.println("O mês correspondente é: " + mesCorrespondente);

        scanner.close();
    }

}
