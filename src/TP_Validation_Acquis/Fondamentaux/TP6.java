package TP_Validation_Acquis.Fondamentaux;

import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] table =
                {
                {1,4,2,1},
                {6,3,2,9},
                {1,5,1,0}
                };

        System.out.println("Veuillez saisir le nombre à rechercher dans le tableau : ");

        var number = input.nextInt();
        var sumNumber = 0;
        var numberPos = "";

        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table[i].length; j++)
            {
                if(table [i][j] == number)
                    {
                        sumNumber += + 1 ;
                    }
            }
        }

        for (int i = 0; i < table.length; i++)
        {
            System.out.print("{");
            for (int j = 0; j < table[i].length; j++)
            {
                System.out.print(table[i][j] +" ");
            }
            System.out.print("}");
            System.out.println();
        }

        System.out.printf("Le nombre %d se retrouve %d fois dans les emplacements suivants : ",number,sumNumber);

        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table[i].length; j++)
            {
                if(table [i][j] == number)
                {
                    System.out.printf("(%d,%d)",i,j);
                }
            }
        }
    }
}
