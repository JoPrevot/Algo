package Exo;

import java.util.Scanner;

public class Exercice_14 {
    public static void main(String[] args) {

        // Ajouter une validation de type de donnees pour que le code PIN saisi ne soit compose que de chiffres

        var input = new Scanner(System.in);

        var codePIN ="";

        System.out.println("Veuillez definir un code PIN a 4 chiffres :");

        while (true) {
            System.out.print("Code PIN : ");

            codePIN = input.nextLine();

            if (codePIN.length() == 4)
            {
                System.out.println("Code PIN defini avec succes");
                break;
            }
            else
            {
                System.out.println("Erreur: le code PIN doit etre compose de 4 chiffres.");
            }
        }

        System.out.println("** Telephone verrouille **");

        var codeATester = "";

        while (true)
        {
            System.out.println("Entrez votre code PIN pour deverouiller l'appareil :");

            codeATester = input.nextLine();

            if (!codeATester.equals(codePIN))
            {
                System.out.println("Code PIN errone, veuillez recommencer.");
                break;
            }
            System.out.println("Bravo, appareil deverouille !");
        }
    }
}
