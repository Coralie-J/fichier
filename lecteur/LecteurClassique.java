package lecteur;

import java.io.BufferedReader;
import java.io.FileReader;


public class LecteurClassique extends LecteurFichierTexte {

    public LecteurClassique(){
      super();
    }

    public void read(String nom_fichier) {
        BufferedReader bufferedreader = null;
        FileReader filereader = null;

        try {

            filereader = new FileReader(nom_fichier);
            bufferedreader = new BufferedReader(filereader);
            String line;

            while ((line = bufferedreader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedreader.close();

          } catch (Exception e) {
            System.out.println(e);
        }
    }

}
