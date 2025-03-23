public class Cub extends Shape3D {
    private double latura;

    public Cub(String culoare, double latura) {
        super(culoare);
        this.latura = latura;
    }

    @Override
    public double getPerimetru() {
        return 0; // nu are sens pentru 3D
    }

    @Override
    public double getAria() {
        return 6 * latura * latura;
    }

    @Override
    public double getVolum() {
        return Math.pow(latura, 3);
    }
}
