public class EquationSolver {

    public static EquationResult solveEquation(double a, double b) {
        if (a == 0 && b == 0) {
            return new EquationResult(a, b, "Infinite Solutions", null);
        } else if (a == 0) {
            return new EquationResult(a, b, "No Solution", null);
        } else {
            double x = -b / a;
            return new EquationResult(a, b, "One Solution", x);
        }
    }
}
