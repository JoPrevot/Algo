package Cours;

public class StringMethods {
    public static void main(String[] args) {

        String nom = "Jordan";

        // <variable.charAt()> retourne le caractère à la position passé en argument

        System.out.println(nom.charAt(2));

        // Parcourir un string caractère par caractère

        System.out.println("Iteration sur les caracteres \n ==================");

        for (int i = 0; i < nom.length(); i++)
        {
            System.out.println(nom.charAt(i));
        }

        // <variable.indexOf()> retourne la première occurence du caractère mentionné en argument

        System.out.println(nom.indexOf('a'));

        // Remplacement des caractères avec <variable.replace()>

        String nom2 = "Abracadabra";

        System.out.println(nom2.replace('a','o'));

        // Extraire une sous-chaine : ici on définit un intervalle [valeur1,valeur2[

        String chaine = "Christian Lisangola";

        String chaine2 = chaine.substring(0,5);

        System.out.println(chaine2);

    }
}
