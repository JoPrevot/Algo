package TP_Validation_Acquis.Fondamentaux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int numberTable;

        System.out.println("Combien de nombres souhaitez-vous insérer dans votre tableau ? ");

        numberTable = input.nextInt();

        int [] table = new int [numberTable];
        String [] tableMinMax = new String [numberTable];

        for (int i = 0; i < numberTable; i++)
        {
            System.out.printf("Veuillez rentrer un nombre entier pour la valeur %d : ",i+1);

            table[i] = input.nextInt();
            tableMinMax[i] = table[i] + "";
        }

        System.out.println("\n" +"Voici le tableau que vous avez insere : ");
        System.out.println(Arrays.toString(table));

        int minNum = table [0];
        int maxNum = table [0];
        int PP = 0;
        int PG = 0;

        for (int i = 0; i < numberTable; i++)
        {
            if (table[i] > maxNum)
            {
                maxNum = table [i];
            }
            else if (table[i] < minNum)
            {
                minNum = table [i];
            }
        }

        for (int i = 0; i < numberTable; i++)
        {
            if (table[i] == maxNum)
            {
                PG = i;
                tableMinMax [i] = table [i] + " (PG) ";
            }
            else if (table[i] == minNum)
            {
                PP = i;
                tableMinMax [i] = table [i] + " (PP) ";
            }
        }

        System.out.println("\n" +"Resultat");
        System.out.printf("Valeur min : %d\n",minNum);
        System.out.printf("Valeur max : %d\n",maxNum);
        System.out.println(Arrays.toString(tableMinMax));

    }
}
