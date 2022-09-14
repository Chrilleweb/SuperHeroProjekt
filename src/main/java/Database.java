import java.util.ArrayList;

public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();
    private int antalSuperHeros;


    public Database() {
        ArrayList<String> superheroes = new ArrayList<String>();
        antalSuperHeros = 1;
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

    public Superhero searchFor(String searchFor){
        Superhero fundet = null;
        for (Superhero superhero : superheroes){
            if (superhero.getSuperHeltNavn().contains(searchFor)){
                fundet = superhero;
                System.out.println(fundet);
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


}
