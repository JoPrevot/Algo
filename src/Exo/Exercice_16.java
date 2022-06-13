package Exo;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_16 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.println("Veuillez saisir le nombre de donnees que va contenir votre tableau : ");

        int number = input.nextInt();

        int [] table = new int [number];

        int note;
        int sum = 0;

        for (int i = 0; i < table.length; i++)
        {
            System.out.printf("Veuillez saisir la note %d : ",i+1);
            note = input.nextInt();
            table[i]=note;
        }

        System.out.println(" ");
        System.out.print(Arrays.toString(table));
        System.out.println(" ");

        System.out.println("Veuillez entrer une note a rechercher dans le tableau : ");
        int noteToSearch = input.nextInt();

        for (int i = 0; i < table.length; i++)
        {
            if (noteToSearch == table[i])
            {
                sum = sum +1;
            }

        }
        if (sum == 0)
        {
            System.out.println("la note recherchee n'existe pas.");
        }
        else {
            System.out.printf("La note recherchee est dans le tableau %d fois.",sum);
        }
    }
}
