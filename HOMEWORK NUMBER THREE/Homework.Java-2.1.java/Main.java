public class Main {
    public static void main(String[] args) {
        // Obținem instanța Singleton a clasei Config
        Config config = Config.getInstance();

        // Afișăm valorile citite din fișierul JSON
        System.out.println("Color: " + config.getColor());
        System.out.println("Weight: " + config.getWeight());
    }
}
