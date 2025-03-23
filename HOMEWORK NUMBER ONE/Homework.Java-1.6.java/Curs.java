import java.util.ArrayList;
import java.util.List;

// Clasa Curs
public class Curs {
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
        return "Curs: " + numeCurs + ", Profesor: " + (profesor != null ? profesor.nume + " " + profesor.prenume : "n/a") +
                ", Nr. Studenti: " + studenti.size();
    }
}
