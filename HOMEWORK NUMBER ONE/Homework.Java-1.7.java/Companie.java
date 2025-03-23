import java.util.ArrayList;
import java.util.List;

// Clasa Companie
public class Companie {
    private String numeCompanie;
    private List<Angajat> angajati;

    public Companie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
        this.angajati = new ArrayList<>();
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void addEmployeeToCompany(Angajat angajat) {
        angajati.add(angajat);
    }

    public void removeEmployeeFromCompany(Angajat angajat) {
        angajati.remove(angajat);
    }

    public List<Angajat> findEmployeesByAddress(Adresa adresa) {
        List<Angajat> angajatiCuAdresa = new ArrayList<>();
        for (Angajat angajat : angajati) {
            if (angajat.adresa.equals(adresa)) {
                angajatiCuAdresa.add(angajat);
            }
        }
        return angajatiCuAdresa;
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public static Companie findCompanyByName(List<Companie> companii, String nume) {
        for (Companie companie : companii) {
            if (companie.getNumeCompanie().equals(nume)) {
                return companie;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Companie: " + numeCompanie;
    }
}
