package Base_Java;

import java.util.Arrays;

public class Arraystorage {
    public static void main(String[] args) {

        // Tableau d'entiers (int / byte / short) java initialise les cellules par 0

        // Tableau float / double : java initialise les cellules par 0.0

        // tableau de boolean : java initialise toutes les cellules par false

        // tableau de string : java initialise toutes les cellules par null (ne pointe vers rien)

        int b;
        int[] a=new int[5];
        System.out.print("Affichage de l'adresse stockee dans a : ");
        System.out.print(a);

        System.out.println();
        System.out.println("Affichage du tableau :"+ Arrays.toString(a));

    }
}
