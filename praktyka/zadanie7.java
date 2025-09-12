import java.util.Random;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ile liczb wylosować? ");
        int n = scanner.nextInt();

        int[] liczby = new int[n];
        int suma = 0;

        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < n; i++) {
            liczby[i] = rand.nextInt(50) + 1; // losuje 1–50
            System.out.print(liczby[i] + " ");
            suma += liczby[i];
        }

        double srednia = (double) suma / n;
        System.out.println("\nŚrednia = " + srednia);

        System.out.print("Liczby większe od średniej: ");
        for (int liczba : liczby) {
            if (liczba > srednia) {
                System.out.print(liczba + " ");
            }
        }
    }
}
