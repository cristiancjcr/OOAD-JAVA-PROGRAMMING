import java.util.ArrayList;
import java.util.List;

// Clasa care creează și folosește mașinile de cafea
public class CoffeeLover {

    private List<CoffeeMachine> coffeeMachines;

    public CoffeeLover() {
        this.coffeeMachines = new ArrayList<>();

        // Utilizatorul creează propriile sale mașini
        coffeeMachines.add(new SimpleCoffeeMachine());
        coffeeMachines.add(new ComplexCoffeeMachine());
    }

    public void makeCoffee() {
        coffeeMachines.forEach(cm -> cm.start());
    }
}
