import java.util.Scanner;

public class Exercice_8 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Entrez n'importe un nombre entier pour a: ");

        int a = input.nextInt();

        System.out.println("Entrez n'importe un nombre entier pour b: ");

        int b = input.nextInt();

        System.out.println("Entrez n'importe un nombre entier pour c: ");

        int c = input.nextInt();

        System.out.printf("L'equation est de la forme %d x^2 + %s x + %d \n" ,a,b,c);

        var Delta = (Math.pow(b,2)-4*a*c);

        System.out.println("Le discriminant de cette équation est : "+Delta);

        if (Delta < 0)
        {System.out.println("L'equation n'a pas de solutions");}
        else if (Delta == 0) {
            var x0 = (-b / (2 * a));
            System.out.println("L'equation a une unique solution qui est : " + x0);
        }
        else {
            var x1 = ((-b-Math.sqrt(Delta))/2*a);
            var x2 = ((-b+Math.sqrt(Delta))/2*a);
            System.out.println("L'équation a deux solutions : "+x1 +" et " +x2);
        }
    }
}
