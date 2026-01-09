abstract class Pojazd {

    // Pole wspólne dla wszystkich pojazdów
    String marka;

    // Konstruktor klasy abstrakcyjnej
    Pojazd(String marka) {
        this.marka = marka;
    }

    /*
    Metoda abstrakcyjna:
    - nie ma ciała,
    - każda klasa dziedzicząca MUSI ją zaimplementować,
    - określa "CO obiekt robi", ale nie "JAK".
    */
    abstract void jedz();

    // Zwykła metoda (może mieć implementację)
    void wyswietlMarke() {
        System.out.println("Marka pojazdu: " + marka);
    }
}

/*
---------------------------------------------
KLASY DZIEDZICZĄCE
---------------------------------------------
Każda klasa MUSI zaimplementować metodę jedz()
*/

class Samochod extends Pojazd {

    Samochod(String marka) {
        super(marka); // wywołanie konstruktora klasy abstrakcyjnej
    }

    @Override
    void jedz() {
        System.out.println("Samochód jedzie po drodze");
    }
}

class Rower extends Pojazd {

    Rower(String marka) {
        super(marka);
    }

    @Override
    void jedz() {
        System.out.println("Rower jedzie po ścieżce rowerowej");
    }
}

/*
---------------------------------------------
KLASA TESTOWA
---------------------------------------------
*/

public class Main {
    public static void main(String[] args) {

        /*
        UWAGA:
        - nie możemy utworzyć obiektu klasy Pojazd,
        - ale możemy użyć jej jako TYPU ZMIENNEJ.
        */

        Pojazd p1 = new Samochod("Toyota");
        Pojazd p2 = new Rower("Kross");

        /*
        POLIMORFIZM:
        - ta sama metoda jedz(),
        - różne zachowanie w zależności od obiektu.
        */

        p1.wyswietlMarke();
        p1.jedz();

        p2.wyswietlMarke();
        p2.jedz();
    }
}
