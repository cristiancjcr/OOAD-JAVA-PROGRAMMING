// Clasa Persoana (superclasă pentru Turist)
public class Persoana {
    private String nume;
    private String prenume;
    private Adresa adresa;

    public Persoana(String nume, String prenume, Adresa adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public void schimbaAdresa(Adresa adresaNoua) {
        this.adresa = adresaNoua;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + ", Adresa: " + adresa;
    }
}
