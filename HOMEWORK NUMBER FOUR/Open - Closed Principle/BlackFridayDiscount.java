// Reducere de Black Friday (30%)
public class BlackFridayDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.7;
    }
}
