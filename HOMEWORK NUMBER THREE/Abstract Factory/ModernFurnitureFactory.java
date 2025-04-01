// ModernFurnitureFactory.java
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();  // Returnează un scaun Modern
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();   // Returnează o canapea Modernă
    }
}
