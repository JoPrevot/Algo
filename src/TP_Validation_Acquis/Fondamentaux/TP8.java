package TP_Validation_Acquis.Fondamentaux;

import java.util.Arrays;

public class TP8 {

    public static int[] positionFinale (String [] table)
    {
        var y = 0;
        var x = 0;

        for (int i = 0; i < table.length; i++)
        {
            if(table[i].equalsIgnoreCase("haut"))
            {
               y += + 1;
            }
            else if (table[i].equalsIgnoreCase("bas"))
            {
                y += - 1;
            }
            else if (table[i].equalsIgnoreCase("Droite"))
            {
                x += + 1;
            }
            else if (table[i].equalsIgnoreCase("Gauche"))
            {
                x += - 1;
            }
        }
        int position [] = {x,y};

        return position;
    }

    public static void main(String[] args)
    {
        String [] table = {"haut","haut","bas","gauche","gauche","droite","haut"};

        System.out.println(Arrays.toString(table));

        var positionFinale = positionFinale(table);

        System.out.println(Arrays.toString(positionFinale));
    }
}
