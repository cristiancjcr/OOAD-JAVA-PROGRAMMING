import java.util.ArrayList;
import java.util.List;

// Clasa Hotel
public class Hotel {
    private String nume;
    private Adresa adresa;
    private Oras oras;
    private List<Turist> turisti;

    public Hotel(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = adresa.getOras();
        this.turisti = new ArrayList<>();
        oras.adaugaHotel(this); // Adaugă hotelul în lista orașului
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public Oras getOras() {
        return oras;
    }

    public void adaugaTurist(Turist turist) {
        turisti.add(turist);
    }

    public void eliminaTurist(Turist turist) {
        turisti.remove(turist);
    }

    public List<Turist> getToateTuristii() {
        return turisti;
    }

    @Override
    public String toString() {
        return nume + " situat la " + adresa;
    }
}
