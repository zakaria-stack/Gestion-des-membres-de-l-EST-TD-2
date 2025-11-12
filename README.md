# 💻 TP N°1 - Programmation Orientée Objet (Java)

Projet réalisé dans le cadre du module POO à l'École Supérieure de Technologie de Safi (ESTS) - Université Cadi Ayyad.

---

## 🎯 Objectif du Projet

L'objectif de ce travail pratique est de modéliser la gestion des membres de l'EST-Safi en utilisant les concepts clés de la programmation orientée objet :

* **Héritage :** Créer une hiérarchie de classes à partir d'une classe de base `ESTien`.
* **Polymorphisme :** Gérer tous les types de membres (étudiants, enseignants, secrétaires) dans une seule collection (`ArrayList<ESTien>`).
* **Encapsulation :** Protéger les données en utilisant des modificateurs d'accès (`private`, `protected`).

---

## 🛠️ Structure des Classes

Le projet est basé sur la hiérarchie de classes suivante :

* `ESTien` (Classe de base abstraite)
    * `Personnel` (Classe abstraite)
        * `Enseignant` (Classe concrète)
        * `Secretaire` (Classe concrète)
    * `Etudiant` (Classe intermédiaire)
        * `EtudiantReg` (Classe concrète pour étudiants réguliers)
        * `Etudiantech` (Classe concrète pour étudiants d'échange)
* `Ecole` : Classe principale qui contient la collection (`List<ESTien>`) et les méthodes de gestion (ajouter, afficher, statistiques).
* `Direction` : Classe contenant la méthode `main()` pour l'exécution du test.

---

## 🚀 Comment l'exécuter

Le projet est écrit en Java standard et ne nécessite aucune dépendance externe.

### 1. Avec un IDE (Recommandé)

1.  Ouvrez votre IDE (IntelliJ, Eclipse, VS Code...).
2.  Importez le projet (ou ouvrez simplement le dossier).
3.  Trouvez le fichier `Direction.java`.
4.  Exécutez (Run) la méthode `main()`.

### 2. Depuis le terminal (CLI)

Assurez-vous que le JDK (Java Development Kit) est installé sur votre machine.

```bash
# 1. Placez-vous dans le dossier racine du projet
cd /chemin/vers/le/projet

# 2. Compilez tous les fichiers .java
javac *.java
# (ou javac com/example/univ/*.java si vous utilisez des packages)

# 3. Exécutez la classe principale (Direction)
java Direction
