import java.util.ArrayList;
import java.util.List;

// Clasa Main (punctul de pornire al aplicației)
public class Main {
    public static void main(String[] args) {
        // Creare adrese
        Adresa adresa1 = new Adresa("Str. Unirii", "București", "010101");
        Adresa adresa2 = new Adresa("Str. Libertății", "Cluj-Napoca", "400000");

        // Creare profesor
        Profesor profesor1 = new Profesor("Popescu", "Ion", adresa1, "Matematică");

        // Creare studenți
        Student student1 = new Student("Ionescu", "Maria", adresa1, "S1234");
        Student student2 = new Student("Georgescu", "Andrei", adresa2, "S5678");

        // Creare curs și adăugare studenți
        Curs curs = new Curs("Algebră", profesor1);
        curs.addStudentToCourse(student1);
        curs.addStudentToCourse(student2);

        // Afișare detalii curs
        System.out.println(curs);

        // Schimbare adresă profesor
        Utils.changeTeacherAddress(profesor1, new Adresa("Str. Academiei", "București", "020202"));
        System.out.println("Noua adresă profesor: " + profesor1);

        // Ștergere profesor de la curs
        curs.removeTeacherFromCourse();
        System.out.println("După eliminarea profesorului: " + curs);

        // Creare curs nou dintr-o listă de studenți și un profesor
        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(student1);
        listaStudenti.add(student2);

        Curs cursNou = Curs.createNewCourse("Geometrie", profesor1, listaStudenti);
        System.out.println("Curs nou creat: " + cursNou);
    }
}
