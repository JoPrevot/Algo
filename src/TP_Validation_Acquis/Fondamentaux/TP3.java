package TP_Validation_Acquis.Fondamentaux;

import java.util.HashMap;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {

        // Je définis mes varaibles et je demande à l'user de rentrer un mot

        Scanner input = new Scanner(System.in);

        String word;

        System.out.println("Veuillez rentrer un mot : ");

        word = input.nextLine();

        // Je crée une HashMap et je compte l'occurence des lettres pour le mot rentré

        HashMap <Character, Byte> occurence = new HashMap<>();

        for (int i = 0; i < word.length(); i++)
        {
            char key = word.charAt(i);

            if (occurence.containsKey(key))
            {
                int previousKeyValue = occurence.get(key);

                occurence.replace(key, (byte) (previousKeyValue + 1));
            }
            else
            {
                occurence.put(key, (byte) 1);
            }
        }

        // Je suis la même démarche pour un deuxième mot

        String wordToCompare;

        System.out.println("Veuillez saisir un second mot a comparer au premier : ");

        wordToCompare = input.nextLine();

        HashMap <Character, Byte> occurence2 = new HashMap<>();

        for (int i = 0; i < wordToCompare.length(); i++)
        {
            char key = wordToCompare.charAt(i);

            if (occurence2.containsKey(key))
            {
                int previousKeyValue = occurence2.get(key);

                occurence2.replace(key, (byte) (previousKeyValue + 1));
            }
            else
            {
                occurence2.put(key, (byte) 1);
            }
        }

        // Affichage des 2 mots rentrés ainsi que l'occurence des lettres obtenue via HashMap

        System.out.println("Voici l'occurence des lettres du premier mot : ");
        System.out.println(occurence);
        System.out.println("");
        System.out.println("Voici l'occurence des lettres du second mot : ");
        System.out.println(occurence2);
        System.out.println("");

        // Je regarde si les Hmap sont égaux (=anagramme) ou pas

        if(occurence.equals(occurence2))
        {
            System.out.printf("%s et %s sont des anagrammes",word,wordToCompare);
        }
        else
        {
            System.out.printf("%s et %s ne sont pas des anagrammes",word,wordToCompare);
        }
    }
}
