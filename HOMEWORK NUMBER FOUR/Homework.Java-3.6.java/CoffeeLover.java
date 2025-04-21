import java.util.List;

// Clasa care primește mașinile de cafea din exterior
public class CoffeeLover {
    private List<CoffeeMachine> coffeeMachines;

    // Constructor cu dependency injection
    public CoffeeLover(List<CoffeeMachine> coffeeMachines) {
        this.coffeeMachines = coffeeMachines;
    }

    // Metoda care pornește toate mașinile de cafea
    public void makeCoffee() {
        coffeeMachines.forEach(CoffeeMachine::start);
    }
}
