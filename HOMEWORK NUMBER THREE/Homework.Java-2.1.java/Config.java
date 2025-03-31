public class Config {
    private static Config instance; // Instanța unică a clasei (Singleton)
    private String color;
    private int weight;

    // Constructor privat pentru a preveni instanțierea directă
    private Config() {
        ConfigLoader loader = new ConfigLoader(); // Creează un obiect pentru încărcarea configurației
        this.color = loader.getColor();
        this.weight = loader.getWeight();
    }

    // Metodă statică pentru obținerea instanței unice
    public static Config getInstance() {
        if (instance == null) { // Verifică dacă instanța nu a fost creată
            synchronized (Config.class) { // Asigură thread-safety
                if (instance == null) {
                    instance = new Config(); // Creează instanța
                }
            }
        }
        return instance; // Returnează instanța unică
    }

    // Metode publice pentru a obține valorile configurației
    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
