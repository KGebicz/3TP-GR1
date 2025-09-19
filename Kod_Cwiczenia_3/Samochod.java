package Lekcja3_CW;

public class Samochod { 
    private String marka;
    private String model;
    private int rokProdukcji;
    private int przebieg;

    public Samochod(String marka, String model, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        setPrzebieg(przebieg);
    }

    public void jedz(int km) {
        if (km > 0) {
            przebieg += km;
        }
    }

    public void setPrzebieg(int przebieg) {
        if (przebieg < 0) { 
            throw new IllegalArgumentException("Przebieg nie może być ujemny!");
        }
        this.przebieg = przebieg;
    }
    public void przedstaw() {
        System.out.println(marka + " " + model + " (" + rokProdukcji + "), przebieg: " + przebieg + " km");
    }
}

//drugi plik Main.java
//
// public class Main {
//     public static void main(String[] args) {
//         Samochod s = new Samochod("Toyota", "Corolla", 2010, 120000);
//         s.przedstaw();
//         s.jedz(150);
//         s.przedstaw();
//     }
// }
