package Exo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_15 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        // Tableau 1

        System.out.println("Combien de notes voulez-vous insérer dans le tableau 1 ?");

        var notesTableau1=input.nextInt();

        float[] tableau1=new float[notesTableau1];

        for (int i = 0; i <= tableau1.length - 1; i++)
        {
            {
                System.out.printf("Note %d :",i);
                notesTableau1 =input.nextInt();
            }
        }

        System.out.print(Arrays.toString(Ta));

    }
}
