// Clasa model pentru o factura
public class Invoice {
    private String customer;      // Numele clientului
    private int quantity;         // Cantitatea de produse
    private double pricePerUnit;  // Pretul pe unitate

    public Invoice(String customer, int quantity, double pricePerUnit) {
        this.customer = customer;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getteri - permit accesul la campurile private
    public String getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
