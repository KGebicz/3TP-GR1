package Lekcja3_CW;

import java.util.ArrayList;

public class Uczen {
    private String imie;
    private String nazwisko;
    private ArrayList<Integer> oceny;

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }

    public void dodajOcene(int ocena) {
        if (ocena >= 1 && ocena <= 6) {
            oceny.add(ocena);
        } else {
            System.out.println("Ocena poza zakresem (1..6): " + ocena);
        }
    }

    public double srednia() {
        if (oceny.isEmpty()) return 0.0;
        int suma = 0;
        for (int o : oceny) suma += o;
        return (double) suma / oceny.size();
    }

    public void przedstawSie() {
        System.out.println(imie + " " + nazwisko + ",  średnia ocen: " + srednia());
    }
}