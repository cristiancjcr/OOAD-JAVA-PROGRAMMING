import java.util.List;

// Clasa utilitară pentru a calcula suma ariilor
public class AreaCalculator {

    // Metodă statică ce adună ariile tuturor formelor din listă
    public static double sumAreas(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea(); // Se apelează metoda polimorfică getArea()
        }
        return sum;
    }
}
