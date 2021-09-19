package lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class LecteurPalindrome extends LecteurFichierTexte {

    public LecteurPalindrome(){
        super();
    }

    public void read(String nom_fichier){
        BufferedReader bufferedreader = null;
        FileReader filereader = null;
        ArrayList<String> affichage_ligne = new ArrayList<String>();

        try {

            filereader = new FileReader(nom_fichier);
            bufferedreader = new BufferedReader(filereader);
            String line;
            String line_palindrome;
            int taille_ligne;

            while ((line = bufferedreader.readLine()) != null) {

                taille_ligne = line.length() - 1;
                line_palindrome = line + " ";

                for (int i=taille_ligne; i > -1; i--){
                    line_palindrome += line.charAt(i);
                }
                affichage_ligne.add(line_palindrome);
            }

            bufferedreader.close();

            for (int j=0; j < affichage_ligne.size(); j++){
                System.out.println(affichage_ligne.get(j));
            }

          } catch (Exception e) {
            System.out.println(e);
        }

    }
}
