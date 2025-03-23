public class Cerc extends Shape2D {
    private double raza;

    public Cerc(String culoare, double raza) {
        super(culoare);
        this.raza = raza;
    }

    @Override
    public double getPerimetru() {
        return 2 * Math.PI * raza;
    }

    @Override
    public double getAria() {
        return Math.PI * raza * raza;
    }
}
