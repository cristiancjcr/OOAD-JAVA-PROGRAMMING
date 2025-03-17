// Homework.Java-1.14.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { // Schimbat din App în Main
    // Metodă pentru citirea unui număr întreg valid
    int readNumber() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Introduceți un număr întreg: ");
                return in.nextInt(); // Se returnează numărul dacă este valid
            } catch (InputMismatchException ex) {
                System.err.println("Valoarea introdusă nu este un număr întreg. Încercați din nou.");
                in.nextLine(); // Curățăm bufferul scannerului
            }
        }
    }

    public static void main(String[] args) {
        Main app1 = new Main(); // Schimbat numele clasei în Main
        int nr, sum = 0;

        // Citirea primului număr
        nr = app1.readNumber();
        sum += nr;

        // Citirea celui de-al doilea număr
        nr = app1.readNumber();
        sum += nr;

        // Afișarea sumei
        System.out.println("Suma: " + sum);
    }
}
