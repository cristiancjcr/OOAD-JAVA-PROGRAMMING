public class C3Nr {
    private double num1;
    private double num2;
    private double num3;

    // Constructor care primește trei numere
    public C3Nr(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    // Metodă pentru calcularea sumei celor trei numere
    public double suma() {
        return num1 + num2 + num3;
    }
}
