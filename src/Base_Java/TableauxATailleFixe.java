package Base_Java;

public class TableauxATailleFixe {
    public static void main(String[] args) {

        float [] notesPhys = {17.5F,18.2F,19,9,12};     // Ici le tableau va être de taille 5

        float [] notesMaths = new float [5];        // Le tableau va contenir 5 éléments de valeur 0.0

        // Acces aux éléments du tableau sans boucle

        System.out.println(notesPhys[0]);
        System.out.println(notesPhys[1]);
        System.out.println(notesPhys[2]);
        System.out.println(notesPhys[3]);
        System.out.println(notesPhys[4]);

        // Acces au tableau avec une boucle

        for(int i = 0; i <= notesPhys.length - 1; i++)
            System.out.println(notesPhys[i]);

        // Calcul de la moyenne des notes

        float sommeDesNotes = 0;

        for(int i = 0; i <= notesPhys.length - 1; i++)
        {
            // i = 0, sommeDesNotes = 0, notesPhys [0] = 17,5
            // Donc sommeDesNotes = sommeDesNotes + notesPhys [0] = 17,5

            // i = 1, notesPhys [0] = 18,2
            // sommeDesNotes = sommeDesNotes + notesPhys [1] = 17,5 + 18,2 = 35,7

            sommeDesNotes = sommeDesNotes + notesPhys[i];
        }
        System.out.printf("Somme des notes = %f \n",sommeDesNotes);

        float moyenneDesNotes = sommeDesNotes / notesPhys.length;

        System.out.printf("Moyenne des notes = %f",moyenneDesNotes);
    }
}
