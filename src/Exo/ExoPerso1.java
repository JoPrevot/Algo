package Exo;

import java.util.Scanner;

public class ExoPerso1 {
    public static void main(String[] args) {

        //    Écrire un programme demandant à l’utilisateur de saisir une valeur numérique positive n
        //    et affichant toutes les valeurs n, n−1, …, 2, 1, 0.

        Scanner input = new Scanner(System.in);

        System.out.println("Entrez n'importe quel nombre : ");

        int n = input.nextInt();

        if(n<=0)
        {
            System.out.println("Le nombre choisi doit etre positif et different de zero !");
        }
        else
        {
            for (int i = n ; i >= 0; i--)
            System.out.printf("Il reste %d secondes \n",i);
        }

    }
}
