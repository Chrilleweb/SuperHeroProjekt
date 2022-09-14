import java.util.Scanner;

public class Main {

    Database database = new Database();

    public void indtastSuperHelt() {
        System.out.println("Velkommen til programmet!");
        System.out.println("-------------------------");
        Scanner scan = new Scanner(System.in);
        int opretEllerAfslut;
        String superHeltNavn;
        String superKraft;
        String superHeltensRigtigeNavn;
        int oprindelsesOr;
        String erMenneske;
        double superHelteStyrke;
        String searchFor;
        do {

        System.out.println("1. Opret superhelt");
        System.out.println("2. Afslut");
        System.out.println("3. Se liste af superhelte");
        System.out.println("4. Søg efter superhelt");
        opretEllerAfslut = scan.nextInt();
        scan.nextLine();

        if (opretEllerAfslut == 1){
            System.out.println("Indtast superheltenavn");
            superHeltNavn = scan.nextLine();
            System.out.println("Indtast Superkraft");
            superKraft = scan.nextLine();
            System.out.println("Indtast superheltens rigtige navn");
            superHeltensRigtigeNavn = scan.nextLine();
            System.out.println("Indtast oprindelsesår");
            oprindelsesOr = scan.nextInt();
            scan.nextLine();

            System.out.println("er din superhelt et menneske? (JA/NEJ)");
            erMenneske = scan.nextLine();

            System.out.println("Indtast superheltens styrke");
            superHelteStyrke = scan.nextDouble();
            database.createSuperhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);
        }

            if (opretEllerAfslut == 2) {
                System.out.println("Du har Afsluttet programmet");
                System.exit(0);
            } if (opretEllerAfslut == 3){
                System.out.println("Liste af superhelte:");
                 database.displaySuperheros();
            } if (opretEllerAfslut == 4){
                System.out.println("Hvilken superhelt vil du finde?");
                searchFor = scan.nextLine();
                database.searchFor(searchFor);
            }



        } while (opretEllerAfslut != 2);
    }

    public void start() {
        indtastSuperHelt();
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.start();

    }
}
