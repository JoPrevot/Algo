package Base_Java;

import java.util.Scanner;

public class BoucleFor {
    public static void main(String[] args) {

        // Afficher tous les nombres allant de 1 à 10 à la puissance 2

        System.out.println(Math.pow(1,2));
        System.out.println(Math.pow(2,2));     //  1 + 1 = 2
        System.out.println(Math.pow(3,2));     //  2 + 1 = 3
        System.out.println(Math.pow(4,2));     //  3 + 1 = 4

        // Pour i allant de 1 à 10 :
        //      Math.pow(i,2) => Math.pow(1,2)
        // i = i + 1  on incrémente avec un pas de 1
        // Fin pour

        System.out.println("Utilisation de la boucle for\n============================");
        for (int i = 1; i <= 10; i = i + 1)
        {
            System.out.println(Math.pow(i,2));
        }

        // On souhaite afficher la table de multiplication d'un chiffre

        System.out.println("Table multiplication \n ============================");

        var input = new Scanner(System.in);

        System.out.print("Entrez le nombre dont vous voulez voir la table de multiplication : ");

        var nombre = input.nextInt();

        for(int i = 1 ; i <= 12 ; i++)
        {
            System.out.println(nombre +" X " +i +" = " + nombre*i);
            System.out.printf("%d x %d = %d\n",nombre,i,(nombre*i));
        }

        // On souhaite afficher la table de multiplication d'un chiffre en choissisant le multiplicateur du début et de fin

        System.out.println("Table multiplication V2\n========================");

        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");

        var nombre2=input.nextInt();

        System.out.print("Debut : ");

        var nombreDebut=input.nextInt();

        System.out.print("Fin : ");

        var nombreFin=input.nextInt();

        for(int i = nombreDebut; i <= nombreFin ; i += 1)
        {
            System.out.printf("%d x %d = %d\n",nombre2,i,(nombre2*i));
        }
    }
}
