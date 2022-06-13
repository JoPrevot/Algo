package Exo;

import java.util.Scanner;

public class Exercice_20 {
    public static void main(String[] args) {

        // Ecrire un programme java qui demande à l'utilisateur de remplir une matrice carré 4 x 4
        // et qui ensuite va calculer la somme des elements de la diagonale

        Scanner input = new Scanner(System.in);

        int [][] table = new int [4][4];

        int sum = 0;
        int sum1 = 0;

        for (int i = 0 ; i < table.length ; i++)
        {
            for (int j = 0; j < table[i].length; j++)
            {
            System.out.printf("matrice [%d] [%d] : ",i,j);
            table[i][j]=input.nextInt();

                if (j == i || i + j == table.length-1)
                {
                sum = sum + (table[i][j]);
                }
            }
        }

        System.out.println("Affichage de tout le tableau");
        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table[i].length; j++)
            {
                System.out.print(table[i][j] +" / ");

            }
            System.out.println();
        }

        System.out.printf("La somme de la premiere diagonale est  : %d .",sum);

    }
}
