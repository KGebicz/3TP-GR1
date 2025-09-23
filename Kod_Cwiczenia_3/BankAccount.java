package Lekcja3_CW;

public class BankAccount { // definicja klasy BankAccount (konto bankowe)
    // private String numerKonta;      // numer konta np. "111-222"
    private double saldo;           // aktualne saldo (stan środków na koncie)
    private static int liczbaKont = 0; // statyczne pole: licznik utworzonych kont

    // Konstruktor ustawiający numer konta i saldo początkowe
    public BankAccount(String numerKonta, double saldoPoczatkowe) {
        // this.numerKonta = numerKonta;   // przypisanie numeru konta
        this.saldo = saldoPoczatkowe;   // ustawiamy saldo startowe
        liczbaKont++;                   // zwiększamy licznik kont (dla całej klasy, nie obiektu)
    }

    // Metoda wplaty — dodaje środki do konta
    public void wplac(double kwota) {
        if (kwota > 0) saldo += kwota; // tylko dodatnie kwoty można wpłacać
        else System.out.println("Kwota do wpłaty musi być dodatnia.");
    }

    // Metoda wypłaty — zmniejsza saldo
    public void wyplac(double kwota) {
        if (kwota <= 0) { // sprawdzamy czy kwota jest dodatnia
            System.out.println("Kwota do wypłaty musi być dodatnia.");
        } else if (kwota <= saldo) { // sprawdzamy czy są wystarczające środki
            saldo -= kwota; // odejmujemy od salda
        } else {
            System.out.println("Niewystarczające środki. Saldo: " + saldo);
        }
    }

    // Getter do odczytania salda
    public double getSaldo() {
        return saldo;
    }

    // Getter statyczny — zwraca łączną liczbę utworzonych kont
    public static int getLiczbaKont() {
        return liczbaKont;
    }

    
}
