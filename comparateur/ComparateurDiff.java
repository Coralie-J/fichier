package fichier.comparateur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Math;


public class ComparateurDiff{

    public ComparateurDiff(){}

    public ArrayList<Integer> compare(String nom_fichier1, String nom_fichier2){

        BufferedReader buffer_fichier1, buffer_fichier2 = null;
        FileReader filereader_fichier1, filereader_fichier2 = null;

        ArrayList<Integer> lignes_diff = this.getLignesDiffDefault(nom_fichier1, nom_fichier2);

        try {

            // Préparation des fichiers à lire

            filereader_fichier1 = new FileReader(nom_fichier1);
            filereader_fichier2 = new FileReader(nom_fichier2);
            buffer_fichier1 = new BufferedReader(filereader_fichier1);
            buffer_fichier2 = new BufferedReader(filereader_fichier2);

            String line_fichier1 = "";
            String line_fichier2 = "";
            int ligne = 1;

            // Lecture des fichiers

            while ((line_fichier1 = buffer_fichier1.readLine()) != null && (line_fichier2 = buffer_fichier2.readLine()) != null){

                // Comparaison des fichiers

                if (! line_fichier1.equals(line_fichier2)){
                    lignes_diff.add(Integer.valueOf(ligne));
                }

                ligne++;
            }

            buffer_fichier1.close();
            buffer_fichier2.close();


        } catch(Exception e){
            System.out.println(e);
        }

        return lignes_diff;
    }



    private int getNbLignes(String nom_fichier){
        int nb_lignes = 0;

        try {

            FileReader file_reader = new FileReader(nom_fichier);
            BufferedReader buffer = new BufferedReader(file_reader);
            String line = "";

            while ((line = buffer.readLine()) != null) nb_lignes++;

            buffer.close();

        } catch(Exception e){
          System.out.println(e);
        }
        return nb_lignes;
    }

    /* Si les 2 fichiers n'ont pas le même nombre de lignes, on ajoute par défaut
     * les lignes qui sont en surplus par rapport au fichier qui a le moins de lignes.
    */

    public ArrayList<Integer> getLignesDiffDefault(String nom_fichier1, String nom_fichier2){

        int nb_lignes_fichier_1 = this.getNbLignes(nom_fichier1);
        int nb_lignes_fichier_2 = this.getNbLignes(nom_fichier2);

        int difference_nb = Math.abs(nb_lignes_fichier_1 - nb_lignes_fichier_2) + 1;

        int min = Math.min(nb_lignes_fichier_1, nb_lignes_fichier_2);

        ArrayList<Integer> default_lignes_diff = new ArrayList<Integer>();

        for (int i=1; i < difference_nb; i++){
            default_lignes_diff.add(Integer.valueOf(min + i));
        }

        return default_lignes_diff;

    }
}
