package Exo;

import java.util.Scanner;

public class Exercice_11 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Entrez n'importe quel nombre : ");

        long factorielle = input.nextLong();

        long result = 1;

        if(factorielle < 0)
        {
            System.out.println("Il n'y a pas de factorielle");
        }
        else if (factorielle == 0)

        {
            System.out.printf("Le résultat est %d", result);
        }

        else
        {
        for(long i = 1; i <= factorielle ; i = i + 1)
        {
            result = (result * i);
        }
            System.out.printf("La factorielle de %d est %d",factorielle,result);
        }
    }
}
