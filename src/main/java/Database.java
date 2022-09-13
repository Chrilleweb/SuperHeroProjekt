import java.util.ArrayList;

public class Database {
    ArrayList<String> superheroes = new ArrayList<String>();
    private int antalSuperHeros;


    public Database() {
        ArrayList<String> superheroes = new ArrayList<String>();
        antalSuperHeros = 1;
    }
    public void createSuperhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, String erMenneske, double superHelteStyrke){
        Superhero superhero = new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);
        System.out.println(superhero);
        System.out.println("Antal superhelte: " + antalSuperHeros++);
    }

    public int getAntalSuperHeros(){
        return antalSuperHeros;
    }

}
