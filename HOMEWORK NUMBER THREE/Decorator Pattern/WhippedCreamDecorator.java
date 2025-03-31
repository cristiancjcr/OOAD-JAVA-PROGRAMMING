// Fișier: WhippedCreamDecorator.java
public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Frișcă";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 3.0;
    }
}
