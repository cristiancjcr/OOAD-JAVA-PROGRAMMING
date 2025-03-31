// Fișier: Main.java
public class Main {
    public static void main(String[] args) {
        // Cafea simplă
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " → " + coffee.getCost() + " RON");

        // Adăugăm lapte
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " → " + coffee.getCost() + " RON");

        // Adăugăm zahăr
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " → " + coffee.getCost() + " RON");

        // Adăugăm frișcă
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " → " + coffee.getCost() + " RON");
    }
}
