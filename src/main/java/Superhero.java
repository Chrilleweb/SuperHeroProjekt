public class Superhero {
    private String superHeltNavn;
    private String superKraft;
    private String superHeltensRigtigeNavn;
    private int oprindelsesOr;
    private String erMenneske;
    private double superHelteStyrke;
    private int opretEllerAfslut;


    public Superhero(String superHeltNavn, String superKraft, String superHeltensRigtigeNavn, int oprindelsesOr, String erMenneske, double superHelteStyrke){
        this.superHeltNavn = superHeltNavn;
        this.superKraft = superKraft;
        this.superHeltensRigtigeNavn = superHeltensRigtigeNavn;
        this.oprindelsesOr = oprindelsesOr;
        this.erMenneske = erMenneske;
        this.superHelteStyrke = superHelteStyrke;
    }

    public Superhero(){
        this.superHeltNavn = "noname";
        this.superKraft = "noname";
        this.superHeltensRigtigeNavn = "noname";
        this.oprindelsesOr = 0;
        this.erMenneske = "noname";
        this.superHelteStyrke = 0;
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
        return "Superheltenavn: " + getSuperHeltNavn() + "\nSuperkraft: " + getSuperKraft() + "\nVirkeligt navn: " +  getSuperHeltensRigtigeNavn() + "\nOprindelsesår: " + getOprindelsesOr() + "\nEr menneske: " + getErMenneske() + "\nStyrke: " + getSuperHelteStyrke();
    }

}
