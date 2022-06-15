package Exo_Base_Java;

import java.util.Scanner;

public class Exercice_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez renseigner un mot : ");

        var text = input.nextLine();

        var newText = "";

        for (int i = text.length()-1 ; i >= 0 ; i--)
        {
            newText = newText + text.charAt(i);
        }

        if (newText.equalsIgnoreCase(text))
        {
            System.out.printf("%s est un palindrome",text);
        }
        else
        {
            System.out.printf("%s n'est pas un palindrome",text);
        }
    }
}
