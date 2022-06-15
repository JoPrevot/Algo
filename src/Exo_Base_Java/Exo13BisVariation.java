package Exo_Base_Java;

import java.util.Scanner;

public class Exo13BisVariation {
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
        int totalAttempt = 5;

        for (int i = totalAttempt; i >= 0; i --)
        {
            System.out.println("Entrez votre email");

            EmailATester = input.nextLine();

            System.out.println("Entrez votre mot de passe");

            passwordATester = input.nextLine();

            if ((!EmailATester.equals(email)) || (!passwordATester.equals(password)))
            {
                System.out.printf("Identifiants incorrect, il vous reste %d essais : \n",i);
            }
            else
            {
                System.out.println("Bienvenu dans votre espace client.");
                break;
            }

            if(i == 0)
            {
                System.out.printf("Vous avez saisi des mauvais identifiants %d fois, votre compte est bloque.",totalAttempt);
                break;
            }
        }
    }
}
