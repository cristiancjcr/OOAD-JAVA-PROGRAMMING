// Fișier: Main.java
public class Main {
    public static void main(String[] args) {
        // Creăm componentele individuale
        DVDPlayer dvd = new DVDPlayer();
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();

        // Creăm fațada care simplifică utilizarea lor
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, projector);

        // Pornim sistemul și redăm un film
        homeTheater.watchMovie("Inception");

        // Oprim sistemul
        homeTheater.endMovie();
    }
}
