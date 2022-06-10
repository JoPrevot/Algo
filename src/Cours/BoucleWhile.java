package Cours;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {

        // Objectif : On veut débloquer le code PIN d'un téléphone

        var input = new Scanner(System.in);

        // On définit le code PIN de base

        System.out.println("Veuillez definir un code PIN :");

        var codePIN = input.nextInt();

        // Le téléphone est dans un premier temps vérouillé

        System.out.println("** Telephone verrouille **");

        // Il s'agit du code que l'on va rentrer pour dévérouiller le tel, ici on le définit simplement

        int codeATester = 0;

        // Tant que le code entré est != du code PIN, on va effectuer les actions de la boucle

        while (codeATester != codePIN)
        {
            System.out.println("Entrez votre code PIN pour deverouiller l'appareil :");
            codeATester= input.nextInt();
        }
    }
}
