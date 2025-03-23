// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de numere întregi
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Afișăm lista înainte de sortare
        DisplayList.display(numbers);

        // Sortăm lista
        SortList.sort(numbers);

        // Afișăm lista după sortare
        DisplayList.display(numbers);
    }
}
