// Fara reducere
public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price;
    }
}
