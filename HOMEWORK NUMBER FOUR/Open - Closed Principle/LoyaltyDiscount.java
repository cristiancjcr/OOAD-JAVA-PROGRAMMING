// Reducere pentru clienti fideli (10%)
public class LoyaltyDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}
