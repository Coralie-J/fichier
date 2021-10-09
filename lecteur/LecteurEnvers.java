package fichier.lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class LecteurEnvers extends LecteurFichierTexte {

    public LecteurEnvers(){
        super();
    }

    public void read(String nom_fichier) {

        BufferedReader buffer = null;
        ArrayList<String> lignes = new ArrayList<String>();
        FileReader filereader = null;

        try {

            filereader = new FileReader(nom_fichier);
            buffer = new BufferedReader(filereader);
            String line;

            // Lecture du fichier et ajout des lignes dans une ArrayList

            while ((line = buffer.readLine()) != null) {
                lignes.add(line);
            }

            buffer.close();

            // Affichage des lignes du fichier en partant de la dernière lignr

            for (int i=lignes.size() - 1; i > -1; i--){
                System.out.println(lignes.get(i));
            }

        } catch (Exception e) {
          System.out.println(e);
        }

    }
}
