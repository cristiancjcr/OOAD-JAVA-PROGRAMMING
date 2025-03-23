// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de studenți
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Ana", 9.5));
        studenti.add(new Student("Ion", 7.3));
        studenti.add(new Student("Maria", 8.2));
        studenti.add(new Student("Andrei", 10.0));

        // Afișăm lista înainte de sortare
        System.out.println("Lista înainte de sortare:");
        DisplayList.display(studenti);

        // Sortăm lista
        SortList.sort(studenti);

        // Afișăm lista după sortare
        System.out.println("\nLista după sortare (după nota):");
        DisplayList.display(studenti);
    }
}
