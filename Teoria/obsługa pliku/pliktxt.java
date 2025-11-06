// 🔹 Importujemy wszystkie niezbędne klasy z pakietu java.io oraz java.util
// Są to klasy potrzebne do obsługi plików i konsoli.
import java.io.File;             // Klasa reprezentująca plik lub katalog
import java.io.FileReader;       // Klasa do czytania pliku znak po znaku
import java.io.FileWriter;       // Klasa do zapisywania danych do pliku
import java.io.BufferedReader;   // Klasa buforująca odczyt (czyta linie tekstu)
import java.io.BufferedWriter;   // Klasa buforująca zapis (pisze linie tekstu)
import java.io.IOException;      // Klasa reprezentująca wyjątki wejścia/wyjścia
import java.util.Scanner;        // Klasa do prostego wczytywania danych (również z pliku)

public class pliktxt {
    public static void main(String[] args) {
        // 🔸 Zmienna przechowująca nazwę (ścieżkę) pliku, który będziemy czytać
        String nazwaPliku = "dane.txt";

        // ===================================================
        // 1️⃣ ODCZYT PLIKU TEKSTOWEGO przy pomocy BufferedReader
        // ===================================================
        try {
            // Tworzymy obiekt BufferedReader, który opakowuje FileReader
            // FileReader czyta plik znak po znaku, a BufferedReader pozwala czytać całe linie.
            BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku));
            String linia;    // zmienna do przechowywania aktualnie wczytanej linii tekstu
            int licznik = 0; // licznik linii, aby policzyć, ile ich było w pliku

            System.out.println("=== ZAWARTOŚĆ PLIKU dane.txt ===");

            // Pętla wczytuje plik linia po linii, aż do końca pliku (gdy readLine() zwróci null)
            while ((linia = reader.readLine()) != null) {
                licznik++;
                System.out.println("Linia " + licznik + ": " + linia);
            }

            // Zawsze po zakończeniu odczytu należy zamknąć plik
            reader.close();

            System.out.println("Liczba linii w pliku: " + licznik);
            System.out.println();

        } catch (IOException e) {
            // Obsługa błędów, np. gdy plik nie istnieje lub jest zablokowany
            System.out.println("Błąd: nie można odczytać pliku " + nazwaPliku);
            // e.printStackTrace() wypisuje szczegóły błędu (dla nauczyciela lub debugowania)
            e.printStackTrace();
        }

        // ===================================================
        // 2️⃣ ZAPIS DANYCH DO NOWEGO PLIKU przy pomocy BufferedWriter
        // ===================================================
        try {
            // FileWriter w tym konstruktorze nadpisuje istniejący plik lub tworzy nowy
            BufferedWriter writer = new BufferedWriter(new FileWriter("wynik.txt"));

            // Zapisujemy kilka linii tekstu do pliku
            writer.write("To jest plik wynikowy wygenerowany przez program Java.");
            writer.newLine(); // wstawienie znaku nowej linii
            writer.write("Druga linia tekstu w pliku.");
            writer.newLine();
            writer.write("Zapis zakończony pomyślnie!");

            // Zamykamy strumień zapisu (konieczne, żeby dane faktycznie trafiły do pliku)
            writer.close();

            System.out.println("Dane zostały zapisane w pliku wynik.txt");
            System.out.println();

        } catch (IOException e) {
            // Obsługa błędu zapisu (np. brak uprawnień lub brak miejsca na dysku)
            System.out.println("Błąd: nie można zapisać danych do pliku wynik.txt");
            e.printStackTrace();
        }

        // ===================================================
        // 3️⃣ DOPISYWANIE DANYCH DO ISTNIEJĄCEGO PLIKU
        // ===================================================
        try {
            // Użycie drugiego argumentu „true” oznacza tryb dopisywania (append mode)
            // Dzięki temu nie nadpisujemy pliku, tylko dopisujemy dane na końcu.
            BufferedWriter dopisz = new BufferedWriter(new FileWriter("wynik.txt", true));

            // Dodajemy nowe linie do już istniejącego pliku
            dopisz.newLine();
            dopisz.write("Nowa linia dopisana do istniejącego pliku.");
            dopisz.newLine();
            dopisz.write("Dopisano kolejną linię przy użyciu FileWriter w trybie append.");

            // Zamykamy strumień, aby dane zostały zapisane
            dopisz.close();

            System.out.println("Nowe dane zostały dopisane do pliku wynik.txt");
            System.out.println();

        } catch (IOException e) {
            // Obsługa błędu zapisu (np. plik jest tylko do odczytu)
            System.out.println("Błąd: nie można dopisać danych do pliku wynik.txt");
            e.printStackTrace();
        }

        // ===================================================
        // 4️⃣ ODCZYT PLIKU PRZY POMOCY KLASY SCANNER
        // ===================================================
        try {
            // Tworzymy obiekt klasy File, reprezentujący plik na dysku
            File plik = new File("wynik.txt");

            // Tworzymy Scanner do odczytu danych z pliku (nie z klawiatury!)
            Scanner scanner = new Scanner(plik);

            System.out.println("=== ZAWARTOŚĆ PLIKU wynik.txt ===");

            // Pętla odczytuje plik linia po linii — działa podobnie jak BufferedReader
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            // Po odczycie zawsze zamykamy obiekt Scanner
            scanner.close();

        } catch (IOException e) {
            // Obsługa błędu np. gdy plik nie istnieje
            System.out.println("Błąd: problem z plikiem wynik.txt");
            e.printStackTrace();
        }
    }
}
