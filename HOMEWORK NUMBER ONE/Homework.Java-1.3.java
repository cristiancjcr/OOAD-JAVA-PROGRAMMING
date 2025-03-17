// Homework.Java-1.3.

// clasa Persoana
class Persoana {
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

    // suprascriem mettoda toString(), pentru a returna atributele intr-un format personalizat
    @Override
    public String toString() {
        return String.format("Persoana { Nume: '%s', Varsta: %d, Oras: '%s' }", nume, varsta, oras);
    }
}

//clasa principala, ce contine metoda main()
public class Main {
    public static void main(String[] args) {
        //cream un obiect de tip persoana
        Persoana p = new Persoana("Alex", 30, "Bucuresti");

        //afisam obiectul
        System.out.println(p);
    }
}
