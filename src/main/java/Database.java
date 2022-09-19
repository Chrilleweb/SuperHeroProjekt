import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();
    private int antalSuperHeros;
    private String superHeltNavn;


    public Database() {
        ArrayList<String> superheroes = new ArrayList<String>();
        antalSuperHeros = 5;
    }
    public void createSuperhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, String erMenneske, double superHelteStyrke){
        Superhero superhero = new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);
        superheroes.add(superhero);
    }

    // printer alle superhelte ud vi har lavet
    public void displaySuperheros(){
        for (Superhero superhero : superheroes){
            System.out.println(superhero);
            System.out.println();
        }
    }

    public void searchForName2(String searchForName){
        for (Superhero superhero : superheroes){
            if (superhero.getSuperHeltNavn().trim().toLowerCase().contains(searchForName))
            System.out.println("Superhelt: " + superhero.getSuperHeltNavn().substring(0, 1).toUpperCase() + superhero.getSuperHeltNavn().substring(1));
            System.out.println();
        }
    }

    public Superhero searchFor(String searchFor){
        Superhero fundet = null;
        for (Superhero superhero : superheroes){
            if (superhero.getSuperHeltNavn().toLowerCase().contains(searchFor)){
                fundet = superhero;
            }
        }
        return fundet;
    }

    public int getAntalSuperHeros(){
        return antalSuperHeros;
    }

    public ArrayList<Superhero> getSuperheros(){
        return superheroes;
    }

    public String getSuperHeltNavn(){
        return superHeltNavn;
    }
    public void setSuperHeltNavn(){
        this.superHeltNavn = superHeltNavn;
    }


}
