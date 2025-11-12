public class Direction {

    public static void main(String[] args) {

        Ecole est = new Ecole();
        
        est.ajouter(new EtudiantReg("Chaima Mhisar", "2011", "SG1", 17.5));
        est.ajouter(new Etudiantech("Boru Borgue", "2012", "S1Meca", 13.5, "KTH"));
        est.ajouter(new Enseignant("Abdellah Moslih", 1998, 30000, "LABSSIS", "S1PQ"));
        est.ajouter(new Secretaire("Najat Tahiri", 2005, 5000, "LABSSIS"));
        est.ajouter(new EtudiantReg("Mohammed Nouri", "2013", "SIGID", 16.36));

        System.out.println("=== Liste des ESTiens ===");
        est.afficherTout();

        System.out.println("\n=== Statistiques ===");
        est.afficherStatistiques();
    }
}