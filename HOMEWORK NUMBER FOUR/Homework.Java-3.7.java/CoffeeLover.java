import java.util.ArrayList;
import java.util.List;

public class CoffeeLover {

    private List<CoffeeMachine> coffeeMachines;

    public CoffeeLover() {
        this.coffeeMachines = new ArrayList<>();
    }

    // Injectăm mașini de cafea prin metode publice
    public void addCoffeeMachine(CoffeeMachine machine) {
        coffeeMachines.add(machine);
    }

    // Pornește toate mașinile
    public void makeCoffee() {
        coffeeMachines.forEach(CoffeeMachine::start);
    }
}
