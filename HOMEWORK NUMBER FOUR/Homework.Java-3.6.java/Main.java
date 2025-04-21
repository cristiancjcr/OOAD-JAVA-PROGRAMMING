import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cream lista de mașini de cafea în afara clasei CoffeeLover
        List<CoffeeMachine> machines = new ArrayList<>();
        machines.add(new SimpleCoffeeMachine());
        machines.add(new ComplexCoffeeMachine());

        // Injectăm lista prin constructor
        CoffeeLover coffeeLover = new CoffeeLover(machines);

        // Pornim toate mașinile
        coffeeLover.makeCoffee();
    }
}
