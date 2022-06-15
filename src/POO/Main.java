package POO;

public class Main {
    public static void main(String[] args) {

        Rectangle terrain = new Rectangle();

        System.out.println("Etat initial de l'objet apres creation\n======================================");
        System.out.println("La longueur : "+terrain.longueur);
        System.out.println("La largeur : "+terrain.largeur);

        System.out.println("Etat  de l'objet apres avoir fourni des valeurs\n" +
                "================================================");

        terrain.longueur = 500;
        terrain.largeur = 350;

        System.out.println("La longueur : "+terrain.longueur);
        System.out.println("La largeur : "+terrain.largeur);
        System.out.println("Surface : "+terrain.calculDeLaSurface());
        System.out.printf("Perimetre : %.1f",terrain.calculDuPerimetre());

    }
}
