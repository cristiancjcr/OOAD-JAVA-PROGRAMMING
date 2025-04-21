// Clasă care implementează toate funcționalitățile (MFP)
public class FullPrinter implements MultifunctionalPrinter {

    @Override
    public void print() {
        System.out.println("Multifunctional printer is printing...");
    }

    @Override
    public void scan() {
        System.out.println("Multifunctional printer is scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Multifunctional printer is sending a fax...");
    }
}
