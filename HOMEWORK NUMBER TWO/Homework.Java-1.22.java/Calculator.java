// Calculator.java
import java.util.Scanner;

public class Calculator {

    // Metodă pentru citirea unui număr de la tastatură
    public static Integer citesteNumar() throws SumaNumerelorException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Verificăm dacă inputul este null sau gol
        if (input == null || input.trim().isEmpty()) {
            throw new SumaNumerelorException("Inputul nu poate fi null sau gol.");
        }

        // Încercăm să convertim inputul în număr
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new SumaNumerelorException("Inputul nu este un număr valid.");
        }
    }

    // Metodă pentru calcularea sumei celor două numere
    public static Integer calculeazaSuma(Integer numar1, Integer numar2) {
        return numar1 + numar2;
    }

    // Metodă pentru a citi două numere și a le aduna
    public static void adunaNumere() {
        try {
            System.out.println("Introduceți primul număr:");
            Integer numar1 = citesteNumar();

            System.out.println("Introduceți al doilea număr:");
            Integer numar2 = citesteNumar();

            Integer suma = calculeazaSuma(numar1, numar2);
            System.out.println("Suma celor două numere este: " + suma);
        } catch (SumaNumerelorException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
