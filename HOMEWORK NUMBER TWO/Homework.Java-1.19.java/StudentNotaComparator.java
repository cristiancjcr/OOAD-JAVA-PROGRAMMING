// StudentNotaComparator.java
import java.util.Comparator;

public class StudentNotaComparator implements Comparator<Student> {
    // Implementăm metoda compare pentru a compara studenții pe baza notei
    @Override
    public int compare(Student s1, Student s2) {
        // Comparăm nota celor doi studenți
        return Double.compare(s1.getNota(), s2.getNota());
    }
}
