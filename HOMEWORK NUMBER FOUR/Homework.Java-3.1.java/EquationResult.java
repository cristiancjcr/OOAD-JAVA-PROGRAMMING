public class EquationResult {
    public double a;
    public double b;
    public String type; // "One Solution", "No Solution", "Infinite Solutions"
    public Double solution; // null dacă nu există soluție unică

    public EquationResult(double a, double b, String type, Double solution) {
        this.a = a;
        this.b = b;
        this.type = type;
        this.solution = solution;
    }
}
