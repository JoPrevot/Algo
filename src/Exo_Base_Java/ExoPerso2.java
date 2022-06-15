package Exo_Base_Java;

public class ExoPerso2 {

    public static void main(String[] args) {

//        Écrire un programme qui affiche successivement les factorielles des N premiers entiers positifs, on utilisera une boucle for.
//        La valeur N sera une constante du programme, déclarée et initialisée dans main comme suit :
//        final int N = 20;
//        On doit obtenir un affichage du genre :

        final int n = 20 ;
        var tmp =1;

        for (int i = 1; i <= n; i++)
        {
            tmp = tmp * i;
            System.out.printf("%d! = %d \n",i,tmp);
        }
    }
}
