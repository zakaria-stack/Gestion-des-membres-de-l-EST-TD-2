public class Etudiant extends ESTien {

    protected String section;
    protected double Moy;

    public Etudiant(String nom, String anneeArrivee, String section, double Moy) {
        super(nom, anneeArrivee);
        this.section = section;
        this.Moy = Moy;
    }
}