public abstract class Personnel extends ESTien {
    protected double salaire;
    protected String laboratoire;

    public Personnel(String nom, int anneeArrivee, double salaire, String laboratoire) {
        super(nom, String.valueOf(anneeArrivee));
        this.salaire = salaire;
        this.laboratoire = laboratoire;
    }
}