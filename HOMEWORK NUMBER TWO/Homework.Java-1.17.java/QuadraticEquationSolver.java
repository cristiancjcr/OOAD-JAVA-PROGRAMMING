// QuadraticEquationSolver.java
public class QuadraticEquationSolver {
    // Metoda pentru rezolvarea ecuației
    public static void solveEquation(Double a, Double b, Double c) throws NoRealSolutionException {
        // Verificăm dacă coeficientele sunt valide
        ValidationUtil.validateCoefficients(a, b, c);

        // Calculăm discriminantul
        double discriminant = b * b - 4 * a * c;

        // Dacă discriminantul este negativ, aruncăm o excepție personalizată
        if (discriminant < 0) {
            throw new NoRealSolutionException("Ecuația nu are soluții reale.");
        }

        // Calculăm soluțiile
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        // Afișăm soluțiile
        if (discriminant == 0) {
            System.out.println("Soluția unică: x = " + root1);
        } else {
            System.out.println("Soluțiile sunt: x1 = " + root1 + ", x2 = " + root2);
        }
    }
}
