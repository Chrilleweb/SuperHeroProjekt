import java.util.Scanner;

public class UserInterFace {

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
    boolean jn;
    String deleteJaNej;
    Database database = new Database();


    public void DeleteSuperhelt() {
        System.out.println("Hvilken superhelt vil du gerne delete?");
        searchForName = scan.nextLine();
        System.out.println("Liste af superhelte der har " + searchForName + " i navnet:");
        database.searchForName2(searchForName);
        System.out.println();
        System.out.println("Du har " + database.superheroes.size() + " superhelt(e) at vælge imellem, vælg én");
        searchFor = scan.nextLine();
        System.out.println(database.searchFor(searchFor));


        System.out.println("Vil du slette denne superhelt? (JA/NEJ)");
        while (true){
            deleteJaNej = scan.nextLine().trim().toLowerCase();
            if (deleteJaNej.equals("ja")){
                jn = true;
                database.superheroes.remove(database.searchFor(searchFor));
                System.out.println("Superhelten: " + searchFor + " blev slettet fra databasen");
                break;
            } else if (deleteJaNej.equals("nej")) {
                jn = false;
                System.out.println("Din superhelt er ikke blevet slettet");
                break;
            } else {
                System.out.println("du skal svare JA/NEJ");
            }
        }
    }

    public void EditSuperHeltNavn() {
        System.out.println("Skriv superheltens nye navn:");
        superHeltNavn = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
        System.out.println("Din superhelts nye navn er: " + superHeltNavn);
    }

    public void EditSuperKraft() {
        System.out.println("Skriv superheltens nye superkraft:");
        superKraft = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
        System.out.println("Din superhelts nye superkraft er: " + superKraft);
    }

    public void EditSuperHeltensRigtigeNavn() {
        System.out.println("Skriv superheltens nye rigtige navn:");
        superHeltensRigtigeNavn = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
        System.out.println("Din superhelts nye rigtige navn er: " + superHeltensRigtigeNavn);
    }

    public void EditOprindelsesOr() {
        System.out.println("Skriv superheltens nye oprindelsesår:");
        oprindelsesOr = scan.nextInt();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
        System.out.println("Din superhelts nye oprindelsesår er: " + oprindelsesOr);
    }

    public void EditErMenneske() {
        System.out.println("er superhelten menneske?:");
        erMenneske = scan.nextLine();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
        System.out.println("Opdateret er menneske: " + erMenneske);
    }

    public void EditSuperheltensStyrke() {
        System.out.println("Skriv superheltens nye styrke:");
        superHelteStyrke = scan.nextDouble();
        database.getSuperheros().set(0, new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke));
        System.out.println("Din superhelts nye styrke er: " + superHelteStyrke);
    }

    public void EditSuperhelt() {
        System.out.println("Søg efter den superhelt du vil redigere:");
        searchForNameEdit = scan.nextLine();
        System.out.println("Superhelte:");
        database.searchForName2(searchForNameEdit);
        System.out.println();
        System.out.println("Vælg en superhelt fra listen:");
        userEdit = scan.nextLine();
        System.out.println("Her er din superhelt:");

        if (database.searchFor(userEdit) == null) {
            System.out.println("Du har ingen superhelt med navnet " + userEdit);
            indtastSuperHelt();
        } else {
            System.out.println(database.searchFor(userEdit));
            System.out.println();
        }

        System.out.println("Hvad vil du gerne redigere?");
        selectEdit = scan.nextLine();
        if (selectEdit.equals("superheltenavn")) {
            EditSuperHeltNavn();
        } else if (selectEdit.equals("superkraft")) {
            EditSuperKraft();
        } else if (selectEdit.equals(("virkeligt navn"))) {
            EditSuperHeltensRigtigeNavn();
        } else if (selectEdit.equals("oprindelsesår")) {
            EditOprindelsesOr();
        } else if (selectEdit.equals("er menneske")) {
            EditErMenneske();
        } else if (selectEdit.equals("styrke")) {
            EditSuperheltensStyrke();
        } else {
            System.out.println("Du skrev forkert, tryk på 'Edit en superhelt' igen");
        }

    }

    public void OpretNySuperhelt() {
        System.out.println("Indtast superheltenavn");
        superHeltNavn = scan.nextLine();
        System.out.println("Indtast Superkraft");
        superKraft = scan.nextLine();
        System.out.println("Indtast superheltens rigtige navn");
        superHeltensRigtigeNavn = scan.nextLine();

        System.out.println("Indtast oprindelsesår");

        while (!scan.hasNextInt()) {
            System.out.println("Oprindelsesår må kun indeholde tal, prøv igen");
            scan.nextLine();
        }
        oprindelsesOr = scan.nextInt();
        scan.nextLine();


        System.out.println("er din superhelt et menneske? (JA/NEJ)");
        while (true){
            erMenneske = scan.nextLine().trim().toLowerCase();
            if (erMenneske.equals("ja")){
                jn = true;
                break;
            } else if (erMenneske.equals("nej")) {
                jn = false;
                break;
            } else {
                System.out.println("Du skal skrive ja eller nej");
            }
        }

        System.out.println("Indtast superheltens styrke");
        while (!scan.hasNextDouble()) {
            System.out.println("Superstyrke må kun indeholde tal, prøv igen");
            scan.nextLine();
        }
        superHelteStyrke = scan.nextDouble();
        database.createSuperhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);

    }

    public void SearchForName() {
        System.out.println("Hvilken superhelt vil du finde?");
        searchForName = scan.nextLine();
        System.out.println("Liste af superhelte der har " + searchForName + " i navnet:");
        database.searchForName2(searchForName);
        System.out.println();
        System.out.println("Du har " + database.superheroes.size() + " superhelt(e) at vælge imellem, vælg én");
        searchFor = scan.nextLine();
        System.out.println("Her er din superhelt:");
        if (database.searchFor(searchFor) == null) {
            System.out.println("");
        } else {
            System.out.println(database.searchFor(searchFor));
            System.out.println();
        }
    }

    public void indtastSuperHelt() {

        do {
            System.out.println("-------------------------");
            System.out.println("1. Opret superhelt");
            System.out.println("2. Afslut");
            System.out.println("3. Se liste af superhelte");
            System.out.println("4. Søg efter superhelt");
            System.out.println("5. Edit en superhelt");
            System.out.println("6. Delete en superhelt");
            try {
                opretEllerAfslut = scan.nextInt();
                scan.nextLine();
                if (opretEllerAfslut == 1) {
                    OpretNySuperhelt();
                }
                if (opretEllerAfslut == 2) {
                    System.out.println("Du har Afsluttet programmet");
                    System.exit(0);
                }
                if (opretEllerAfslut == 3) {
                    System.out.println("Liste af superhelte:");
                    database.displaySuperheros();
                }
                if (opretEllerAfslut == 4) {
                    SearchForName();
                }
                if (opretEllerAfslut == 5) {
                    EditSuperhelt();
                }
                if (opretEllerAfslut == 6) {
                    DeleteSuperhelt();
                }
            } catch (Exception e) {
                System.out.println("Du skal vælge et tal fra listen, prøv igen");
                scan.nextLine();
                indtastSuperHelt();
                break;
            }
        } while (opretEllerAfslut != 2);
    }

    public void start() {
        System.out.println("Velkommen til programmet!");
        indtastSuperHelt();
    }
}
