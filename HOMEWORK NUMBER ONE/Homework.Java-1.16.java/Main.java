import java.util.Scanner;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // citim coeficientii a & b
            System.out.print("Introduceți coeficientul a: ");
            Double a = scanner.nextDouble();

            System.out.print("Introduceți coeficientul b: ");
            Double b = scanner.nextDouble();

            // cream obiectul EquationSolver
            EquationSolver solver = new EquationSolver(a, b);

            // rezolvam ecuatia
            Optional<Double> solution = solver.solve();
            System.out.println("Soluția ecuației este: x = " + solution.get());

        } catch (InfiniteSolutionsException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (NoSolutionException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A apărut o eroare neașteptată: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
