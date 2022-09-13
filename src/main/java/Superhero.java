public class Superhero {
    private String superHeltNavn;
    private String superKraft;
    private String superHeltensRigtigeNavn;
    private int oprindelsesOr;
    private String erMenneske;
    private int superHelteStyrke;
    private int opretEllerAfslut;


    public Superhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, String erMenneske, int superHelteStyrke){
        this.superHeltNavn = superHeltNavn;
        this.superKraft = superKraft;
        this.superHeltensRigtigeNavn = superHeltensRigtigeNavn;
        this.oprindelsesOr = oprindelsesOr;
        this.erMenneske = erMenneske;
        this.superHelteStyrke = superHelteStyrke;
    }

    public String getSuperHeltNavn(){
        return superHeltNavn;
    }

    public String getSuperKraft(){
        return superKraft;
    }

    public String getSuperHeltensRigtigeNavn(){
        return superHeltensRigtigeNavn;
    }

    public int getOprindelsesOr(){
        return oprindelsesOr;
    }

    public String getErMenneske() {
       return erMenneske;
    }


    public double getSuperHelteStyrke() {
        return superHelteStyrke;
    }

    public String toString(){
        return "Superheltenavn: " + getSuperHeltNavn() + "\n" + "Superkraft: " + getSuperKraft() + "\n" + "Virkeligt navn: " +  getSuperHeltensRigtigeNavn() + "\n" + "Oprindelsesår: " + getOprindelsesOr() + "\n" + "Er menneske: " + getErMenneske() + "\n" + "Styrke: " + getSuperHelteStyrke();
    }

}
