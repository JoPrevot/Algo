package Base_Java;

import java.util.Arrays;

public class ArraysString {
    public static void main(String[] args) {

        int[] nombres=new int[3];
        nombres[0]=12;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println("Affichage tableau nombre1 :"+ Arrays.toString(nombres));

        int[] nombres2=nombres;
        nombres2[0]=33;

        // Ici, nombres2 renvoit les mêmes cellules que nombres
        // Si on change une cellule d'un tableau, cela change aussi pour l'autre tableau

        System.out.println("Affichage tableau nombre1 après création de nombre 2 :"+ Arrays.toString(nombres));

        if(nombres==nombres2){
            System.out.println("Les 2 tableau pointent vers un même tableau");
        }

        int[] nombres3=new int[3];
        nombres3[0]=33;
        nombres3[1]=15;
        nombres3[2]=20;

        // Ici, les tableaux ont les mêmes valeurs, mais ce ne sont pas les mêmes cellules
        // -> Pas la même ref mémoire !

        System.out.println("Affichage nombre 3 : "+ Arrays.toString(nombres3));

        if(nombres==nombres3){
            System.out.println("nombre et nombre3 pointent vers le même tableau");
        }else{
            System.out.println("nombre et nombre3 ne pointent pas vers le même tableau");

            // L'affichage est faux car il ne s'agit pas de string pour les valeurs, il s'agit de table
        }

    }
}
