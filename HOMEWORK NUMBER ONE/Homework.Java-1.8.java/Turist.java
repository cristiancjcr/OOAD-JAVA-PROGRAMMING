// Clasa Turist (extinde Persoana)
public class Turist extends Persoana {
    private Hotel hotel;

    public Turist(String nume, String prenume, Adresa adresa, Hotel hotel) {
        super(nume, prenume, adresa);
        this.hotel = hotel;
        hotel.adaugaTurist(this);
    }

    public void mutaLaAltHotel(Hotel noulHotel) {
        if (this.hotel != null) {
            this.hotel.eliminaTurist(this);  // Elimină turistul din hotelul curent
        }
        this.hotel = noulHotel;
        noulHotel.adaugaTurist(this);  // Adaugă turistul în noul hotel
    }

    @Override
    public String toString() {
        return super.toString() + ", Hotel: " + hotel.getNume();
    }
}
