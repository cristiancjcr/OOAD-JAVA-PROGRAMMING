// Homework.Java-1.13.

import java.io.*;
import java.util.Scanner;

class FileReaderException extends Exception {
    public FileReaderException(String message) {
        super(message);
    }
}

public class Main {

    // metoda pentru a citi nr din fișier
    public static int citesteNumarDinFisier(String numeFisier) throws FileReaderException {
        int x = 1;  // val. de baza
        try {
            File file = new File(numeFisier);
            if (!file.exists()) {
                throw new FileReaderException("Fisierul nu exista.");
            }

            Scanner scanner = new Scanner(file);
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            } else {
                throw new FileReaderException("Fisierul nu contine un nr valid.");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new FileReaderException("Fisierul nu a fost gasit.");
        } catch (Exception e) {
            throw new FileReaderException("A aparut o eroare la citirea fisierului: " + e.getMessage());
        }
        return x;
    }

    // metoda pentru a calcula 2 * x
    public static int calculeazaDublu(int x) {
        return 2 * x;
    }

    public static void main(String[] args) {
        String numeFisier = "input.txt";  // numele fisierului
        int x;

        // citim nr din fisier
        try {
            x = citesteNumarDinFisier(numeFisier);
        } catch (FileReaderException e) {
            System.out.println("Eroare: " + e.getMessage());
            x = 1; //daca apare o eroare, se foloseste valoarea implicita (1)
        }

        // calcularea valorii 2 * x
        int rezultat = calculeazaDublu(x);
        
        // afisare rezultat
        System.out.println("Rezultatul este: " + rezultat);
    }
}
