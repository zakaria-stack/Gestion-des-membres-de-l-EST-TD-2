import java.util.ArrayList;
import java.util.List;

public class Ecole {

    private List<ESTien> membres;

    public Ecole() {
        membres = new ArrayList<>();
    }

    public void ajouter(ESTien e) {
        membres.add(e);
    }

    public void afficherTout() {
        for (ESTien membre : membres) {
            membre.afficher();
            System.out.println("--------------------");
        }
    }

    public void afficherStatistiques() {
        int nbEtudiants = 0;
        int nbEnseignants = 0;
        int nbSecretaires = 0;

        for (ESTien membre : membres) {
            if (membre instanceof Etudiant) {
                nbEtudiants++;
            } else if (membre instanceof Enseignant) {
                nbEnseignants++;
            } else if (membre instanceof Secretaire) {
                nbSecretaires++;
            }
        }
        
        System.out.println("Nombre total de membres: " + membres.size());
        System.out.println("Nombre d'étudiants: " + nbEtudiants);
        System.out.println("Nombre d'enseignants: " + nbEnseignants);
        System.out.println("Nombre de secrétaires: " + nbSecretaires);
    }
}