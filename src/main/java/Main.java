import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);
    int opretEllerAfslut;
    String superHeltNavn;
    String superKraft;
    String superHeltensRigtigeNavn;
    int oprindelsesOr;
    String erMenneske;
    double superHelteStyrke;
    String searchFor;
    String searchForName;
    String userEdit;
    String searchForNameEdit;
    String selectEdit;
    Database database = new Database();


    public void EditSuperHeltNavn(){
        System.out.println("Skriv superheltens nye navn:");
        superHeltNavn = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
    }

    public void EditSuperKraft(){
        System.out.println("Skriv superheltens nye superkraft:");
        superKraft = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
    }

    public void EditSuperHeltensRigtigeNavn(){
        System.out.println("Skriv superheltens nye rigtige navn:");
        superHeltensRigtigeNavn = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
    }

    public void EditOprindelsesOr(){
        System.out.println("Skriv superheltens nye oprindelsesår:");
        oprindelsesOr = scan.nextInt();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
    }

    public void EditErMenneske(){
        System.out.println("er superhelten menneske?:");
        erMenneske = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
    }

    public void EditSuperheltensStyrke(){
        System.out.println("Skriv superheltens nye styrke:");
        superHelteStyrke = scan.nextDouble();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
    }

    public void EditSuperhelt(){
        System.out.println("Søg efter den superhelt du vil redigere:");
        searchForNameEdit = scan.nextLine();
        System.out.println("Superhelte:");
        database.searchForName2(searchForNameEdit);
        System.out.println();
        System.out.println("Vælg en superhelt fra listen:");
        userEdit = scan.nextLine();
        System.out.println("Her er din superhelt:");
        System.out.println(database.searchFor(userEdit));
        System.out.println();
        System.out.println("Hvad vil du gerne redigere?");
        selectEdit = scan.nextLine();
        if (selectEdit.equals("superheltenavn")){
            EditSuperHeltNavn();
        } if (selectEdit.equals("superkraft")){
            EditSuperKraft();
        } if (selectEdit.equals(("virkeligt navn"))){
            EditSuperHeltensRigtigeNavn();
        } if (selectEdit.equals("oprindelsesår")){
            EditOprindelsesOr();
        } if (selectEdit.equals("er menneske")){
            EditErMenneske();
        } if (selectEdit.equals("styrke")){
            EditSuperheltensStyrke();
        }
    }

    public void OpretNySuperhelt(){
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

    public void SearchForName(){
            System.out.println("Hvilken superhelt vil du finde?");
            searchForName = scan.nextLine();
            System.out.println("Liste af superhelte der har " + searchForName + " i navnet:");
            database.searchForName2(searchForName);
            System.out.println();
            System.out.println("Vælg en superhelt fra listen:");
            searchFor = scan.nextLine();
            System.out.println("Her er din superhelt:");
            System.out.println(database.searchFor(searchFor));
            System.out.println();

    }

    public void indtastSuperHelt() {
        System.out.println("Velkommen til programmet!");
        System.out.println("-------------------------");
        do {

        System.out.println("1. Opret superhelt");
        System.out.println("2. Afslut");
        System.out.println("3. Se liste af superhelte");
        System.out.println("4. Søg efter superhelt");
            System.out.println("5. Edit en superhelt");
        opretEllerAfslut = scan.nextInt();
        scan.nextLine();

        if (opretEllerAfslut == 1){
            OpretNySuperhelt();
        } if (opretEllerAfslut == 2) {
                System.out.println("Du har Afsluttet programmet");
                System.exit(0);
            } if (opretEllerAfslut == 3){
                System.out.println("Liste af superhelte:");
                 database.displaySuperheros();
            } if (opretEllerAfslut == 4){
                SearchForName();
            } if (opretEllerAfslut == 5){
            EditSuperhelt();
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
