public class Prostokat { 
    private double szerokosc; 
    private double wysokosc; 

    public Prostokat(double szerokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public double pole() {
        return szerokosc * wysokosc;
    }

    public double obwod() {
        return 2 * (szerokosc + wysokosc);
    }
}
//drugi plik nazwa Main.java
// public class Main {
//     public static void main(String[] args) {
//         Prostokat p = new Prostokat(3, 4);

//         System.out.println("Pole: " + p.pole());
//         System.out.println("Obwód: " + p.obwod());
//     }
// }
