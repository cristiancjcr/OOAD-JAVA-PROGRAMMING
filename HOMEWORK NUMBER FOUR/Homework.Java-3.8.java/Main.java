import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Cream formele
        Shape circle = new Circle();
        Shape square = new Square();

        // Le injectăm în drawer
        ShapeDrawer drawer = new ShapeDrawer(Arrays.asList(circle, square));

        // Le desenăm
        drawer.drawAll();
    }
}
