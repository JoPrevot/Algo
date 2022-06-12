package Exo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_15 {
    public static void main(String[] args) {

        // On va demander à l'utilisateur combien veut-il de données dans les 3 tableaux

        var input = new Scanner(System.in);

        System.out.println("Combien de notes voulez-vous inserer dans le tableau 1 ?");

        var NbTable1=input.nextInt();

        System.out.println("Combien de notes voulez-vous inserer dans le tableau 2 ?");

        var NbTable2=input.nextInt();

        System.out.println("Combien de notes voulez-vous inserer dans le tableau 3 ?");

        var NbTable3=input.nextInt();

        // On les crée ensuite selon les nombres choisis précédemment

        int[] table1=new int[NbTable1];
        int[] table2=new int[NbTable2];
        int[] table3=new int[NbTable3];

        // On définit les variables des nombres ainsi qu'une somme associée à chaque tableau

        int valueTable1;
        int SumT1 = 0;
        int valueTable2;
        int SumT2 = 0;
        int valueTable3;
        int SumT3 = 0;

        // On demande ensuite à l'utilisateur de rentrer des notes pour chaque tableau

        // Une boucle IF va déterminer si le nombre est multiple de 3, et l'ajoutera à la somme des multiple de 3

        for (int i = 0; i <= table1.length - 1; i++)
        {
            {
                System.out.printf("Tableau 1 Note %d : ",i+1);
                valueTable1 =input.nextInt();
            }
            table1[i]=valueTable1;
            if (valueTable1 % 3 == 0)
            {
                SumT1 = SumT1 + valueTable1;
            }
        }
        for (int i = 0; i <= table2.length - 1; i++)
        {
            {
                System.out.printf("Tableau 2 Note %d : ",i+1);
                valueTable2 =input.nextInt();
            }
            table2[i]=valueTable2;
            if (valueTable2 % 3 == 0)
            {
                SumT2 = SumT2 + valueTable2;
            }
        }
        for (int i = 0; i <= table3.length - 1; i++)
        {
            {
                System.out.printf("Tableau 3 Note %d : ",i+1);
                valueTable3 =input.nextInt();
            }
            table3[i]=valueTable3;
            if (valueTable3 % 3 == 0)
            {
                SumT3 = SumT3 + valueTable3;
            }
        }

        // Affichage de tous les résultats attendus :

        System.out.println("Tableau 1 :");
        System.out.print(Arrays.toString(table1));
        System.out.println(" ");

        System.out.println("Tableau 2 :");
        System.out.print(Arrays.toString(table2));
        System.out.println(" ");

        System.out.println("Tableau 3 :");
        System.out.print(Arrays.toString(table3));
        System.out.println(" ");

        int sommeMultiple = SumT1 + SumT2 + SumT3;

        System.out.printf("La somme de tous les elements multiples de 3 des 3 tableaux est de : %d", sommeMultiple);

    }
}
