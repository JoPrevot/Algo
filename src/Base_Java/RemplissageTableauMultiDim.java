package Base_Java;

import java.util.Scanner;

public class RemplissageTableauMultiDim {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Donnez le nombre de lignes : "); // Taille en ligne

        int taille = input.nextInt();

        int [][] matrice = new int [taille][];

        //On va commencer par remplir la 1ère ligne, index 0 , index 1 ... puis on passe à la ligne suivante
        // [0][0] -> 4 ; [0][1] -> 3 ; [0][2] -> 5 ...

        for (int i = 0 ; i < matrice.length ; i++)
        {
            System.out.printf("Donnez le nombre de colonnes pour la ligne %d : ",i); // Ici taille en colonne !

            int nombreDeColonnes = input.nextInt();

            matrice[i] = new int [nombreDeColonnes];

            for (int j = 0; j < matrice[i].length; j++)
            {
                System.out.printf("matrice [%d] [%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }
        System.out.println("Affichage de tout le tableau");
        for (int i = 0; i < matrice.length; i++)
        {
            for (int j = 0; j < matrice[i].length; j++)
            {
                System.out.print(matrice[i][j] +" / ");
            }
            System.out.println();

        }
    }
}
