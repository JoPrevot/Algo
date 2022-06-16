package inheritance;

// Surcharge ou Overloading : avoir plusieurs méthodes de même nom, mais différentes signatures

// Redéfinition ou overriding : le fait de fournir une implémentation d'une méthode déjà existante dans
// une classe parent

public class Main {
    public static void main(String[] args) {

        Guerrier chris = new Guerrier("Christian",400,"M16");
        Guerrier mansour = new Guerrier("Mansour",900,"Lance-pierre");

        Voleur jean = new Voleur("Jean",1000,"Main");

        Magicien nouha = new Magicien("Nouha",100,"complète");

        Sorcier morgane = new Sorcier("Morgane",200,"trop cuite","de marche");

        chris.rencontrer();
        jean.rencontrer();
        nouha.rencontrer();
        morgane.rencontrer();

        System.out.println(chris);
        System.out.println(mansour);
        System.out.println(jean);
        System.out.println(nouha);
        System.out.println(morgane);


    }
}
