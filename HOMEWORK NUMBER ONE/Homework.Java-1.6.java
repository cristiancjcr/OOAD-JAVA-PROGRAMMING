// Homework.Java-1.6.

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

    public void setStrada(String strada) { this.strada = strada; }
    public void setOras(String oras) { this.oras = oras; }
    public void setCodPostal(String codPostal) { this.codPostal = codPostal; }

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

// clasa profesor (extinde persoana)
class Profesor extends Persoana {
    private String materiePredare;

    public Profesor(String nume, String prenume, Adresa adresa, String materiePredare) {
        super(nume, prenume, adresa);
        this.materiePredare = materiePredare;
    }

    @Override
    public String toString() {
        return "profesor: " + nume + " " + prenume + ", materie: " + materiePredare + ", adresa: " + adresa;
    }
}

// clasa student (extinde persoana)
class Student extends Persoana {
    private String nrMatricol;

    public Student(String nume, String prenume, Adresa adresa, String nrMatricol) {
        super(nume, prenume, adresa);
        this.nrMatricol = nrMatricol;
    }

    @Override
    public String toString() {
        return "student: " + nume + " " + prenume + ", nr. matricol: " + nrMatricol + ", adresa: " + adresa;
    }
}

// clasa curs
class Curs {
    private String numeCurs;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    public void addStudentToCourse(Student student) {
        studenti.add(student);
    }

    public void removeStudentFromCourse(Student student) {
        studenti.remove(student);
    }

    public void addTeacherToCourse(Profesor profesor) {
        this.profesor = profesor;
    }

    public void removeTeacherFromCourse() {
        this.profesor = null;
    }

    public static Curs createNewCourse(String numeCurs, Profesor profesor, List<Student> studenti) {
        Curs cursNou = new Curs(numeCurs, profesor);
        cursNou.studenti.addAll(studenti);
        return cursNou;
    }

    @Override
    public String toString() {
        return "curs: " + numeCurs + ", profesor: " + (profesor != null ? profesor.nume + " " + profesor.prenume : "n/a") +
                ", nr. studenti: " + studenti.size();
    }
}

// metode pentru schimbarea adreselor
class Utils {
    public static void changeTeacherAddress(Profesor profesor, Adresa nouaAdresa) {
        profesor.setAdresa(nouaAdresa);
    }

    public static void changeStudentAddress(Student student, Adresa nouaAdresa) {
        student.setAdresa(nouaAdresa);
    }
}

// clasa main (punctul de pornire al aplicatiei)
public class Main {
    public static void main(String[] args) {
        // creare adrese
        Adresa adresa1 = new Adresa("str. unirii", "bucuresti", "010101");
        Adresa adresa2 = new Adresa("str. libertatii", "cluj-napoca", "400000");

        // creare profesor
        Profesor profesor1 = new Profesor("popescu", "ion", adresa1, "matematica");

        // creare studenti
        Student student1 = new Student("ionescu", "maria", adresa1, "s1234");
        Student student2 = new Student("georgescu", "andrei", adresa2, "s5678");

        // creare curs si adaugare studenti
        Curs curs = new Curs("algebra", profesor1);
        curs.addStudentToCourse(student1);
        curs.addStudentToCourse(student2);

        // afisare detalii curs
        System.out.println(curs);

        // schimbare adresa profesor
        Utils.changeTeacherAddress(profesor1, new Adresa("str. academiei", "bucuresti", "020202"));
        System.out.println("noua adresa profesor: " + profesor1);

        // stergere profesor de la curs
        curs.removeTeacherFromCourse();
        System.out.println("dupa eliminarea profesorului: " + curs);

        // creare curs nou dintr-o lista de studenti si un profesor
        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(student1);
        listaStudenti.add(student2);

        Curs cursNou = Curs.createNewCourse("geometrie", profesor1, listaStudenti);
        System.out.println("curs nou creat: " + cursNou);
    }
}
