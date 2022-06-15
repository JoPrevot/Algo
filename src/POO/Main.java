package POO;

public class Main {
    public static void main(String[] args) {

        // Rectangle

//        Rectangle terrain = new Rectangle();
//
//        System.out.println("Etat initial de l'objet apres creation\n======================================");
//        System.out.println("La longueur : "+terrain.longueur);
//        System.out.println("La largeur : "+terrain.largeur);
//
//        System.out.println("Etat  de l'objet apres avoir fourni des valeurs\n" +
//                "================================================");
//
//        terrain.longueur = 500;
//        terrain.largeur = 350;
//
//        System.out.println("La longueur : "+terrain.longueur);
//        System.out.println("La largeur : "+terrain.largeur);
//        System.out.println("Surface : "+terrain.calculDeLaSurface());
//        System.out.printf("Perimetre : %.1f",terrain.calculDuPerimetre());

        // Rectangle2 - Ajout des Getter et Setter

//        Rectangle2 terrain = new Rectangle2();
//
//        System.out.println("Etat initial de l'objet apres creation\n======================================");
//        System.out.println("La longueur : "+terrain.getLongueur());
//        System.out.println("La largeur : "+terrain.getLargeur());
//
//        System.out.println("Etat  de l'objet apres avoir fourni des valeurs\n" +
//                "================================================");
//
//        terrain.setLongueur(500);
//        terrain.setLargeur(350);
//
//        System.out.println("La longueur : "+terrain.getLongueur());
//        System.out.println("La largeur : "+terrain.getLargeur());
//        System.out.println("Surface : "+terrain.calculDeLaSurface());
//        System.out.printf("Perimetre : %.1f",terrain.calculDuPerimetre());

        // Rectangle3 - Ajout d'un constructeur

        Rectangle3 terrain = new Rectangle3(500,350);

        System.out.println("Etat initial de l'objet apres creation\n======================================");
        System.out.println("La longueur : "+terrain.getLongueur());
        System.out.println("La largeur : "+terrain.getLargeur());

        System.out.println("Etat  de l'objet apres avoir fourni des valeurs\n" +
                "================================================");

        terrain.setLongueur(500);
        terrain.setLargeur(350);

        System.out.println("La longueur : "+terrain.getLongueur());
        System.out.println("La largeur : "+terrain.getLargeur());
        System.out.println("Surface : "+terrain.calculDeLaSurface());
        System.out.printf("Perimetre : %.1f",terrain.calculDuPerimetre());
        System.out.println("");

        Rectangle3 rect = new Rectangle3();
        System.out.println(rect.getLargeur());
        System.out.println(rect.getLongueur());


    }
}
