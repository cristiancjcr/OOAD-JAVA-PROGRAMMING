// Main.java
public class Main {
    public static void main(String[] args) {
        // Crearea unui computer cu setări de bază
        Computer basicComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("1TB HDD")
            .build();  // Construiește computerul

        // Crearea unui computer high-end cu toate opțiunile
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 3090")
            .setBluetooth(true)
            .build();  // Construiește computerul

        // Afișează detalii despre computerul de bază
        System.out.println("Basic Computer: ");
        System.out.println("CPU: " + basicComputer.getCPU());
        System.out.println("RAM: " + basicComputer.getRAM());

        // Afișează detalii despre computerul gaming
        System.out.println("Gaming Computer: ");
        System.out.println("CPU: " + gamingComputer.getCPU());
        System.out.println("RAM: " + gamingComputer.getRAM());
        System.out.println("Graphics Card: " + gamingComputer.getGraphicsCard());
        System.out.println("Bluetooth: " + gamingComputer.hasBluetooth());
    }
}
