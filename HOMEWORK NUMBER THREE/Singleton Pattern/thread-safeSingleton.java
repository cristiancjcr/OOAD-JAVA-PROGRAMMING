public class Singleton {
    // Instanță privată statică, marcată cu 'volatile' pentru a evita probleme de caching
    private static volatile Singleton instance;

    // Constructor privat pentru a preveni crearea instanței din exteriorul clasei
    private Singleton() {}

    // Metodă statică pentru obținerea instanței Singleton
    public static Singleton getInstance() {
        // Prima verificare - evităm blocarea sincronizată inutilă
        if (instance == null) {
            // Sincronizare pentru a asigura că doar un singur thread poate crea instanța
            synchronized (Singleton.class) {
                // A doua verificare - în cazul în care două thread-uri au trecut prima verificare
                if (instance == null) {
                    instance = new Singleton(); // Crearea instanței Singleton
                }
            }
        }
        return instance; // Returnează instanța unică
    }

    // Metodă pentru a afișa un mesaj
    public void showMessage() {
        System.out.println("Salut din Singleton!");
    }
}
