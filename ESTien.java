public class ESTien {
    protected String nom;
    protected String anneeArrivee;

    public ESTien(String nom, String anneeArrivee) {
        this.nom = nom;
        this.anneeArrivee = anneeArrivee;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Année arrivée: " + anneeArrivee);
    }
}