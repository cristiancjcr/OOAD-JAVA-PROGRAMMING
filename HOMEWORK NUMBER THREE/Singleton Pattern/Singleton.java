// Fișier: Singleton.java
// implementare simplă de 'Singleton' (lazy initialization)

public class Singleton {
    private static Singleton instance; // Instanța unică

    private Singleton() {} // Constructor privat

    public static Singleton getInstance() {
        if (instance == null) { // Lazy initialization
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Salut din Singleton!");
    }
}

// lazy initialization
