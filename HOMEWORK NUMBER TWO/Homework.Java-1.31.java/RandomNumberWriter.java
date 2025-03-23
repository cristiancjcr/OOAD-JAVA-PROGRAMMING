// RandomNumberWriter.java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberWriter implements Runnable {
    private String fileName;

    public RandomNumberWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Generează un număr aleatoriu între 0 și 99

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Numărul generat este: " + randomNumber);
            System.out.println("Numărul " + randomNumber + " a fost scris în fișierul: " + fileName);
        } catch (IOException e) {
            System.out.println("Eroare la scrierea în fișierul " + fileName + ": " + e.getMessage());
        }
    }
}
