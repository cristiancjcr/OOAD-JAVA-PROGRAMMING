// Fișier: Main.java
public class Main {
    public static void main(String[] args) {
        // Creăm un dispozitiv american
        AmericanDevice device = new AmericanDevice();
        
        // Creăm un adapter care îl face compatibil cu priza europeană
        EuropeanSocket adapter = new SocketAdapter(device);

        // Folosim dispozitivul american cu priza europeană
        adapter.provideElectricity();
    }
}
