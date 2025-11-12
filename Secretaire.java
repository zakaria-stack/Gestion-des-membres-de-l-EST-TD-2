public class Secretaire extends Personnel {

    public Secretaire(String nom, int anneeArrivee, double salaire, String laboratoire) {
        super(nom, anneeArrivee, salaire, laboratoire);
    }

    @Override
    public void afficher() {
        System.out.println("Secrétaire:");
        System.out.println("Nom: " + nom + ", Année: " + anneeArrivee +
                ", Salaire: " + salaire + ", Laboratoire: " + laboratoire);
    }
}