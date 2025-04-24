// Clasa responsabila doar de calculul totalului unei facturi
public class InvoiceCalculator {

    // Calculeaza totalul: pret unitar * cantitate
    public double calculateTotal(Invoice invoice) {
        return invoice.getQuantity() * invoice.getPricePerUnit();
    }
}
