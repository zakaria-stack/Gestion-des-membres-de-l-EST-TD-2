public class Enseignant extends Personnel {
    private String section;

    public Enseignant(String nom, int anneeArrivee, double salaire, String laboratoire, String section) {
        super(nom, anneeArrivee, salaire, laboratoire);
        this.section = section;
    }

    @Override
    public void afficher() {
        System.out.println("Enseignant:");
        System.out.println("Nom: " + nom + ", Année: " + anneeArrivee +
                ", Salaire: " + salaire + ", Laboratoire: " + laboratoire +
                ", Section: " + section);
    }
}