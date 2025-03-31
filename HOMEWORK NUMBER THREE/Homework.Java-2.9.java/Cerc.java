public class Cerc implements Forma {
    private float raza;

    // Constructor pentru Cerc
    public Cerc(float raza) {
        this.raza = raza;
    }

    // Metodă pentru calculul ariei Cercului
    @Override
    public float calculeazaAria() {
        return (float) Math.PI * raza * raza;
    }
}
