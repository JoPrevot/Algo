package Cours;

import java.util.Scanner;

public class TableauATailleFixeSuite {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.println("Combien de notes voulez-vous inserer ?");

        var notesAInserer=input.nextInt();

        float [] notesMaths = new float[notesAInserer];

        for(int i = 0; i <= notesMaths.length - 1; i++)
        {
            System.out.printf("Notes [%d] : ",i);
            notesMaths[i]= input.nextFloat();       // On rentre la note i dans le tableau à chaque incrémentation
        }

        float sommeDesNotes = 0;

        for(int i = 0; i <= notesMaths.length - 1; i++)
        {
            sommeDesNotes = sommeDesNotes + notesMaths [i];
        }
        float moyenne = sommeDesNotes/notesMaths.length;
        System.out.printf("La somme des notes est de : %.1f\n",sommeDesNotes);
        System.out.printf("La moyenne des notes est de : %.2f",moyenne);

    }
}
