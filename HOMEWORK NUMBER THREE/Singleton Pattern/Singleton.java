// Fișier: Singleton.java
public class Singleton {
    private static volatile Singleton instance;

    // Constructor privat pentru a preveni instanțierea externă
    private Singleton() {}

    // Metodă statică pentru obținerea instanței unice
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Metodă pentru afișarea unui mesaj
    public void showMessage() {
        System.out.println("Salut din Singleton!");
    }
}
