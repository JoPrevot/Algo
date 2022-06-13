package Exo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> table = new ArrayList<>();

        String languageName;

        while (true)
        {
            System.out.println("Veuillez rentrer un langage de programmation : ");

            languageName = input.nextLine();

            if (languageName.isBlank())
            {
                break;
            }

            table.add(languageName);

        }
        System.out.println("Voici le tableau que vous avez saisi :\n " +table);

        while (true)
        {
            System.out.println("Quel langage souhaitez-vous supprimer : ");

            String languageToDelete = input.nextLine();

            if (languageToDelete.isBlank())
            {
                break;
            }
            else {
                if (!table.contains(languageToDelete)) {
                    System.out.println("Le langage choisi n'existe pas.");
                }
                table.remove(languageToDelete);
            }
        }
        System.out.println("Voici le tableau apres suppression :\n " +table);
    }
}
