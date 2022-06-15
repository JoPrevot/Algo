package Base_Java;

public class TableauAPlusieursDimensions {
    public static void main(String[] args) {

        int [][] nombres = {
                {1,2,6,5},
                {2,4,9},
                {7,3}
        };

        // Première ligne du tableau

        System.out.println("Premier tableau \n===================");
        System.out.println(nombres[0][0]);
        System.out.println(nombres[0][1]);
        System.out.println(nombres[0][2]);
        System.out.println(nombres[0][3]);

        // Deuxième ligne du tableau

        System.out.println("Deuxieme tableau \n===================");
        System.out.println(nombres[1][0]);
        System.out.println(nombres[1][1]);
        System.out.println(nombres[1][2]);

        // Affichage avec une boucle FOR

        System.out.println("Affichage avec la boucle for \n============================");

        for (int i = 0; i < nombres.length; i++)
        {
//            System.out.println(Arrays.toString(nombres[i]));  ici on affiche tout d'un coup

            for (int j = 0; j < nombres[i].length; j++)
            {
                System.out.println(nombres[i][j]);
            }
        }

    }
}
