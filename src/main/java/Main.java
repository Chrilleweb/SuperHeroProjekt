import java.util.Scanner;

public class Main {

    Database database = new Database();

    public void indtastSuperHelt() {
        System.out.println("Velkommen til programmet!");
        System.out.println("-------------------------");
        Scanner scan = new Scanner(System.in);
        int opretEllerAfslut;
        do {

        System.out.println("1. Opret superhelt");
        System.out.println("2. Afslut");
        opretEllerAfslut = scan.nextInt();
        scan.nextLine();

            if (opretEllerAfslut == 2) {
                System.out.println("Du har Afsluttet programmet");
                System.exit(0);
            }


        System.out.println("Indtast superheltenavn");
        String superHeltNavn = scan.nextLine();
        System.out.println("Indtast Superkraft");
        String superKraft = scan.nextLine();
        System.out.println("Indtast superheltens rigtige navn");
        String superHeltensRigtigeNavn = scan.nextLine();
        System.out.println("Indtast oprindelsesår");
        int oprindelsesOr = scan.nextInt();
        scan.nextLine();


        System.out.println("er din superhelt et menneske? (JA/NEJ)");
        String erMenneske = scan.nextLine();


        System.out.println("Indtast superheltens styrke");
        double superHelteStyrke = scan.nextDouble();

        database.createSuperhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);

        System.out.println();
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
