import java.util.ArrayList;
import java.util.List;

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
