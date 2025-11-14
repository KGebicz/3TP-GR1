import java.util.*;
import java.time.*;
import java.util.Optional;

public class BibliotekiRozszerzone {

    public static void main(String[] args) {

        // ===========================
        // 1️⃣ RANDOM – generowanie i dodawanie danych do tablicy
        // ===========================
        Random rand = new Random();

        int liczba = rand.nextInt(50); // losowa liczba 0–49
        double losowyUłamek = rand.nextDouble(); // liczba z zakresu 0.0–1.0
        boolean decyzja = rand.nextBoolean(); // losowy boolean

        System.out.println("Losowa liczba: " + liczba);
        System.out.println("Losowy ułamek: " + losowyUłamek);
        System.out.println("Losowa decyzja: " + decyzja);

        // 🔹 Losowanie elementu z tablicy:
        String[] zwierzęta = {"Kot", "Pies", "Żółw", "Ryba"};
        String wylosowaneZwierze = zwierzęta[rand.nextInt(zwierzęta.length)];
        System.out.println("Wylosowane zwierzę: " + wylosowaneZwierze);

        // 🔹 Losowanie wielu liczb i zapisywanie ich do tablicy
        int[] liczbyLosowe = new int[10]; // tablica 10 liczb
        for (int i = 0; i < liczbyLosowe.length; i++) {
            liczbyLosowe[i] = rand.nextInt(100); // każda liczba z zakresu 0–99
        }

        System.out.println("\nTablica losowych liczb:");
        System.out.println(Arrays.toString(liczbyLosowe));

        // 🔹 Oblicz średnią z wylosowanych liczb
        int suma = 0;
        for (int x : liczbyLosowe) {
            suma += x;
        }
        double średnia = (double) suma / liczbyLosowe.length;
        System.out.println("Średnia wylosowanych liczb: " + średnia);

        // ===========================
        // 2️⃣ MATH – obliczenia matematyczne
        // ===========================
        double promien = 7.5;
        double poleKola = Math.PI * Math.pow(promien, 2);
        double obwod = 2 * Math.PI * promien;
        double max = Math.max(10, 25);
        double min = Math.min(-5, 3);

        System.out.println("\nPole koła: " + poleKola);
        System.out.println("Obwód koła: " + obwod);
        System.out.println("Większa liczba: " + max);
        System.out.println("Mniejsza liczba: " + min);

        // Zaokrąglenia
        double liczbaZmiennoprzecinkowa = 3.756;
        System.out.println("Zaokrąglona liczba: " + Math.round(liczbaZmiennoprzecinkowa));

        // ===========================
        // 3️⃣ JAVA.TIME – praca z datami i czasem
        // ===========================
        LocalDate dzisiaj = LocalDate.now();
        LocalTime czas = LocalTime.now();
        LocalDate urodziny = LocalDate.of(2000, 5, 20);

        Period wiek = Period.between(urodziny, dzisiaj);
        LocalDate za10dni = dzisiaj.plusDays(10);

        System.out.println("\nDzisiejsza data: " + dzisiaj);
        System.out.println("Aktualny czas: " + czas.withNano(0));
        System.out.println("Data urodzin: " + urodziny);
        System.out.println("Masz lat: " + wiek.getYears());
        System.out.println("Data za 10 dni: " + za10dni);

        // ===========================
        // 4️⃣ MAP / HASHMAP – przechowywanie danych
        // ===========================
        Map<String, Integer> magazyn = new HashMap<>();
        magazyn.put("Jabłka", 50);
        magazyn.put("Gruszki", 30);
        magazyn.put("Banany", 100);

        System.out.println("\nZawartość magazynu:");
        for (Map.Entry<String, Integer> e : magazyn.entrySet()) {
            System.out.println(e.getKey() + " – " + e.getValue() + " sztuk");
        }

        // Aktualizacja wartości
        magazyn.put("Jabłka", magazyn.get("Jabłka") + 20);
        System.out.println("Nowy stan jabłek: " + magazyn.get("Jabłka"));

        // Sprawdzenie, czy klucz istnieje
        if (magazyn.containsKey("Banany")) {
            System.out.println("Banany są dostępne w magazynie!");
        }

        // ===========================
        // 5️⃣ SET / HASHSET – unikalne wartości
        // ===========================
        Set<String> uczestnicy = new HashSet<>();
        uczestnicy.add("Ala");
        uczestnicy.add("Bartek");
        uczestnicy.add("Celina");
        uczestnicy.add("Ala"); // duplikat – ignorowany

        System.out.println("\nLista uczestników (unikalne imiona): " + uczestnicy);

        // Sprawdzenie, czy ktoś jest na liście
        System.out.println("Czy Bartek jest na liście? " + uczestnicy.contains("Bartek"));

        // Połączenie zbiorów
        Set<String> nowi = new HashSet<>(Arrays.asList("Daniel", "Ewa"));
        uczestnicy.addAll(nowi);
        System.out.println("Po dodaniu nowych uczestników: " + uczestnicy);

        // ===========================
        // 6️⃣ OPTIONAL – bezpieczna praca z null
        // ===========================
        String nazwisko = null;
        Optional<String> optNazwisko = Optional.ofNullable(nazwisko);
        System.out.println("\nOptional:");
        System.out.println("Czy nazwisko istnieje? " + optNazwisko.isPresent());
        System.out.println("Wartość lub domyślna: " + optNazwisko.orElse("Brak nazwiska"));

        // Optional z wartością
        Optional<String> imie = Optional.of("Krzysztof");
        imie.ifPresent(i -> System.out.println("Witaj, " + i + "!"));
    }
}
