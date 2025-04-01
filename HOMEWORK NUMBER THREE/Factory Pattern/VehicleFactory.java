// VehicleFactory.java
public class VehicleFactory {
    // Metodă statică care returnează un vehicul bazat pe un tip dat
    public static Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();  // Returnează un obiect de tip Car
        } else if ("truck".equalsIgnoreCase(type)) {
            return new Truck();  // Returnează un obiect de tip Truck
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");  // Aruncă o excepție dacă tipul este invalid
        }
    }
}
