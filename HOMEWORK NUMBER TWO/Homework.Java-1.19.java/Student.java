// Student.java
public class Student {
    private String nume;
    private double nota;

    // Constructor
    public Student(String nume, double nota) {
        this.nume = nume;
        this.nota = nota;
    }

    // Getter pentru nume
    public String getNume() {
        return nume;
    }

    // Getter pentru nota
    public double getNota() {
        return nota;
    }

    // Suprascriem metoda toString pentru a afisa obiectul Student într-un format citibil
    @Override
    public String toString() {
        return "Student{nume='" + nume + "', nota=" + nota + "}";
    }
}
