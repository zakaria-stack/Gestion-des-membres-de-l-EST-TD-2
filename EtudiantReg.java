public class EtudiantReg extends Etudiant {

    public EtudiantReg(String nom, String anneeArrivee, String section, double Moy) {
        super(nom, anneeArrivee, section, Moy);
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant régulier:");
        System.out.println("Nom: " + nom + ", Année: " + anneeArrivee +
                ", Section: " + section + ", Moyenne: " + Moy);
    }
}