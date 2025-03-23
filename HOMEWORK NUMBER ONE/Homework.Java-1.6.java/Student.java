// Clasa Student (extinde Persoana)
public class Student extends Persoana {
    private String nrMatricol;

    public Student(String nume, String prenume, Adresa adresa, String nrMatricol) {
        super(nume, prenume, adresa);
        this.nrMatricol = nrMatricol;
    }

    @Override
    public String toString() {
        return "Student: " + nume + " " + prenume + ", nr. matricol: " + nrMatricol + ", adresa: " + adresa;
    }
}
