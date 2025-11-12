public class Etudiantech extends Etudiant {

    private String Uni;

    public Etudiantech(String nom, String anneArrive, String section, double Moy, String Uni) {
        super(nom, anneArrive, section, Moy);
        this.Uni = Uni;
    }

    public void setUni(String uni) {
        Uni = uni;
    }

    public String getUni() {
        return Uni;
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant d'échange:");
        System.out.println("Nom: " + nom + ", Année: " + anneeArrivee +
                ", Section: " + section + ", Moyenne: " + Moy +
                ", Université d'origine: " + Uni);
    }
}