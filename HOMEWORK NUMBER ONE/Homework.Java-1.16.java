// Homework.Java-1.16.

import java.util.Optional;
import java.util.Scanner;

// exceptie pentru ecuatii imposibile
class NoSolutionException extends Exception {
    public NoSolutionException(String message) {
        super(message);
    }
}

// exceptie pentru ecuatii nedeterminate
class InfiniteSolutionsException extends Exception {
    public InfiniteSolutionsException(String message) {
        super(message);
    }
}

// clasa penru rezolvare ecuatiei ax + b = 0
class EquationSolver {
    private Double a;
    private Double b;

    public EquationSolver(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    // metoda care returneaza un optional cu solutia
    public Optional<Double> solve() throws NoSolutionException, InfiniteSolutionsException {
        if (a == 0) {
            if (b == 0) {
                throw new InfiniteSolutionsException("Ecuația are un număr infinit de soluții.");
            } else {
                throw new NoSolutionException("Ecuația nu are soluție.");
            }
        }
        return Optional.of(-b / a);
    }
}

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
