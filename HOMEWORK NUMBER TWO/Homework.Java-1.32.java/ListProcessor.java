// ListProcessor.java
import java.util.List;
import java.util.stream.Collectors;

public class ListProcessor {

    // Metoda care procesează lista conform cerințelor
    public static List<String> proceseazaLista(List<String> lista) {
        return lista.stream() // Creăm stream-ul
            .filter(s -> s.startsWith("a")) // Filtrăm string-urile care încep cu "a"
            .map(String::toUpperCase) // Transformăm fiecare string în uppercase
            .sorted() // Sortăm lista în ordine crescătoare
            .collect(Collectors.toList()); // Colectăm rezultatul într-o listă
    }

    // Metoda pentru sortare descrescătoare
    public static List<String> proceseazaListaDescrescator(List<String> lista) {
        return lista.stream() // Creăm stream-ul
            .filter(s -> s.startsWith("a")) // Filtrăm string-urile care încep cu "a"
            .map(String::toUpperCase) // Transformăm fiecare string în uppercase
            .sorted((s1, s2) -> s2.compareTo(s1)) // Sortează în ordine descrescătoare
            .collect(Collectors.toList()); // Colectăm rezultatul într-o listă
    }
}
