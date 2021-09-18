import lecteur.*;
import comparateur.ComparateurDiff;


public class LecteurMain {

    public static void main(String[] args) {

        String nom_fichier = "/home/coralie/livre.txt";
        String nom_fichier2 = "/home/coralie/test.txt";

        LecteurEnvers lecteur_envers = new LecteurEnvers();
        LecteurClassique lecteur_classique = new LecteurClassique();
        ComparateurDiff comparateur = new ComparateurDiff();

        lecteur_classique.read(nom_fichier);

        System.out.println("");

        lecteur_envers.read(nom_fichier);

        System.out.println("");

        System.out.println(comparateur.compare(nom_fichier, nom_fichier2));

    }

}
