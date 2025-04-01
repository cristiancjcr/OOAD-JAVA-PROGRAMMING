// Main.java
public class Main {
    public static void main(String[] args) {
        // Crearea unui vehicul de tip Car folosind fabrica
        Vehicle vehicle1 = VehicleFactory.createVehicle("car");
        vehicle1.drive();  // Afișează: Driving a car.

        // Crearea unui vehicul de tip Truck folosind fabrica
        Vehicle vehicle2 = VehicleFactory.createVehicle("truck");
        vehicle2.drive();  // Afișează: Driving a truck.
    }
}
