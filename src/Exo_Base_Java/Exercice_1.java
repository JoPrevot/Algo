package Exo_Base_Java;

public class Exercice_1 {
    public static void main(String[] args) {
        byte age=12;

        if (age>=7 && age<=9)
        {System.out.println("Poussin");}

        else if (age>=10 && age<=11)
        {System.out.println("Pupille");}

        else if (age>=12 && age<=13)
        {System.out.println("Benjamin");}

        else if (age>=14 && age<=15)
        {System.out.println("Minime");}

        else if (age>=16 && age<=17)
        {System.out.println("cadet");}

        else {System.out.println("Vous n'appartenez a aucune categorie");}

    }
}
