// Clasa care conține logica de rezolvare a ecuației de gradul I
public class EquationSolver {

    public static EquationResult solveEquation(double a, double b) {
        // Cazul: 0x + 0 = 0 → Infinit de soluții
        if (a == 0 && b == 0) {
            return new EquationResult(a, b, "Infinite Solutions", null);
        }
        // Cazul: 0x + b = 0 → Fără soluție (b ≠ 0)
        else if (a == 0) {
            return new EquationResult(a, b, "No Solution", null);
        }
        // Cazul general: ax + b = 0 → Soluție unică x = -b / a
        else {
            double x = -b / a;
            return new EquationResult(a, b, "One Solution", x);
        }
    }
}
