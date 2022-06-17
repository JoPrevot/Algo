package TP_Validation_Acquis.Fondamentaux;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez entrer du texte : ");

        var text = input.nextLine();

        LinkedHashMap<Character, Integer> occurence = new LinkedHashMap<>();

        for (int i = 0; i < text.length()-1; i++)
        {
            var key = text.charAt(i);

            if(!(occurence.containsKey(key)))
            {
                occurence.put(key,1);
            }
            else if (key == text.charAt(i+1))
            {
                occurence.remove(key);
            }
            else
            {
                var previousKey = occurence.get(key);

                occurence.replace(key,(previousKey +1));
            }
        }
        System.out.println(occurence);
    }
}
