package POO;

public class Rectangle2 {

    // Une donnée <private> restreint l'accès à cette donnée (en lecture et en écriture)
    // et n'est accessible que dans la classe

    private double longueur;
    private double largeur;

    // Pour accéder aux données <private> :

    // Accesseur ou Getter : ce sont des méthodes qui donnent un accès en lecture aux attributs privés

    public double getLongueur()
    {
        return longueur;
    }

    public double getLargeur()
    {
        return largeur;
    }

    // Manipulateur ou Setter : méthodes qui donnent la possibilité de modifier des attributs privés

    // <this> nous permet d'éviter le shadowing (masquage) : c'est le fait qu'un paramètre de fonction
    // empêche la fonction de voir l'attribut ayant le même nom

    public void setLongueur(double longueur)
    {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur)
    {
        this.largeur = largeur;
    }

    // Méthode

    double calculDeLaSurface()
    {
        return longueur * largeur;
    }

    double calculDuPerimetre()
    {
        return 2 * (longueur + largeur);
    }
}
