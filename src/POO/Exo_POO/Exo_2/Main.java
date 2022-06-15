package POO.Exo_POO.Exo_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Patient patient1 = new Patient();

        System.out.println("Quel est le nom du patient ?");

        patient1.setLastName(input.nextLine());

        System.out.println("Quel est le prenom du patient ?");

        patient1.setFirstName(input.nextLine());

        System.out.println("Entrez le poids du patient (en kg) :");

        patient1.setWeight(input.nextDouble());

        System.out.println("Entrez la taille du patient (en m) :");

        patient1.setHeight(input.nextDouble());

        // Affichage du patient

        System.out.println("===========================\n");
        System.out.println("Recapitulatif du patient :");
        System.out.println("===========================\n");

        System.out.printf("Nom du patient : %s\n", patient1.getLastName());
        System.out.printf("Prenom du patient : %s\n", patient1.getFirstName());
        System.out.printf("Poids : %.1f kg\n",patient1.getWeight());
        System.out.printf("Taille : %.2f m\n",patient1.getHeight());
        System.out.printf("IMC : %.2f",patient1.calculIMC());

    }
}
