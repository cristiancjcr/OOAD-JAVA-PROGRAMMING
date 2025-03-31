public class Main {
    public static void main(String[] args) {
        // Creăm un curs
        Curs curs = new Curs();

        // Adăugăm studenți la curs
        curs.inscrieStudent(new Student("Ion Popescu"));
        curs.inscrieStudent(new Student("Maria Ionescu"));
        curs.inscrieStudent(new Student("Alexandru Georgescu"));

        // Apelăm metoda prezenta() pentru a simula prezența studenților
        System.out.println("Prezența la curs:");
        curs.prezenta();
    }
}
