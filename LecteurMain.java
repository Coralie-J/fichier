public class LecteurMain {

    public static void main(String[] args) {

        String nom_fichier = "/home/coralie/livre.txt";

        LecteurFichierEnvers lecteur_envers = new LecteurFichierEnvers();
        LecteurFichierClassique lecteur_classique = new LecteurFichierClassique();

        lecteur_classique.read(nom_fichier);

        System.out.println("");

        lecteur_envers.read(nom_fichier);


/*
        // Affichage du contenu d'un fichier à l'endroit

        // Comparateur diff

        System.out.println(" ");

        BufferedReader buffer_fichier1 = null;
        BufferedReader buffer_fichier2 = null;

        FileReader filereader_fichier1 = null;
        FileReader filereader_fichier2 = null;
        String nom_fichier2 = '';

        try {

            filereader_fichier1 = new FileReader(nom_fichier);
            filereader_fichier2 = new FileReader(nom_fichier2);

            buffer_fichier1 = new BufferedReader(filereader_fichier1);
            buffer_fichier2 = new BufferedReader(filereader_fichier2);


        }
*/

    }

}
