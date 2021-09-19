import lecteur.*;
import comparateur.ComparateurDiff;


public class LecteurMain {

    public static void main(String[] args) {

        String nom_fichier = "/home/coralie/livre.txt";
        String nom_fichier2 = "/home/coralie/test.txt";

        if (args.length == 2){
            nom_fichier = args[0];
            nom_fichier2 = args[1];
        }

        LecteurEnvers lecteur_envers = new LecteurEnvers();
        LecteurClassique lecteur_classique = new LecteurClassique();
        LecteurPalindrome  lecteur_p = new LecteurPalindrome();
        ComparateurDiff comparateur = new ComparateurDiff();

        System.out.println("\n ********** Lecture du fichier ***********\n");

        lecteur_classique.read(nom_fichier);

        System.out.println("\n ********** Lecteur à l'envers du fichier *********\n");

        lecteur_envers.read(nom_fichier);

        System.out.println("\n ********** Lecture palyndromique **********\n");

        lecteur_p.read("/home/coralie/test2.txt");

        System.out.println("\n *********** Comparaison des fichiers " + nom_fichier2 + " & " + nom_fichier + " *************\n");

        System.out.println("Les lignes " + comparateur.compare(nom_fichier, nom_fichier2) + " sont différentes");






    }

}
