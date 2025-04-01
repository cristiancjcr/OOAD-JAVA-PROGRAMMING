// Produse
public interface Chair {
    void sitOn();
}

public interface Sofa {
    void lieOn();
}

// Produse Concrete
public class VictorianChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}

public class ModernChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Modern chair");
    }
}

public class VictorianSofa implements Sofa {
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa");
    }
}

public class ModernSofa implements Sofa {
    public void lieOn() {
        System.out.println("Lying on a Modern sofa");
    }
}

// Factory Abstractă
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Fabrici Concretă
public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

public class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
