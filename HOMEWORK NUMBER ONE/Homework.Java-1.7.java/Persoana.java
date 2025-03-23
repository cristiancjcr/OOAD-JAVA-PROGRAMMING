// Clasa Persoana (superclasa)
public class Persoana {
    protected String nume;
    protected String prenume;
    protected Adresa adresa;

    public Persoana(String nume, String prenume, Adresa adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + ", adresa: " + adresa;
    }
}
