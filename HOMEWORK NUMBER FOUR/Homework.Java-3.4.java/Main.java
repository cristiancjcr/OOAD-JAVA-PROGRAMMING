// Clasa principală pentru testare
public class Main {
    public static void main(String[] args) {
        // Imprimantă simplă
        Printer printer = new SimplePrinter();
        printer.print();

        // Imprimantă multifuncțională
        MultifunctionalPrinter mfp = new FullPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}
