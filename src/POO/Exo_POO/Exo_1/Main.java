package POO.Exo_POO.Exo_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

//    Personne personne = new Personne();

//        System.out.println("Veuillez saisir un prenom : ");
//
//        personne.firstName = input.nextLine();
//
//        System.out.println("Veuillez saisir un nom : ");
//
//        personne.lastName = input.nextLine();
//
//        System.out.println("Veuillez saisir votre pays : ");
//
//        personne.country = input.nextLine();
//
//        System.out.println("Etes vous marrie ?");
//
//        String marriedQuestion = input.nextLine();
//
//        if (marriedQuestion.equalsIgnoreCase("Oui"))
//        {
//            personne.married = true;
//        }
//        else
//        {
//            personne.married  = false;
//        }
//
//        System.out.println("Combien d'enfants avez-vous ?");
//
//        personne.numberChildren = input.nextByte();
//
//        System.out.printf("Vous etes %s, vous venez de %s.\n",
//                personne.nomComplet(),personne.country);
//
//        System.out.println("Vous "+(personne.married?"etes marie":"n'etes pas marie")
//                +" et vous avez " +personne.numberChildren +" enfant.");

        Personne personne = new Personne("","","",false, (byte) 0);

        System.out.printf("Vous vous appelez %s %s. \n", personne.getFirstName(),personne.getLastName());
        System.out.printf("Vous habitez en %s. \n",personne.getCountry());
        System.out.println("Vous "+(personne.getMarried()?"etes marie":"n'etes pas marie"));
        System.out.printf("Vous avez %d enfants.",personne.getNumberChildren());
        System.out.println("");

        System.out.println("Veuillez saisir un prenom : ");

        personne.setFirstName(input.nextLine());

        System.out.println("Veuillez saisir un nom : ");

        personne.setLastName(input.nextLine());

        System.out.println("Veuillez saisir votre pays : ");

        personne.setCountry(input.nextLine());

        System.out.println("Etes vous marie ?");

        String marriedQuestion = input.nextLine();

        if (marriedQuestion.equalsIgnoreCase("Oui"))
        {
            personne.setMarried(true);
        }
        else
        {
            personne.setMarried(false);
        }

        System.out.println("Combien d'enfants avez-vous ?");

        personne.setNumberChildren(input.nextByte());

        System.out.printf("Vous vous appelez %s %s. \n", personne.getFirstName(),personne.getLastName());
        System.out.printf("Vous habitez en %s. \n",personne.getCountry());
        System.out.println("Vous "+(personne.getMarried()?"etes marie":"n'etes pas marie"));
        System.out.printf("Vous avez %d enfants.",personne.getNumberChildren());


    }
}
