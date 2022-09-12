public class Superhero {
    private String superHeltNavn;
    private String superKraft;
    private String superHeltensRigtigeNavn;
    private int oprindelsesOr;
    private boolean erMenneske;
    private double superHelteStyrke;


    public Superhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, boolean erMenneske, double superHelteStyrke){
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

    public boolean getErMenneske() {
        return erMenneske;
    }

    public double getSuperHelteStyrke() {
        return superHelteStyrke;
    }

    public String toString(){
        return getSuperHeltNavn() + getSuperKraft() + getSuperHeltensRigtigeNavn() + getOprindelsesOr() + getErMenneske() + getSuperHelteStyrke();
    }

}
