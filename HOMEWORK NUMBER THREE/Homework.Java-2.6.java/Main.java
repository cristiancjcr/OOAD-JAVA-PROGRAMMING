public class Main {
    public static void main(String[] args) {
        // Cursul de schimb de exemplu: 1 USD = 4.5 Lei
        double exchangeRate = 4.5;

        // Creăm un obiect Product
        Product product = new Product(1, "Laptop", 1000.0);
        System.out.println("Product: " + product);

        // Convertim Product în Produs
        Produs produs = Helper.ProductToProdus(product, exchangeRate);
        System.out.println("Produs: " + produs);

        // Convertim Produs înapoi în Product
        Product convertedProduct = Helper.ProdusToProduct(produs, exchangeRate);
        System.out.println("Converted Product: " + convertedProduct);
    }
}
