// DisplayList.java
import java.util.List;

public class DisplayList {
    // Metodă pentru afișarea listei de studenți
    public static void display(List<Student> studenti) {
        System.out.println("Lista studenților:");
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}
