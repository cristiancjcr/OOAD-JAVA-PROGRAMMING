public class Sfera extends Shape3D {
    private double raza;

    public Sfera(String culoare, double raza) {
        super(culoare);
        this.raza = raza;
    }

    @Override
    public double getPerimetru() {
        return 0; // nu are sens pentru 3D
    }

    @Override
    public double getAria() {
        return 4 * Math.PI * raza * raza;
    }

    @Override
    public double getVolum() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raza, 3);
    }
}
