package TP_Validation_Acquis.Fondamentaux;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Veuillez rentrer un nombre entier : ");

        number = input.nextInt();

        var numberAbs = Math.abs(number);

        String numberStr = Integer.toString(numberAbs);

        var numberInv = "";

        for (int i = numberStr.length()-1; i >= 0 ; i--)
        {
            numberInv += numberStr.charAt(i);
        }

        if (number > 0)
        {
            System.out.printf("Le nombre rentre est %d, son inverse est %s",number,numberInv);
        }
        else if (number < 0)
        {
            System.out.printf("Le nombre rentre est %d, son inverse est -%s",number,numberInv);
        }
    }
}
