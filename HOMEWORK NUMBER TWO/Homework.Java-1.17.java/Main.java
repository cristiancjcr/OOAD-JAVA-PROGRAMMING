// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            // Exemplu de coeficiente pentru ecuația ax^2 + bx + c = 0
            Double a = 1.0;
            Double b = -3.0;
            Double c = 2.0;

            // Rezolvăm ecuația
            QuadraticEquationSolver.solveEquation(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (NoRealSolutionException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
