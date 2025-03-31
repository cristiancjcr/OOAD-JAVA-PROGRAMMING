public class Helper {

    // Metodă pentru a converti un obiect Product în Produs
    // exchangeRate reprezintă cursul de schimb de la USD la RON
    public static Produs ProductToProdus(Product product, double exchangeRate) {
        // Convertim prețul din USD în RON
        double priceInRON = product.getPrice() * exchangeRate;
        // Returnăm un nou obiect Produs
        return new Produs(product.getId(), product.getName(), priceInRON);
    }

    // Metodă pentru a converti un obiect Produs în Product
    // exchangeRate reprezintă cursul de schimb de la RON la USD
    public static Product ProdusToProduct(Produs produs, double exchangeRate) {
        // Convertim prețul din RON în USD
        double priceInUSD = produs.getPret() / exchangeRate;
        // Returnăm un nou obiect Product
        return new Product(produs.getId(), produs.getNume(), priceInUSD);
    }
}
