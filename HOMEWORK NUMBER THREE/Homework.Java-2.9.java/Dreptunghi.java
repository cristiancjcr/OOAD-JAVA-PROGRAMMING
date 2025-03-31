public class Dreptunghi implements Forma {
    private float latime;
    private float inaltime;

    // Constructor pentru Dreptunghi
    public Dreptunghi(float latime, float inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }

    // Metodă pentru calculul ariei Dreptunghiului
    @Override
    public float calculeazaAria() {
        return latime * inaltime;
    }
}
