import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {
    private static WebHelper instance;
    private String websiteContent;
    private static final String URL_STRING = "https://example.com"; // URL hardcodat al paginii web

    // Constructor privat pentru a preveni instanțierea directă
    private WebHelper() {
        websiteContent = null; // Inițial, conținutul nu este încărcat
    }

    // Metoda pentru obținerea instanței unice (Singleton Pattern)
    public static WebHelper getInstance() {
        if (instance == null) {
            synchronized (WebHelper.class) {
                if (instance == null) {
                    instance = new WebHelper();
                }
            }
        }
        return instance;
    }

    // Metodă pentru obținerea conținutului paginii web
    public String getWebSiteContent() {
        if (websiteContent == null) {  // Dacă conținutul nu a fost încărcat
            websiteContent = loadWebsiteContent();  // Încărcăm conținutul
        }
        return websiteContent;  // Returnăm conținutul încărcat
    }

    // Metodă privată care efectuează cererea HTTP și încarcă conținutul paginii
    private String loadWebsiteContent() {
        StringBuilder content = new StringBuilder();
        try {
            // Crearea obiectului URL
            URL url = new URL(URL_STRING);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");  // Setăm metoda GET pentru cererea HTTP
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Citirea conținutului paginii
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();  // Returnăm conținutul ca un string
    }
}
