public class Patrat extends Shape2D {
    private double latura;

    public Patrat(String culoare, double latura) {
        super(culoare);
        this.latura = latura;
    }

    @Override
    public double getPerimetru() {
        return 4 * latura;
    }

    @Override
    public double getAria() {
        return latura * latura;
    }
}
