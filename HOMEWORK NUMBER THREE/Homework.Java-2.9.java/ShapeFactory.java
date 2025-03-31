public class ShapeFactory {

    // Metodă Factory pentru a decide ce formă să fie creată
    public static Forma creeazaForma(float... dimensiuni) {
        if (dimensiuni.length == 1) {
            // Un parametru înseamnă că este un Cerc
            return new Cerc(dimensiuni[0]);
        } else if (dimensiuni.length == 2) {
            // Doi parametri înseamnă că este un Dreptunghi
            return new Dreptunghi(dimensiuni[0], dimensiuni[1]);
        }
        throw new IllegalArgumentException("Număr invalid de dimensiuni pentru o formă");
    }
}
