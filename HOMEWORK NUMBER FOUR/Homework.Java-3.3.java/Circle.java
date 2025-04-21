// Clasa pentru cerc
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Formula: π * r^2
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
