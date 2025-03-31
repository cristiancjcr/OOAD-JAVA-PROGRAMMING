// Fișier: HomeTheaterFacade.java
// fațada - gestionează toate componentele
public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Amplifier amp;
    private Projector projector;

    // Constructor - inițializează componentele
    public HomeTheaterFacade(DVDPlayer dvd, Amplifier amp, Projector projector) {
        this.dvd = dvd;
        this.amp = amp;
        this.projector = projector;
    }

    // Metodă simplificată pentru a porni sistemul home theater
    public void watchMovie(String movie) {
        System.out.println("\n--- Pregătire pentru film ---");
        projector.turnOn();
        projector.setInput("DVD");
        amp.turnOn();
        amp.setVolume(10);
        dvd.turnOn();
        dvd.play(movie);
    }

    // Metodă simplificată pentru a opri sistemul
    public void endMovie() {
        System.out.println("\n--- Închidere sistem Home Theater ---");
        dvd.turnOff();
        amp.turnOff();
        projector.turnOff();
    }
}
