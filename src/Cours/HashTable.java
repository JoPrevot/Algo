package Cours;

import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {

        HashMap<String, String> identity = new HashMap<>(); // On crée une Hmap

        identity.put("nom","Lisangola");                    // On ajoute une clé <nom> et sa valeur
        identity.put("prenom","Christian");

        System.out.println(identity.get("nom"));

        String phrase = "je suis dans une joie immense";

        // Les clés seront des chaines de caractère <Character> et seront représentées en entier <Integer>

        HashMap<Character , Integer> occurenceLettres = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++)
        {
            // On défini une clé à la position i de notre phrase

            char key = phrase.charAt(i);

            // On boucle pour savoir si notre Hmap contient la clé du dessus

            if (occurenceLettres.containsKey(key))
            {
                // Si oui, on rajoute 1 à la valeur précédente du nombre de clés (définie par previousKeyValue)

                int previousKeyValue = occurenceLettres.get(key);

                occurenceLettres.replace(key,previousKeyValue + 1);
            }
            else
            {
                // Si non, on définit le nombre de clé à 1

                occurenceLettres.put(key,1);
            }
        }
        System.out.println(occurenceLettres);

        System.out.printf("Occurence de s : %d",occurenceLettres.get('s'));

    }
}
