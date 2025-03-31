// Fișier: Main.java
// (testarea observer pattern)
public class Main {
    public static void main(String[] args) {
        // Creăm un canal YouTube (Subject)
        YouTubeChannel channel = new YouTubeChannel("TechZone");

        // Creăm abonați (Observers)
        Subscriber user1 = new Subscriber("Alice");
        Subscriber user2 = new Subscriber("Bob");

        // Abonăm utilizatorii la canal
        channel.addObserver(user1);
        channel.addObserver(user2);

        // Canalul postează un videoclip nou
        channel.uploadVideo("Design Patterns în Java");

        // Dezabonăm un utilizator
        channel.removeObserver(user1);

        // Canalul postează alt videoclip
        channel.uploadVideo("Singleton Pattern explicat");
    }
}
