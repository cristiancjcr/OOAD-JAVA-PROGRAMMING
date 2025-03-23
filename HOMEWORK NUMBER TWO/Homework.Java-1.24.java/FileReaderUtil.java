// FileReaderUtil.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    // Metodă pentru citirea unui fișier și returnarea liniilor
    public static String[] citesteFisier(String caleaFisierului) throws IOException {
        BufferedReader reader = null;
        StringBuilder continut = new StringBuilder();
        
        try {
            reader = new BufferedReader(new FileReader(caleaFisierului));
            String linie;
            while ((linie = reader.readLine()) != null) {
                continut.append(linie).append("\n");
            }
        } catch (IOException e) {
            throw new IOException("Eroare la citirea fișierului: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

        // Împărțim conținutul în linii și le returnăm
        return continut.toString().split("\n");
    }
}
