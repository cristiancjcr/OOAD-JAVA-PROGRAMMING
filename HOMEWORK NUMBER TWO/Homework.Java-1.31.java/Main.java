// Main.java
public class Main {
    public static void main(String[] args) {
        // Numărul de fișiere pe care dorim să le generăm
        int numereDeGenerat = 3;

        // Lansează thread-urile pentru a genera numere și a le scrie în fișiere
        ThreadManager.startThreads(numereDeGenerat);
    }
}
