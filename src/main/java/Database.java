public class Database {
    private Superhero[] superheroes;


    public Database() {

        Superhero superHeltNavn = new Superhero("d", "Klatre på vægge", "christian", 2000, true, 2);
        Superhero superhelt2 = new Superhero("Spiderman", "Klatre på vægge", "christian", 2000, true, 2);
        Superhero superhelt3 = new Superhero("Spiderman", "Klatre på vægge", "christian", 2000, true, 2);
        Superhero superhelt4 = new Superhero("Spiderman", "Klatre på vægge", "christian", 2000, true, 2);
        Superhero superhelt5 = new Superhero("spiderman", "Klatre på vægge", "christian", 2000, true, 2);

        this.superheroes = new Superhero[]{superHeltNavn};

    }


    public Superhero[] getSuperheroes() {
        return superheroes;
    }


}
