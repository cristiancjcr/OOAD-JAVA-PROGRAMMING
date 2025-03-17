// Homework.Java-1.8.

import java.util.ArrayList;
import java.util.List;

// clasa adresa
class Adresa {
    private String strada;
    private String codPostal;
    private Oras oras;

    public Adresa(String strada, String codPostal, Oras oras) {
        this.strada = strada;
        this.codPostal = codPostal;
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public Oras getOras() {
        return oras;
    }

    @Override
    public String toString() {
        return strada + ", " + codPostal + ", " + oras.getNume();
    }
}

// clasa oras
class Oras {
    private String nume;
    private List<Hotel> hoteluri;

    public Oras(String nume) {
        this.nume = nume;
        this.hoteluri = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void adaugaHotel(Hotel hotel) {
        hoteluri.add(hotel);
    }

    public List<Hotel> getHoteluri() {
        return hoteluri;
    }

    public List<Turist> getTuristiDinHoteluri() {
        List<Turist> turisti = new ArrayList<>();
        for (Hotel hotel : hoteluri) {
            turisti.addAll(hotel.getToateTuristii());
        }
        return turisti;
    }

    @Override
    public String toString() {
        return nume;
    }
}

// clasa hotel
class Hotel {
    private String nume;
    private Adresa adresa;
    private Oras oras;
    private List<Turist> turisti;

    public Hotel(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = adresa.getOras();
        this.turisti = new ArrayList<>();
        oras.adaugaHotel(this);  // adauga hotelul in lista de hoteluri a orasului
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public Oras getOras() {
        return oras;
    }

    public void adaugaTurist(Turist turist) {
        turisti.add(turist);
    }

    public void eliminaTurist(Turist turist) {
        turisti.remove(turist);
    }

    public List<Turist> getToateTuristii() {
        return turisti;
    }

    @Override
    public String toString() {
        return nume + " situat la " + adresa;
    }
}

// clasa persoana (superclasa pentru turist)
class Persoana {
    private String nume;
    private String prenume;
    private Adresa adresa;

    public Persoana(String nume, String prenume, Adresa adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public void schimbaAdresa(Adresa adresaNoua) {
        this.adresa = adresaNoua;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + ", Adresa: " + adresa;
    }
}

// clasa turist (extinde persoana)
class Turist extends Persoana {
    private Hotel hotel;

    public Turist(String nume, String prenume, Adresa adresa, Hotel hotel) {
        super(nume, prenume, adresa);
        this.hotel = hotel;
        hotel.adaugaTurist(this);
    }

    public void mutaLaAltHotel(Hotel noulHotel) {
        if (this.hotel != null) {
            this.hotel.eliminaTurist(this);  // elimina turistul de la hotelul curent
        }
        this.hotel = noulHotel;
        noulHotel.adaugaTurist(this);  // adauga turistul la noul hotel
    }

    @Override
    public String toString() {
        return super.toString() + ", Hotel: " + hotel.getNume();
    }
}

// clasa main
public class Main {
    public static void main(String[] args) {
        // creare orase
        Oras oras1 = new Oras("Bucuresti");
        Oras oras2 = new Oras("Cluj-Napoca");

        // creare adrese
        Adresa adresa1 = new Adresa("Strada Victoriei 1", "010123", oras1);
        Adresa adresa2 = new Adresa("Strada Libertatii 2", "400200", oras2);

        // creare hoteluri
        Hotel hotel1 = new Hotel("Hotel A", adresa1);
        Hotel hotel2 = new Hotel("Hotel B", adresa2);

        // creare turisti
        Turist turist1 = new Turist("Ion", "Popescu", adresa1, hotel1);
        Turist turist2 = new Turist("Maria", "Ionescu", adresa2, hotel2);
        
        // schimbare adresa pentru un turist
        turist1.schimbaAdresa(new Adresa("Strada Unirii 3", "010101", oras1));

        // mutare turist la alt hotel
        turist2.mutaLaAltHotel(hotel1);

        // afisare hoteluri dintr-un oras
        System.out.println("Hoteluri in " + oras1.getNume() + ":");
        for (Hotel hotel : oras1.getHoteluri()) {
            System.out.println(hotel);
        }

        // afisare turisti in hoteluri dintr-un oras
        System.out.println("\nTuristi in hoteluri din " + oras1.getNume() + ":");
        for (Turist turist : oras1.getTuristiDinHoteluri()) {
            System.out.println(turist);
        }

        // verificare daca o persoana este cazata intr-un hotel dintr-un oras
        boolean gasit = false;
        for (Hotel hotel : oras1.getHoteluri()) {
            if (hotel.getToateTuristii().contains(turist1)) {
                gasit = true;
                break;
            }
        }
        System.out.println("\nEste " + turist1.toString() + " cazat in vreun hotel din " + oras1.getNume() + "? " + (gasit ? "Da" : "Nu"));

        // afisare toate persoanele si turistii
        System.out.println("\nToate persoanele si turistii:");
        System.out.println(turist1);
        System.out.println(turist2);
    }
}
