import java.util.Optional;

// clasa penru rezolvare ecuatiei ax + b = 0
public class EquationSolver {
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
