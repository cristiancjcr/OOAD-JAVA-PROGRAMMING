import java.util.ArrayList;
import java.util.List;

public class Prelungitor {
    private List<AparatElectric> aparate;  // Lista de aparate conectate la prelungitor

    // Constructor pentru a inițializa lista de aparate
    public Prelungitor() {
        aparate = new ArrayList<>();
    }

    // Metodă pentru a conecta un aparat electric la prelungitor
    public void conecteazaAparat(AparatElectric aparat) {
        aparate.add(aparat);
        aparat.conecteazaLaCurent();  // Mesaj de conectare
    }

    // Metodă pentru a deconecta un aparat electric de la prelungitor
    public void deconecteazaAparat(AparatElectric aparat) {
        if (aparate.contains(aparat)) {
            aparate.remove(aparat);
            aparat.deconecteazaDeLaCurent();  // Mesaj de deconectare
        } else {
            System.out.println(aparat.getNume() + " nu este conectat la prelungitor.");
        }
    }

    // Metodă pentru a deconecta toate aparatele
    public void deconecteazaToateAparatele() {
        for (AparatElectric aparat : aparate) {
            aparat.deconecteazaDeLaCurent();
        }
        aparate.clear();
    }
}
