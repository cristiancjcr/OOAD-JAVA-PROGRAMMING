// Simulam utilizarea
public class Main {
    public static void main(String[] args) {
        double originalPrice = 100.0;

        // Alegem o strategie de reducere (ex: Black Friday)
        DiscountStrategy strategy = new BlackFridayDiscount();
        DiscountService service = new DiscountService(strategy);

        double finalPrice = service.getDiscountedPrice(originalPrice);
        System.out.println("Pret final cu reducere: " + finalPrice + " RON");
    }
}
