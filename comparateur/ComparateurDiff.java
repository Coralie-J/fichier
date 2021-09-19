package comparateur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.lang.Integer;


public class ComparateurDiff{

    public ComparateurDiff(){}

    public ArrayList<Integer> compare(String nom_fichier1, String nom_fichier2){

        BufferedReader buffer_fichier1, buffer_fichier2 = null;
        FileReader filereader_fichier1, filereader_fichier2 = null;
        ArrayList<Integer> lignes_diff = new ArrayList<Integer>();

        try {

            filereader_fichier1 = new FileReader(nom_fichier1);
            filereader_fichier2 = new FileReader(nom_fichier2);
            buffer_fichier1 = new BufferedReader(filereader_fichier1);
            buffer_fichier2 = new BufferedReader(filereader_fichier2);

            String line_fichier1 = "";
            String line_fichier2 = "";
            int ligne = 1;

            while ((line_fichier1 = buffer_fichier1.readLine()) != null || (line_fichier2 = buffer_fichier2.readLine()) != null){

                if (line_fichier1 == null || line_fichier2 == null || (! line_fichier1.equals(line_fichier2))){
                  lignes_diff.add(Integer.valueOf(ligne));
                }

                ligne++;
            }


        } catch(Exception e){
            System.out.println(e);
        }

        return lignes_diff;
    }
}
