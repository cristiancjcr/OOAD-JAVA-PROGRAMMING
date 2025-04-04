public class Produs {
    private int id;
    private String nume;
    private double pret; // Prețul în Lei

    public Produs(int id, String nume, double pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Produs{id=" + id + ", nume='" + nume + "', pret=" + pret + " RON}";
    }
}
