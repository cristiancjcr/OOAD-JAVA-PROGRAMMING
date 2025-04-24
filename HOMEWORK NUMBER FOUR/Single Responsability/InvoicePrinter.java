// Clasa responsabila doar de afisarea facturii
public class InvoicePrinter {

    // Afiseaza informatiile despre factura intr-un format simplu
    public void print(Invoice invoice, double total) {
        System.out.println("Factura pentru client: " + invoice.getCustomer());
        System.out.println("Cantitate: " + invoice.getQuantity());
        System.out.println("Pret unitar: " + invoice.getPricePerUnit());
        System.out.println("Total: " + total + " RON");
    }
}
