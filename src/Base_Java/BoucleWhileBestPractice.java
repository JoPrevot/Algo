package Base_Java;

import java.util.Scanner;

public class BoucleWhileBestPractice {
    public static void main(String[] args) {

        // Objectif : On veut débloquer le code PIN d'un téléphone

        var input = new Scanner(System.in);

        var codePIN = "";

        System.out.println("Veuillez definir un code PIN a 4 chiffres :");

        // Pour éviter de dupliquer les conditions, on va dire que la cond du while est true
        // Cela mène a une boucle infinie, il faut donc l'arrêter <break> quand celle-ci est validée
        // <break> arrête la boucle dans laquelle il est

        while (true) {
            System.out.print("Code PIN : ");

            codePIN = input.nextLine();

            if (codePIN.length() != 4)
            {
                System.out.println("Erreur: le code PIN doit etre compose de 4 chiffres.");
            }
            else
            {
                System.out.println("Code PIN defini avec succes");
                break;
            }
        }

        System.out.println("** Telephone verrouille **");

        var codeATester = "";

        while (true)
        {
            System.out.println("Entrez votre code PIN pour deverouiller l'appareil :");

            codeATester = input.nextLine();

            if (codeATester.equals(codePIN))
            {
                System.out.println("Bravo, appareil deverouille !");
                break;
            }
            else
            {
                System.out.println("Code PIN errone, veuillez recommencer.");
            }
        }
    }
}
