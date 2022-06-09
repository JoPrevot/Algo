import java.util.Scanner;

public class Exercice_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entrez n'importe quel nombre : ");

        int number = input.nextInt();

        var result = number;

        for(var i = 1; i <= 10; i++) {
            result = number + i;
            System.out.printf("Les dix nombres suivants sont : %d \n",result);
        }
        }
   }

