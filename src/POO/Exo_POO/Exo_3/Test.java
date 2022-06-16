package POO.Exo_POO.Exo_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Camion 1

        Camion camion1 = new Camion(0,0);

//        camion1.setMatricule(camion1.getMatricule()+1);

        System.out.println("Entrez l'année du camion 1 :");

        camion1.setYear(input.nextInt());

        System.out.println("Entez le prix du camion 1: ");
        camion1.setPrice(input.nextInt());

        System.out.println(camion1);

        camion1.start();
        camion1.accelerate();

        // Camion 2

        Camion camion2 = new Camion(2000,5500);

//        camion2.setMatricule(camion1.getMatricule()+1);
//
//        System.out.println("Entrez l'annee du camion 2 :");
//
//        camion2.setYear(input.nextInt());
//
//        System.out.println("Entrez le prix du camion 2 : ");
//        camion2.setPrice(input.nextInt());

        System.out.println(camion2);

        camion2.start();
        camion2.accelerate();

        // Voiture 1

        Voiture voiture1 = new Voiture(0,0);

//        voiture1.setMatricule(voiture1.getMatricule()+1);

        System.out.println("Entrez l'annee de la voiture 1 :");

        voiture1.setYear(input.nextInt());

        System.out.println("Entrez le prix de la voiture 1 : ");
        voiture1.setPrice(input.nextInt());

        System.out.println(voiture1);

        voiture1.start();
        voiture1.accelerate();

        System.out.println("");
        System.out.println("Recapitulatif des vehicules");
        System.out.println("");
        System.out.println(camion1);
        System.out.println(camion2);
        System.out.println(voiture1);


    }
}
