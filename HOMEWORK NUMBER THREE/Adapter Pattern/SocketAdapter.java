// Fișier: SocketAdapter.java
public class SocketAdapter implements EuropeanSocket {
    private AmericanDevice americanDevice;

    // Constructor care primește dispozitivul american
    public SocketAdapter(AmericanDevice americanDevice) {
        this.americanDevice = americanDevice;
    }

    @Override
    public void provideElectricity() {
        // Adapterul "traduce" priza europeană în priza americană
        System.out.println("Adapter convertește priza europeană pentru dispozitivul american.");
        americanDevice.plugInAmericanSocket();
    }
}
