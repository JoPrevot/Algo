package TP_Validation_Acquis.Fondamentaux;

import java.util.Arrays;
import java.util.Scanner;

public class TP7 {

   public static char [] returnTable(char [] table)
    {
        var result = new char [table.length];

        for (int i = 0; i < table.length; i++)
        {
            if(i % 2 == 0)
            {
                result[i] = Character.toUpperCase(table[i]);
            }
            else
            {
                result[i] = Character.toLowerCase(table[i]);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        char [] table = {'a','b','c','d','e','f'};

        System.out.println(Arrays.toString(table));

        var tableAlternate = returnTable(table);

        System.out.println(Arrays.toString(tableAlternate));

    }
}
