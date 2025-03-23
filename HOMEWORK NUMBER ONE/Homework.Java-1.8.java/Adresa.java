// Clasa Adresa
public class Adresa {
    private String strada;
    private String codPostal;
    private Oras oras;

    public Adresa(String strada, String codPostal, Oras oras) {
        this.strada = strada;
        this.codPostal = codPostal;
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public Oras getOras() {
        return oras;
    }

    @Override
    public String toString() {
        return strada + ", " + codPostal + ", " + oras.getNume();
    }
}
