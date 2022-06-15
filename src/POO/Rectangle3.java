package POO;

public class Rectangle3 {
    private double longueur;
    private double largeur;

    // Requirement pour créer un constructeur :
    // avoir une méthode <public>
    // il doit avoir le même nom que la classe
    // on donne les paramètres que l'on veut initialiser

    public Rectangle3 (double longueur,double largeur)
    {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Surcharge : possibilité d'avoir au sein d'une classe  plusieurs méthodes (constructeur) avec
    // le même nom mais différentes signatures

    public Rectangle3 ()
    {
        longueur = 10;
        largeur = 5;
    }

    public double getLongueur()
    {
        return longueur;
    }

    public double getLargeur()
    {
        return largeur;
    }

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
