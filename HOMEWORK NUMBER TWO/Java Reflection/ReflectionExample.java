// ReflectionExample.java
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Creăm o instanță a clasei Person
            Class<?> personClass = Class.forName("Person");  // Obținem referința clasei Person
            Object person = personClass.getConstructor(String.class, int.class).newInstance("John", 30); // Instanțiem un obiect Person

            // Obținem și afișăm toate câmpurile (fields)
            System.out.println("Câmpurile clasei:");
            Field[] fields = personClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Nume câmp: " + field.getName() + ", Tip: " + field.getType());
            }

            // Obținem și invocăm metoda 'introduce' folosind Reflection
            System.out.println("\nInvocăm metoda 'introduce':");
            Method introduceMethod = personClass.getMethod("introduce"); // Obținem metoda introduce
            introduceMethod.invoke(person); // Invocăm metoda pe obiectul person

            // Modificăm un câmp folosind Reflection (setăm numele)
            System.out.println("\nModificăm numele folosind Reflection:");
            Field nameField = personClass.getDeclaredField("name"); // Obținem câmpul 'name'
            nameField.setAccessible(true);  // Permitem accesul la câmpuri private
            nameField.set(person, "Alice"); // Setăm noul nume
            System.out.println("Numele modificat: " + nameField.get(person)); // Afișăm numele modificat

            // Obținem și apelăm metodele getter pentru name și age
            Method getNameMethod = personClass.getMethod("getName");
            Method getAgeMethod = personClass.getMethod("getAge");

            System.out.println("\nNume obținut prin getter: " + getNameMethod.invoke(person));
            System.out.println("Vârstă obținută prin getter: " + getAgeMethod.invoke(person));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
