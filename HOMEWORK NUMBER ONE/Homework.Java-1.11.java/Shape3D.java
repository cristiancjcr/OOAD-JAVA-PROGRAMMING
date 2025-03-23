public abstract class Shape3D implements Shape {
    protected String culoare;

    public Shape3D(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    public abstract double getVolum();
    public abstract double getAria();
}
