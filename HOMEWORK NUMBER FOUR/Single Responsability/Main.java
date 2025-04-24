// Clasa principala unde totul este orchestrat
public class Main {
    public static void main(String[] args) {
        // Cream o factura pentru un client
        Invoice invoice = new Invoice("Ion Popescu", 3, 99.99);

        // Calculam totalul facturii
        InvoiceCalculator calculator = new InvoiceCalculator();
        double total = calculator.calculateTotal(invoice);

        // Afisam factura
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice, total);

        // Salvam factura (simulat)
        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);
    }
}
