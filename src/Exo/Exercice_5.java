package Exo;

import java.util.Calendar;

public class Exercice_5 {
    public static void main(String[] args) {

        byte ageUtilisateur = 29;

        System.out.println("L'utilisateur a " +ageUtilisateur +" ans .");

        int age = ageUtilisateur;

        Calendar cal = Calendar.getInstance();

        int date = cal.get(Calendar.YEAR);

        int Annee = date - age;

        System.out.println("L'utilisateur est ne en " +Annee);

    }
}
