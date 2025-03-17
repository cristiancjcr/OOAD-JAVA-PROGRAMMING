public class Main {
    // interfata animal
    interface Animal {
        void move();
        void eat();
    }

    // interfata mamifer, extinde `animal`
    interface Mamifer extends Animal {
        void sleep();
    }

    // clasa abstracta `vertebrate`, implementeaza `mamifer`
    abstract static class Vertebrate implements Mamifer {
        protected String name;

        public Vertebrate(String name) {
            this.name = name;
        }

        @Override
        public void sleep() {
            System.out.println(name + " doarme.");
        }
    }

    // clasa `caine`, extinde `vertebrate`
    static class Caine extends Vertebrate {
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

    // metoda main() - punctul de start
    public static void main(String[] args) {
        Caine caine = new Caine("Rex");
        caine.move();
        caine.eat();
        caine.sleep();
    }
}
