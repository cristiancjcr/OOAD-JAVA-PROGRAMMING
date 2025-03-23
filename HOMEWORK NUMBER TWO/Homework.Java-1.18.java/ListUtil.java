// ListUtil.java
import java.util.List;

public class ListUtil {
    // Metodă pentru adăugarea unui element în listă
    public static void addElement(List<Integer> numbers, Integer element) {
        numbers.add(element);
    }
    
    // Metodă pentru eliminarea unui element din listă
    public static void removeElement(List<Integer> numbers, Integer element) {
        numbers.remove(element);
    }
}
