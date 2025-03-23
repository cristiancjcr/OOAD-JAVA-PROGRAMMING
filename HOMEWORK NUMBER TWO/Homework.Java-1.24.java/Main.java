// Main.java
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Calea fișierului de intrare
        String fisier = "numere.txt";  // Înlocuiți cu calea fișierului dorit

        try {
            // Citim fișierul și obținem liniile
            String[] linii = FileReaderUtil.citesteFisier(fisier);

            // Calculăm suma numerelor întregi din liniile fișierului
            int suma = SumaNumerelorIntregi.calculeazaSumaIntregi(linii);

            // Afișăm suma
            System.out.println("Suma numerelor întregi din fișier este: " + suma);
        } catch (IOException e) {
            // Tratarea excepțiilor de fișier
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
