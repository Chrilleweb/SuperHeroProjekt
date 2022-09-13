public class Database {
    private Superhero[] superheroes;
    private int antalSuperHeros;


    public Database() {
        superheroes = new Superhero[5];
        antalSuperHeros = 0;
    }
    public void createSuperhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, String erMenneske, int superHelteStyrke){
        Superhero superhero = new Superhero(superHeltNavn, superKraft, superHeltensRigtigeNavn, oprindelsesOr, erMenneske, superHelteStyrke);
        superheroes[antalSuperHeros++] = superhero;
        System.out.println(superhero);
        System.out.println(antalSuperHeros);
    }

    public int getAntalSuperHeros(){
        return antalSuperHeros;
    }

}
