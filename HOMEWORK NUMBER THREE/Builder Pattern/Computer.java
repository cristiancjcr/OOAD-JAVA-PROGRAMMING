// Computer.java
public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private boolean bluetooth;

    // Constructor privat pentru a permite doar construcția prin builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    // Metode getter pentru a accesa detaliile computerului
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public boolean hasBluetooth() { return bluetooth; }

    // Builder pentru crearea unui Computer
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private boolean bluetooth;

        // Setează CPU
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        // Setează RAM
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        // Setează storage
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        // Setează graphics card
        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Setează Bluetooth
        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        // Crează obiectul final (Computer)
        public Computer build() {
            return new Computer(this);
        }
    }
}
