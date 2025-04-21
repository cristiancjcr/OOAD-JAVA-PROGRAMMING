public class Main {
    public static void main(String[] args) {
        CoffeeLover user = new CoffeeLover();

        // Injectăm mașinile de cafea prin metode publice
        user.addCoffeeMachine(new SimpleCoffeeMachine());
        user.addCoffeeMachine(new ComplexCoffeeMachine());

        // Preparăm cafeaua
        user.makeCoffee();
    }
}
