// Clasa Profesor (extinde Persoana)
public class Profesor extends Persoana {
    private String materiePredare;

    public Profesor(String nume, String prenume, Adresa adresa, String materiePredare) {
        super(nume, prenume, adresa);
        this.materiePredare = materiePredare;
    }

    @Override
    public String toString() {
        return "Profesor: " + nume + " " + prenume + ", materie: " + materiePredare + ", adresa: " + adresa;
    }
}
