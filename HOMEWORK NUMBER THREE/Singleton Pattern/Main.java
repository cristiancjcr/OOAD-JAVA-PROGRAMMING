// Fișier: Main.java
public class Main {
    public static void main(String[] args) {
        // Obținem instanța Singleton
        Singleton singleton = Singleton.getInstance();
        
        // Apelăm metoda showMessage()
        singleton.showMessage();
    }
}
