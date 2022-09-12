import java.util.Scanner;

public class Main {

    Database database = new Database();

    public void indtastSuperHelt() {
        System.out.println("Velkommen til programmet!");
        System.out.println("-------------------------");


        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast superheltenavn");
        String superHeltNavn = scan.next();
        System.out.println("Indtast Superkraft");
        String superKraft = scan.next();
        System.out.println("Indtast superheltens rigtige navn");
        String superHeltensRigtigeNavn = scan.next();
        System.out.println("Indtast oprindelsesår");
        int oprindelsesOr = scan.nextInt();
        System.out.println("er din superhelt et menneske? (TRUE/FALSE)");
        boolean erMenneske = scan.nextBoolean();
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
