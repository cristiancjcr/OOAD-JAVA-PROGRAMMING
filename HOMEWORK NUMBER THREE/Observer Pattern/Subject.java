// Fișier: Subject.java
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    // Adaugă un observer (abonat)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Șterge un observer (dezabonare)
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifică toți observerii despre o schimbare
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
