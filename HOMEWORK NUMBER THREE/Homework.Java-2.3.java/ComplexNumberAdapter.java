public class ComplexNumberAdapter {

    // Convertim un număr real (Double) într-un număr complex
    public static ComplexNumber fromDoubleToComplexNumber(double value) {
        return new ComplexNumber(value, 0); // Partea imaginară este 0
    }

    // Convertim un număr complex într-un număr real (Double) prin calcularea modulului
    public static double fromComplexNumberToDouble(ComplexNumber complexNumber) {
        return complexNumber.modulus(); // Calculăm modulul complexului
    }
}
