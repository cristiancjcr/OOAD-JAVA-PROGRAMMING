// clasa abstracta `vertebrate`, implementeaza `mamifer`
public abstract static class Vertebrate implements Mamifer {
    protected String name;

    public Vertebrate(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println(name + " doarme.");
    }
}
