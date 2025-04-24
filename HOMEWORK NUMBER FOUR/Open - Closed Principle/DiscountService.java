// Clasa care aplica reducerea, dar nu stie detalii despre tipul de reducere
public class DiscountService {

    private DiscountStrategy discountStrategy;

    // Injectam strategia dorita
    public DiscountService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getDiscountedPrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
