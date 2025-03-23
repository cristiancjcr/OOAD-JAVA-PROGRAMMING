import java.util.List;

// Clasa Main (punctul de pornire al aplicației)
public class Main {
    public static void main(String[] args) {
        // Creare orașe
        Oras oras1 = new Oras("București");
        Oras oras2 = new Oras("Cluj-Napoca");

        // Creare adrese
        Adresa adresa1 = new Adresa("Strada Victoriei 1", "010123", oras1);
        Adresa adresa2 = new Adresa("Strada Libertății 2", "400200", oras2);

        // Creare hoteluri
        Hotel hotel1 = new Hotel("Hotel A", adresa1);
        Hotel hotel2 = new Hotel("Hotel B", adresa2);

        // Creare turiști
        Turist turist1 = new Turist("Ion", "Popescu", adresa1, hotel1);
        Turist turist2 = new Turist("Maria", "Ionescu", adresa2, hotel2);
        
        // Schimbare adresă pentru un turist
        turist1.schimbaAdresa(new Adresa("Strada Unirii 3", "010101", oras1));

        // Mutare turist la alt hotel
        turist2.mutaLaAltHotel(hotel1);

        // Afișare hoteluri dintr-un oraș
        System.out.println("Hoteluri în " + oras1.getNume() + ":");
        for (Hotel hotel : oras1.getHoteluri()) {
            System.out.println(hotel);
        }

        // Afișare turiști în hotelurile unui oraș
        System.out.println("\nTuriști în hoteluri din " + oras1.getNume() + ":");
        for (Turist turist : oras1.getTuristiDinHoteluri()) {
            System.out.println(turist);
        }

        // Verificare dacă un turist este cazat într-un hotel dintr-un oraș
        boolean gasit = false;
        for (Hotel hotel : oras1.getHoteluri()) {
            if (hotel.getToateTuristii().contains(turist1)) {
                gasit = true;
                break;
            }
        }
        System.out.println("\nEste " + turist1 + " cazat în vreun hotel din " + oras1.getNume() + "? " + (gasit ? "Da" : "Nu"));

        // Afișare toate persoanele și turiștii
        System.out.println("\nToate persoanele și turiștii:");
        System.out.println(turist1);
        System.out.println(turist2);
    }
}
