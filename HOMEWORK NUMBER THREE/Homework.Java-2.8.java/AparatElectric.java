public class AparatElectric {
    private String nume;

    // Constructor pentru crearea unui aparat electric cu nume
    public AparatElectric(String nume) {
        this.nume = nume;
    }

    // Getter pentru numele aparatului
    public String getNume() {
        return nume;
    }

    // Metodă pentru a simula conectarea aparatului la curent
    public void conecteazaLaCurent() {
        System.out.println(nume + " a fost conectat la curent.");
    }

    // Metodă pentru a simula deconectarea aparatului de la curent
    public void deconecteazaDeLaCurent() {
        System.out.println(nume + " a fost deconectat de la curent.");
    }
}
