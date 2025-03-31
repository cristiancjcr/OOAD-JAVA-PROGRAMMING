public class Main {
    public static void main(String[] args) {
        // Exemplu de utilizare a adapterului de la Double la ComplexNumber
        double realValue = 5.0;
        ComplexNumber complexNumber = ComplexNumberAdapter.fromDoubleToComplexNumber(realValue);
        System.out.println("ComplexNumber: " + complexNumber);

        // Exemplu de utilizare a adapterului de la ComplexNumber la Double
        double modulus = ComplexNumberAdapter.fromComplexNumberToDouble(complexNumber);
        System.out.println("Modulul ComplexNumber-ului: " + modulus);
    }
}
