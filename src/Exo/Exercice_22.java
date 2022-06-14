package Exo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercice_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] table =
                {"christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"};

        var sumGmail = 0 ;
        var sumYahoo = 0;
        var sumHotmail = 0;
        String currentMail;

        for (int i = 0; i < table.length; i++) {

            currentMail = table[i];

            if (currentMail.contains("gmail")) {
                sumGmail = sumGmail + 1;

            } else if (currentMail.contains("yahoo")) {
                sumYahoo = sumYahoo + 1;

            } else if (currentMail.contains("hotmail")) {
                sumHotmail = sumHotmail + 1;
            }
        }

            System.out.printf("Gmail : %d \n", sumGmail);
            System.out.printf("Yahoo : %d \n", sumYahoo);
            System.out.printf("Hotmail : %d \n", sumYahoo);

            // Pourcentage

        double gmailPercent = (sumGmail/(double)table.length)*100 ;
        double yahooPercent = (sumYahoo/(double)table.length)*100 ;
        double hotmailPercent = (sumHotmail/(double)table.length)*100 ;

        System.out.println("Le pourcentage d'adresse email en gmail est de : " +gmailPercent +" % "
                +" celui de Yahoo est de " +yahooPercent +" %"
                +" et celui de Hotmail est de " +hotmailPercent +" %");

    }
}
