public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor pentru a crea un număr complex
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter pentru partea reală
    public double getReal() {
        return real;
    }

    // Getter pentru partea imaginară
    public double getImaginary() {
        return imaginary;
    }

    // Metodă pentru calcularea modulului numărului complex (|z|)
    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Suprascrierea metodei toString() pentru a afișa numărul complex
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
