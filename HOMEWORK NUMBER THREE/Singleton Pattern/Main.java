// Fișier: Main.java
public class Main {
    public static void main(String[] args) {
        // Obținem instanța Singleton
        Singleton singleton = Singleton.getInstance();
        // Apelăm metoda showMessage()
        singleton.showMessage();
    }
}


// problema : nu este thread-safe – două thread-uri pot crea instanțe diferite.
//  soluție: 'Synchronized Singleton' sau 'Enum Singleton'

// lazy initialization
