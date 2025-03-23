// Clasa Utils pentru modificarea adreselor
public class Utils {
    public static void changeTeacherAddress(Profesor profesor, Adresa nouaAdresa) {
        profesor.setAdresa(nouaAdresa);
    }

    public static void changeStudentAddress(Student student, Adresa nouaAdresa) {
        student.setAdresa(nouaAdresa);
    }
}
