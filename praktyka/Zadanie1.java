public public class Zadanie1 {
    public static void main(String[] args) {
        // Tworzymy klasę Samochod z polami publicznymi (na start, bez enkapsulacji)
        class Samochod {
            String marka;
            int rokProdukcji;
        }

        // Utworzenie obiektu
        Samochod auto1 = new Samochod();
        auto1.marka = "Toyota";
        auto1.rokProdukcji = 2010;

        // Wypisanie danych w konsoli
        System.out.println("Samochód: " + auto1.marka + ", rok: " + auto1.rokProdukcji);
    }
}
