// SortList.java
import java.util.Collections;
import java.util.List;

public class SortList {
    // Metodă pentru sortarea listei de studenți
    public static void sort(List<Student> studenti) {
        // Sortăm lista folosind StudentNotaComparator
        Collections.sort(studenti, new StudentNotaComparator());
    }
}
