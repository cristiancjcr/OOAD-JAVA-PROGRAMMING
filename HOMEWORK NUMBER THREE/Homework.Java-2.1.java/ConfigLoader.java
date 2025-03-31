import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ConfigLoader {
    private static final String CONFIG_FILE = "config.json"; // Numele fișierului JSON
    private String color;
    private int weight;

    // Constructor care apelează metoda de încărcare a datelor
    public ConfigLoader() {
        loadConfig();
    }

    // Metodă privată pentru citirea fișierului JSON
    private void loadConfig() {
        ObjectMapper objectMapper = new ObjectMapper(); // Obiect pentru citirea JSON-ului
        try {
            JsonNode rootNode = objectMapper.readTree(new File(CONFIG_FILE)); // Citește fișierul
            this.color = rootNode.get("color").asText(); // Extrage culoarea
            this.weight = rootNode.get("weight").asInt(); // Extrage greutatea
        } catch (IOException e) {
            throw new RuntimeException("Failed to read configuration file", e); // Aruncă excepție dacă fișierul nu este găsit sau conține erori
        }
    }

    // Getteri pentru accesarea datelor din JSON
    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
