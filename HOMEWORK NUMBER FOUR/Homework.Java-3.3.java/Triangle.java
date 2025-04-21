// Clasa pentru triunghi
public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Formula: (b * h) / 2
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
