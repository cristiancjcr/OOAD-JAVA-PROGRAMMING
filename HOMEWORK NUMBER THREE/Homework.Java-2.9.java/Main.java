public class Main {
    public static void main(String[] args) {
        // Exemplu 1: Cerc cu raza = 5.0
        Forma cerc = ShapeFactory.creeazaForma(5.0f);
        System.out.println("Aria Cercului: " + cerc.calculeazaAria());

        // Exemplu 2: Dreptunghi cu lățime = 5.0 și înălțime = 10.0
        Forma dreptunghi = ShapeFactory.creeazaForma(5.0f, 10.0f);
        System.out.println("Aria Dreptunghiului: " + dreptunghi.calculeazaAria());
    }
}
