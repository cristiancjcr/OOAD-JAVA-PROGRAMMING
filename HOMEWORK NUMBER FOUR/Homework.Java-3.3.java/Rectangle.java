// Clasa pentru dreptunghi
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Formula: l * L
    @Override
    public double getArea() {
        return width * height;
    }
}
