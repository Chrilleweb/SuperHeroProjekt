import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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
        System.out.println("er din superhelt et menneske? (JA/NEJ)");
        boolean erMennekse = scan.hasNext();
        System.out.println("Indtast superheltens styrke");
        double superhelteStyrke = scan.nextDouble();


    }
}
