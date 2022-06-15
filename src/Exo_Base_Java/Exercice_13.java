package Exo_Base_Java;

import java.util.Scanner;

public class Exercice_13 {
    public static void main(String[] args) {

        // On veut demander à l'utilisateur d'entrer une adresse mail et un mdp
        // On lui demande ensuite de rentrer à nouveau ces données
        // Si elles ne correspondent pas aux premières, il doit recommencer
        // Sinon, c'est good

        var input = new Scanner(System.in);

        var email = "";
        var password = "";

        System.out.println("Veuillez définir une adresse mail :");

            System.out.print("Email : ");

            email = input.nextLine();

        System.out.println("Veuillez definir un mot de passe :");

            System.out.print("Mot de passe : ");

            password = input.nextLine();

//        System.out.printf("Email : %s \n MdP : %s",email,password);

        var EmailATester = "";
        var passwordATester = "";

        while(true)
        {
            System.out.println("Entrez votre email");

            EmailATester = input.nextLine();

            System.out.println("Entrez votre mot de passe");

            passwordATester = input.nextLine();

            if ((EmailATester.equals(email)) && (passwordATester.equals(password)))
            {
                System.out.println("Bienvenu dans votre espace client.");
                break;
            }

            System.out.println("Identifiants incorrect, veuillez recommencer :");

        }
    }
}
