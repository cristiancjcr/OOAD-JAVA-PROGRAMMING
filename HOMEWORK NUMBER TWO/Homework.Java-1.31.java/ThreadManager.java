// ThreadManager.java
public class ThreadManager {

    public static void startThreads(int numereDeGenerat) {
        // Creăm și lansăm un thread pentru fiecare număr de generat
        for (int i = 1; i <= numereDeGenerat; i++) {
            String fileName = "numar_" + i + ".txt";  // Fiecare fișier va avea un nume diferit
            Thread thread = new Thread(new RandomNumberWriter(fileName));
            thread.start();  // Lansează thread-ul
        }
    }
}
