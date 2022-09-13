public class Database {
    private Superhero[] superheroes;
    private int antalSuperHeros;
    private int superherosAmount;


    public Database() {
        superheroes = new Superhero[5];
        antalSuperHeros = 0;
        superherosAmount = 0;
    }
    public void createSuperhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, String erMenneske, int superHelteStyrke){
        Superhero superhero = new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);
        superheroes[antalSuperHeros++] = superhero;
        superheroes[antalSuperHeros++] = superhero;
    }

    public int getSuperherosAmount() {
        return superherosAmount;
    }

    public int getAntalSuperHeros(){
        return antalSuperHeros;
    }
}
