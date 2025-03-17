// Homework.Java-1.11.

import java.util.ArrayList;
import java.util.List;

// interfata de baza Shape
interface Shape {
    String getCuloare();
    double getPerimetru();
}

// clasa abstracta Shape2D (extinde Shape)
abstract class Shape2D implements Shape {
    protected String culoare;

    public Shape2D(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    public abstract double getAria();
}

// clasa abstracta Shape3D (extinde Shape)
abstract class Shape3D implements Shape {
    protected String culoare;

    public Shape3D(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    public abstract double getVolum();

    // adaugam metoda getAria() pentru a putea fi folosita pentru 3D
    public abstract double getAria();
}

// implementare pentru SegmentDeDreapta
class SegmentDeDreapta implements Shape {
    private String culoare;
    private double lungime;

    public SegmentDeDreapta(String culoare, double lungime) {
        this.culoare = culoare;
        this.lungime = lungime;
    }

    @Override
    public String getCuloare() {
        return culoare;
    }

    @Override
    public double getPerimetru() {
        return lungime;
    }

    public double getLungime() {
        return lungime;
    }
}

// implementare pentru patrat
class Patrat extends Shape2D {
    private double latura;

    public Patrat(String culoare, double latura) {
        super(culoare);
        this.latura = latura;
    }

    @Override
    public double getPerimetru() {
        return 4 * latura;
    }

    @Override
    public double getAria() {
        return latura * latura;
    }
}

// implementare pentru cerc
class Cerc extends Shape2D {
    private double raza;

    public Cerc(String culoare, double raza) {
        super(culoare);
        this.raza = raza;
    }

    @Override
    public double getPerimetru() {
        return 2 * Math.PI * raza;
    }

    @Override
    public double getAria() {
        return Math.PI * raza * raza;
    }
}

// implementare pentru sfera
class Sfera extends Shape3D {
    private double raza;

    public Sfera(String culoare, double raza) {
        super(culoare);
        this.raza = raza;
    }

    @Override
    public double getPerimetru() {
        return 0; // nu are sens pentru 3D
    }

    @Override
    public double getAria() {
        return 4 * Math.PI * raza * raza;
    }

    @Override
    public double getVolum() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raza, 3);
    }
}

// implementare pentru CUB
class Cub extends Shape3D {
    private double latura;

    public Cub(String culoare, double latura) {
        super(culoare);
        this.latura = latura;
    }

    @Override
    public double getPerimetru() {
        return 0; // nu are sens pentru 3D
    }

    @Override
    public double getAria() {
        return 6 * latura * latura;
    }

    @Override
    public double getVolum() {
        return Math.pow(latura, 3);
    }
}

// clasa principala Main pentru testare
public class Main {
    public static void main(String[] args) {
        // 1. lungimea segmentului de dreapta
        SegmentDeDreapta segment = new SegmentDeDreapta("Negru", 5);
        System.out.println("Lungimea segmentului: " + segment.getLungime());

        // 2. calculam perimetrul patratelor și cercurilor dintr-o lista
        List<Shape2D> forme2D = new ArrayList<>();
        forme2D.add(new Patrat("Albastru", 4));
        forme2D.add(new Cerc("Roșu", 3));

        double sumaPerimetre = 0;
        for (Shape2D forma : forme2D) {
            sumaPerimetre += forma.getPerimetru();
        }
        System.out.println("Suma perimetrelor pătratelor și cercurilor: " + sumaPerimetre);

        // 3. calculam aria tuturor formelor (patrate, cercuri, sfere & cuburi)
        List<Shape> toateFormele = new ArrayList<>();
        toateFormele.add(new Patrat("Galben", 3));
        toateFormele.add(new Cerc("Verde", 5));
        toateFormele.add(new Sfera("Alb", 2));
        toateFormele.add(new Cub("Negru", 2));

        double sumaArii = 0;
        for (Shape forma : toateFormele) {
            if (forma instanceof Shape2D) {
                sumaArii += ((Shape2D) forma).getAria();
            } else if (forma instanceof Shape3D) {
                sumaArii += ((Shape3D) forma).getAria();
            }
        }
        System.out.println("Suma ariilor: " + sumaArii);

        // 4. calculam volumul sferelor & cuburilor dintr-o lista
        List<Shape3D> forme3D = new ArrayList<>();
        forme3D.add(new Sfera("Portocaliu", 3));
        forme3D.add(new Cub("Gri", 4));

        double sumaVolume = 0;
        for (Shape3D forma : forme3D) {
            sumaVolume += forma.getVolum();
        }
        System.out.println("Suma volumelor sferelor și cuburilor: " + sumaVolume);
    }
}
