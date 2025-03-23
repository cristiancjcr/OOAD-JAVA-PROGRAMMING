// ValidationUtil.java
public class ValidationUtil {
    // Validăm coeficientele pentru a verifica dacă sunt valide
    public static void validateCoefficients(Double a, Double b, Double c) {
        // Verificăm dacă vreun coeficient este null
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Coeficientele nu pot fi null.");
        }

        // Verificăm dacă coeficientul a este zero
        if (a == 0) {
            throw new IllegalArgumentException("Coeficientul 'a' nu poate fi 0 într-o ecuație de gradul 2.");
        }
    }
}
