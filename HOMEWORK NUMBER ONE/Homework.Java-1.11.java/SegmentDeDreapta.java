public class SegmentDeDreapta implements Shape {
    private String culoare;
    private double lungime;

    public SegmentDeDreapta(String culoare, double lungime) {
        this.culoare = culoare;
        this.lungime = lungime;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    @Override
    public double getPerimetru() {
        return lungime;
    }

    public double getLungime() {
        return lungime;
    }
}

