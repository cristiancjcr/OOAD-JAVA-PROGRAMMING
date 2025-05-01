// Clasa derivată Square care moștenește Rectangle
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);  // Un pătrat este un caz special de dreptunghi
    }

    // Reimplementăm calculateArea() pentru pătrat (nu ar trebui să o facem)
    @Override
    public double calculateArea() {
        return super.calculateArea(); // Ar putea fi redundant, dar menținem aceleași funcționalități
    }
}
