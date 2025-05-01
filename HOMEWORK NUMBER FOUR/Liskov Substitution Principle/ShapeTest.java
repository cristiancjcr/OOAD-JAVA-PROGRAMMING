public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 10);
        Shape shape2 = new Circle(7);
        Shape shape3 = new Square(4);

        printArea(shape1);  // Ar trebui să calculeze corect pentru un dreptunghi
        printArea(shape2);  // Ar trebui să calculeze corect pentru un cerc
        printArea(shape3);  // Ar trebui să calculeze corect pentru un pătrat
    }

    // Metodă care primește un obiect Shape și calculează aria
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}
