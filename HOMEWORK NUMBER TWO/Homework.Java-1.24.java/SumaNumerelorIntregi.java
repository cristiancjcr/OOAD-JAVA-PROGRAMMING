// SumaNumerelorIntregi.java
public class SumaNumerelorIntregi {

    // Metodă pentru calcularea sumei numerelor întregi
    public static int calculeazaSumaIntregi(String[] linii) {
        int suma = 0;

        // Parcurgem fiecare linie și încercăm să o convertim într-un număr întreg
        for (String linie : linii) {
            try {
                suma += Integer.parseInt(linie.trim());
            } catch (NumberFormatException e) {
                // Dacă linia nu este un număr întreg valid, o ignorăm
            }
        }

        return suma;
    }
}
