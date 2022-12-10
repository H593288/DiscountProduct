import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner for å lese objektet fra brukeren
        Scanner scanner = new Scanner(System.in);

        // opprinnelig pris og rabatt prosenten
        System.out.println("Original pris: ");
        double opprinneligPris = scanner.nextDouble();
        System.out.println("Rabatt prosent: ");
        double rabattprosent = scanner.nextDouble() /100;

        // regne rabatt prosenten
        double mengdeRabattProsent = opprinneligPris * rabattprosent;

        double finalPris = opprinneligPris - mengdeRabattProsent;

        // Print ut prisen etter rabatt
        System.out.println("Final price: " + finalPris + " NOK");

    }
}