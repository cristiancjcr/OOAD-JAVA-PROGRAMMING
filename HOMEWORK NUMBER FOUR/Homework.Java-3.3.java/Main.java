import java.util.ArrayList;
import java.util.List;

// Clasa principală unde se execută programul
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Adăugăm câteva forme în listă
        shapes.add(new Circle(3));           // Aria = π * 3^2 = 28.27
        shapes.add(new Rectangle(4, 5));     // Aria = 4 * 5 = 20
        shapes.add(new Triangle(6, 2));      // Aria = (6 * 2)/2 = 6

        // Calculăm suma ariilor
        double totalArea = AreaCalculator.sumAreas(shapes);

        System.out.println("Suma ariilor este: " + totalArea);
    }
}
