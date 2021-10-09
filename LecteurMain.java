package fichier;

import fichier.lecteur.LecteurEnvers;
import fichier.lecteur.LecteurClassique;
import fichier.lecteur.LecteurPalindrome;
import fichier.comparateur.ComparateurDiff;


public class LecteurMain {

    public static void main(String[] args) {

        String nom_fichier = "/home/coralie/livre.txt";
        String nom_fichier2 = "/home/coralie/test.txt";
        String nom_fichier_p = "/home/coralie/test2.txt";

        //  Possibilité d'ajouter les fichiers via le terminal

        switch (args.length) {
            case 2:
                nom_fichier = args[0];
                nom_fichier2 = args[1];
                nom_fichier_p = nom_fichier;
                break;
            case 3:
                nom_fichier = args[0];
                nom_fichier2 = args[1];
                nom_fichier_p = args[2];
                break;
            default:
                break;
        }

        LecteurEnvers lecteur_envers = new LecteurEnvers();
        LecteurClassique lecteur_classique = new LecteurClassique();
        LecteurPalindrome  lecteur_p = new LecteurPalindrome();
        ComparateurDiff comparateur = new ComparateurDiff();

        System.out.println("\n ********** Lecture du fichier" + nom_fichier + " ***********\n");

        lecteur_classique.read(nom_fichier);

        System.out.println("\n ********** Lecteur à l'envers du fichier" + nom_fichier + " *********\n");

        lecteur_envers.read(nom_fichier);

        System.out.println("\n ********** Lecture palyndromique **********\n");

        lecteur_p.read(nom_fichier_p);

        System.out.println("\n *********** Comparaison des fichiers " + nom_fichier2 + " & " + nom_fichier + " *************\n");

        System.out.println("Les lignes " + comparateur.compare(nom_fichier, nom_fichier2) + " sont différentes");


    }

}
