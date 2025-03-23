// clasa `caine`, extinde `vertebrate`
public static class Caine extends Vertebrate {
    public Caine(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " aleargă rapid.");
    }

    @Override
    public void eat() {
        System.out.println(name + " mănâncă hrană pentru câini.");
    }
}
