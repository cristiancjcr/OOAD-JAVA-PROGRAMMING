public class WorkerTest {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        // Testăm doar comportamentele relevante
        humanWorker.work();  // Funcționează corect pentru om
        robotWorker.work();  // Funcționează corect pentru robot

        // Testăm comportamentele de mâncare doar pentru cei care pot mânca
        Eatable humanEater = new HumanWorker();
        humanEater.eat();  // Funcționează corect pentru om

        // robotWorker.eat();  // Ar arunca excepție
    }
}
