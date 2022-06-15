package Base_Java;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Quel est vote nom : ");

        String nom = input.nextLine();

        System.out.print("Quel est votre prénom : ");

        String prenom = input.nextLine();

        System.out.print("Quel est votre genre : ");

        char genre = input.nextLine().charAt(0);

        System.out.print("Quel est votre age : ");

        byte age = input.nextByte();

        System.out.print("Quel est votre poids : ");

        float poids = input.nextFloat();

        System.out.printf("Nom : %s \n Prenom : %s \n Genre : %c \n Age : %d ans \n Poids : %.1f kg",nom,prenom,genre,age,poids);

    }
}
