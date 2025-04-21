import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

// Clasa principală care rulează aplicația
public class Main {
    public static void main(String[] args) {
        // Exemplu de valori pentru a și b
        double a = 2;
        double b = -4;

        // Apelăm metoda pentru a rezolva ecuația
        EquationResult result = EquationSolver.solveEquation(a, b);

        // Creăm un obiect ObjectMapper pentru a lucra cu JSON (Jackson)
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Scriem rezultatul în fișierul JSON, formatat frumos
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("equation_result.json"), result);
            System.out.println("Rezultatul a fost salvat în equation_result.json");
        } catch (IOException e) {
            // Tratăm eventualele erori de scriere în fișier
            System.err.println("Eroare la salvarea fișierului JSON: " + e.getMessage());
        }
    }
}
