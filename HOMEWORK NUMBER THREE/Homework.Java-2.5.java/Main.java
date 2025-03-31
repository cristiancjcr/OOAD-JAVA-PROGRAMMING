public class Main {
    public static void main(String[] args) {
        // Testăm clasa C2Nr pentru suma a două numere
        C2Nr c2nr = new C2Nr(3.5, 4.2);
        System.out.println("Suma celor doua numere: " + c2nr.suma());

        // Testăm clasa C3Nr pentru suma a trei numere
        C3Nr c3nr = new C3Nr(1.2, 3.5, 7.8);
        System.out.println("Suma celor trei numere: " + c3nr.suma());
    }
}
