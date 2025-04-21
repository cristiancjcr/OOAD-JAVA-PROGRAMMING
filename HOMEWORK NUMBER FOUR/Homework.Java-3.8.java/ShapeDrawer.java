import java.util.List;

public class ShapeDrawer {

    private List<Shape> shapes;

    public ShapeDrawer(List<Shape> shapes) {
        this.shapes = shapes; // injectare a formelor prin constructor
    }

    public void drawAll() {
        shapes.forEach(Shape::draw); // se apelează metoda din interfață
    }
}
