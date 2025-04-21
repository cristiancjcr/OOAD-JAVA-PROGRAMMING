// Clasa care modelează rezultatul unei ecuații de gradul I
public class EquationResult {
    public double a; // Coeficientul lui x
    public double b; // Termenul liber
    public String type; // Tipul soluției: "One Solution", "No Solution", "Infinite Solutions"
    public Double solution; // Soluția calculată (sau null dacă nu există una unică)

    // Constructor pentru inițializarea câmpurilor
    public EquationResult(double a, double b, String type, Double solution) {
        this.a = a;
        this.b = b;
        this.type = type;
        this.solution = solution;
    }
}
