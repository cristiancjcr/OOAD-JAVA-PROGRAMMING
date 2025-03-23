import java.util.ArrayList;
import java.util.List;

// Clasa Main (punctul de pornire al aplicației)
public class Main {
    public static void main(String[] args) {
        // Creare adrese
        Adresa adresa1 = new Adresa("Strada Victoriei", "București", "010123");
        Adresa adresa2 = new Adresa("Strada Libertății", "Cluj-Napoca", "400200");

        // Creare companii
        Companie companie1 = new Companie("Compania A");
        Companie companie2 = new Companie("Compania B");

        // Creare angajați
        Angajat angajat1 = new Angajat("Ion", "Popescu", adresa1, "Developer", companie1);
        Angajat angajat2 = new Angajat("Maria", "Ionescu", adresa2, "Designer", companie1);
        Angajat angajat3 = new Angajat("Andrei", "Georgescu", adresa1, "Manager", companie2);

        // Adăugare angajați în companii
        companie1.addEmployeeToCompany(angajat1);
        companie1.addEmployeeToCompany(angajat2);
        companie2.addEmployeeToCompany(angajat3);

        // Mutare angajat într-o altă companie
        angajat1.moveEmployeeToAnotherCompany(companie2);

        // Afișare angajați cu adresa dată
        System.out.println("Angajații care au adresa " + adresa1 + ":");
        for (Angajat angajat : companie2.findEmployeesByAddress(adresa1)) {
            System.out.println(angajat);
        }

        // Găsire companie după nume și afișare angajați
        Companie companieGasita = Companie.findCompanyByName(List.of(companie1, companie2), "Compania A");
        if (companieGasita != null) {
            System.out.println("\nAngajații la " + companieGasita.getNumeCompanie() + ":");
            for (Angajat angajat : companieGasita.getAngajati()) {
                System.out.println(angajat);
            }
        }
    }
}
