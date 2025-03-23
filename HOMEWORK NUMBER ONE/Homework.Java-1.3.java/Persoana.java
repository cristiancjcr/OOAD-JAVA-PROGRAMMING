// clasa Persoana
public class Persoana {
    // atribute private clasa
    private String nume;
    private int varsta;
    private String oras;

    // constructor pentru initializarea obiectului
    public Persoana(String nume, int varsta, String oras) {
        this.nume = nume;
        this.varsta = varsta;
        this.oras = oras;
    }

    // suprascriem metoda toString(), pentru a returna atributele intr-un format personalizat
    @Override
    public String toString() {
        return String.format("Persoana { Nume: '%s', Varsta: %d, Oras: '%s' }", nume, varsta, oras);
    }
}
