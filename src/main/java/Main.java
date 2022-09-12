import java.util.Scanner;

public class Main {

    Database database = new Database();

    public void indtastSuperHelt() {
        System.out.println("Velkommen til programmet!");
        System.out.println("-------------------------");
        System.out.println("1. Opret superhelt");
        System.out.println("2. Afslut");
        Scanner scan = new Scanner(System.in);
        int opretEllerAfslut = scan.nextInt();
            if (opretEllerAfslut == 2) {
                System.out.println("Du har Afsluttet programmet");
                System.exit(0);
            }






        System.out.println("Indtast superheltenavn");
        String superHeltNavn = scan.next();
        System.out.println("Indtast Superkraft");
        String superKraft = scan.next();
        System.out.println("Indtast superheltens rigtige navn");
        String superHeltensRigtigeNavn = scan.next();
        System.out.println("Indtast oprindelsesår");
        int oprindelsesOr = scan.nextInt();


        System.out.println("er din superhelt et menneske? (JA/NEJ)");
        String erMenneske = scan.next();


        System.out.println("Indtast superheltens styrke");
        int superhelteStyrke = scan.nextInt();

        Superhero superhero = new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superhelteStyrke);

        System.out.println(superhero.toString());
    }


    public void start() {
        indtastSuperHelt();
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.start();

    }
}
