package TP_Validation_Acquis.Fondamentaux;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez saisir du texte : ");

        String text = input.nextLine();

        char [] table = text.toCharArray();

        for (int i = 0; i < text.length()-1; i++)
        {
            if (table[i] == ' ')
            {
                table[i+1] = Character.toUpperCase(table[i+1]);
            }
            else if (i == 0)
            {
                table[i] = Character.toUpperCase(table[i]);
            }
        }
        System.out.println(table);
    }
}
