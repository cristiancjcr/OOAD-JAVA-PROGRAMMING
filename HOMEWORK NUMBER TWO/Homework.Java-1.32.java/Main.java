// Main.java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de stringuri
        List<String> lista = Arrays.asList("apple", "banana", "avocado", "orange", "apricot", "grape");

        // Procesăm lista folosind metoda din ListProcessor
        System.out.println("Rezultatul sortat crescător:");
        List<String> rezultatCrescator = ListProcessor.proceseazaLista(lista);
        rezultatCrescator.forEach(System.out::println);

        // Procesăm lista pentru sortare descrescătoare
        System.out.println("\nRezultatul sortat descrescător:");
        List<String> rezultatDescrescator = ListProcessor.proceseazaListaDescrescator(lista);
        rezultatDescrescator.forEach(System.out::println);
    }
}
