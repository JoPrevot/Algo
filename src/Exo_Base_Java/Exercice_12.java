package Exo_Base_Java;

import java.util.Scanner;

public class Exercice_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entrez n'importe quel nombre : ");

        int number = input.nextInt();

        System.out.println("Les dix nombres suivants sont :");

        for(var i = number +1 ; i <= number + 10 ; i++) {

            System.out.printf(" %d \n",i);

            }
        }
   }

