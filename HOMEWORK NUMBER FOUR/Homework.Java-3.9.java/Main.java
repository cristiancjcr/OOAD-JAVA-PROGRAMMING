import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cream câteva forme
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(3, 6);

        List<Shape> shapes = Arrays.asList(circle, square, rectangle);

        // Calculăm aria totală
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Total area of shapes: " + totalArea);
    }
}
