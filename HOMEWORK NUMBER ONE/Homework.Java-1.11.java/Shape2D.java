public abstract class Shape2D implements Shape {
    protected String culoare;

    public Shape2D(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    public abstract double getAria();
}
