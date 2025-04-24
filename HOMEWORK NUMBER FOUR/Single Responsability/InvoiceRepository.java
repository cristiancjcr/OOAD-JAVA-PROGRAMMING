// Clasa responsabila de persistenta (simulata)
public class InvoiceRepository {

    // Salveaza factura in baza de date (simulare prin consola)
    public void save(Invoice invoice) {
        // In realitate, aici ar fi un INSERT SQL sau apel catre un ORM
        System.out.println("Factura a fost salvată în baza de date pentru clientul: " + invoice.getCustomer());
    }
}
