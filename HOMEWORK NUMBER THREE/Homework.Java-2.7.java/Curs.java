import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curs {
    private List<Student> studenti; // Lista de studenți înscriși
    private Random random;          // Obiect pentru a genera valori random

    // Constructor pentru a inițializa lista de studenți
    public Curs() {
        studenti = new ArrayList<>();
        random = new Random();
    }

    // Metodă pentru a adăuga un student la curs
    public void inscrieStudent(Student student) {
        studenti.add(student);
    }

    // Metodă care simulează prezența studenților la curs
    public void prezenta() {
        for (Student student : studenti) {
            // Generăm aleatoriu un număr între 0 și 1 pentru a decide status-ul (0 = absent, 1 = prezent)
            boolean estePrezent = random.nextBoolean();
            String status = estePrezent ? "Prezent" : "Absent";
            System.out.println(student.getNume() + " - " + status);
        }
    }
}
