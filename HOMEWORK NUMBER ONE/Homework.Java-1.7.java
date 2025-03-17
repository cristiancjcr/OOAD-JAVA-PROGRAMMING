// Homework.Java-1.7.

import java.util.ArrayList;
import java.util.List;

// clasa adresa
class Adresa {
    private String strada;
    private String oras;
    private String codPostal;

    public Adresa(String strada, String oras, String codPostal) {
        this.strada = strada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public String getStrada() {
        return strada;
    }

    public String getOras() {
        return oras;
    }

    public String getCodPostal() {
        return codPostal;
    }

    @Override
    public String toString() {
        return strada + ", " + oras + ", " + codPostal;
    }
}

// clasa persoana (superclasa)
class Persoana {
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

// clasa angajat (extinde persoana)
class Angajat extends Persoana {
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

// clasa companie
class Companie {
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
        return "companie: " + numeCompanie;
    }
}

// clasa main (punctul de pornire al aplicatiei)
public class Main {
    public static void main(String[] args) {
        // creare adrese
        Adresa adresa1 = new Adresa("strada victoriei", "bucuresti", "010123");
        Adresa adresa2 = new Adresa("strada libertatii", "cluj-napoca", "400200");

        // creare companii
        Companie companie1 = new Companie("compania a");
        Companie companie2 = new Companie("compania b");

        // creare angajati
        Angajat angajat1 = new Angajat("ion", "popescu", adresa1, "developer", companie1);
        Angajat angajat2 = new Angajat("maria", "ionescu", adresa2, "designer", companie1);
        Angajat angajat3 = new Angajat("andrei", "georgescu", adresa1, "manager", companie2);

        // adaugare angajati in companii
        companie1.addEmployeeToCompany(angajat1);
        companie1.addEmployeeToCompany(angajat2);
        companie2.addEmployeeToCompany(angajat3);

        // mutare angajat intr-o alta companie
        angajat1.moveEmployeeToAnotherCompany(companie2);

        // afisare angajati cu adresa data
        System.out.println("angajatii care au adresa " + adresa1 + ":");
        for (Angajat angajat : companie2.findEmployeesByAddress(adresa1)) {
            System.out.println(angajat);
        }

        // gasire companie dupa nume si afisare angajati
        Companie companieGasita = Companie.findCompanyByName(List.of(companie1, companie2), "compania a");
        if (companieGasita != null) {
            System.out.println("\nangajatii la " + companieGasita.getNumeCompanie() + ":");
            for (Angajat angajat : companieGasita.getAngajati()) {
                System.out.println(angajat);
            }
        }
    }
}
