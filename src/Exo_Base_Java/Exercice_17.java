package Exo_Base_Java;

import java.util.Scanner;

public class Exercice_17 {
    public static void main(String[] args) {

        // Ecrire un programme Java demande à l'utilisateur de saisir un texte
        // et qui ensuit, retourne la chaine inverse.

        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez saisir du texte : ");

        var text = input.nextLine();

        var newText = "";

        for (int i = text.length()-1 ; i >= 0 ; i--)
        {
            newText = newText + text.charAt(i);
        }
        System.out.printf("Le texte inverse est : %s", newText);
    }
}
