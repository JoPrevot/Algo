package Base_Java;

import java.util.Scanner;

public class BoucleWhileSuite {
    public static void main(String[] args) {

        // Objectif : On veut débloquer le code PIN d'un téléphone

        var input = new Scanner(System.in);

        var codePIN = "";

        // On veut définir un code PIN à 4 chiffres

        System.out.println("Veuillez definir un code PIN a 4 chiffres :");

        // on précise que la longueur du code PIN doit être 4

        while (codePIN.length() != 4) {
            System.out.print("Code PIN : ");

            codePIN = input.nextLine();

            // On regarde si il y  a une erreur ou si c'est bon

            if (codePIN.length() != 4)
            {
                System.out.println("Erreur: le code PIN doit etre compose de 4 chiffres.");
            }
            else
            {
                System.out.println("Code PIN defini avec succes");
            }
        }

        System.out.println("** Telephone verrouille **");

        var codeATester = "";

        // Pour la condition, on utilise !<cond1>.equals<cond2> plutôt que != (car les conditions sont en String)

        while (!codeATester.equals(codePIN))
        {
            System.out.println("Entrez votre code PIN pour deverouiller l'appareil :");

            codeATester = input.nextLine();

            // On rajoute une condition SI les codes ne correspondent pas (erreur)

            if (codeATester.equals(codePIN))
            {
                System.out.println("Bravo, appareil deverouille !");
            }
                else
                {
                    System.out.println("Code PIN errone, veuillez recommencer.");
                }
        }
    }
}
