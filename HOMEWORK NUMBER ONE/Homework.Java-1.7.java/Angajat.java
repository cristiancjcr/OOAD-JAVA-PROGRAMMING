// Clasa Angajat (extinde Persoana)
public class Angajat extends Persoana {
    private String pozitie;
    private Companie companie;

    public Angajat(String nume, String prenume, Adresa adresa, String pozitie, Companie companie) {
        super(nume, prenume, adresa);
        this.pozitie = pozitie;
        this.companie = companie;
    }

    public void moveEmployeeToAnotherCompany(Companie companieNoua) {
        this.companie.removeEmployeeFromCompany(this);
        this.companie = companieNoua;
        companieNoua.addEmployeeToCompany(this);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + ", pozitie: " + pozitie + ", companie: " + companie.getNumeCompanie() + ", adresa: " + adresa;
    }
}
