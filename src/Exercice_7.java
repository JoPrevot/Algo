import java.util.Scanner;

public class Exercice_7 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Entrez n'importe quel nombre entier: ");

        int nombre = input.nextInt();

        System.out.printf("Le nombre choisi est %d ", nombre);

        if (nombre == 0){System.out.print(", il est nul");}

        else if (nombre % 2 == 0) {System.out.print(", il est pair");}

        else {System.out.print(",il est impair");}

        if (nombre > 0) {System.out.print(" et il est positif.");}

        else if (nombre < 0) {System.out.print(" et il est negatif.");}

        else {System.out.print(" et il n'est ni positif ni negatif.");}

    }
}