// Main.java
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect Factory pentru stilul Victorian
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        
        victorianChair.sitOn();  // Afișează: Sitting on a Victorian chair.
        victorianSofa.lieOn();   // Afișează: Lying on a Victorian sofa.
        
        // Crearea unui obiect Factory pentru stilul Modern
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        
        modernChair.sitOn();     // Afișează: Sitting on a Modern chair.
        modernSofa.lieOn();      // Afișează: Lying on a Modern sofa.
    }
}
