package Cours;

public class Variable {
    public static void main(String[] args) {

        // variable/fonction : camelCase
        // classe/string : PascalCase

        // Selon la donnée numérique, le type de données est différent

        // Ici pour l'âge, le type adapté est byte (on utilise moins de mémoire de ce fait)

        byte age=18; //la variable ne peut stocker que des entiers.

        // Calcul à partir d'un rectangle

        int longueur=50;
        int largeur=25;
        int surface =longueur*largeur;
        int perimetre=2*(longueur+largeur);
        System.out.println(surface);
        System.out.println(perimetre);

        // calcul de la vitesse moyenne en MRU

        float distanceParcourue=90.6F;
        float temps=12.345F;
        double vitesseMoyenne=distanceParcourue/temps;

        // tous les floats sont des doubles donc ici pas d'erreur sur lr résultat vitesse
        // Mais si on avait eu l'inverse, erreur car tous les double ne sont pas des floats

        // Calcul d'une somme de nombres : on met un F après la variable pour bien définir le type comme <float>
        float prix=150.5F;

        // Chaîne de caractères et caractères: pour du texte, on met toujours des doubles guillemets

        String prenom="Morgane"; //chaîne de caractères
        char gendre='M';

    }
}
