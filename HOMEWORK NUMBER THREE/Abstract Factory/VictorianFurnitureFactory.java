// VictorianFurnitureFactory.java
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();  // Returnează un scaun Victorian
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();   // Returnează o canapea Victoriană
    }
}
