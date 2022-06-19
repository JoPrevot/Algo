package TP_Validation_Acquis.ProOrienteObjet.TP11;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Auteur author1 = new Auteur("Victor Hugo",true);
        Auteur author2 = new Auteur("Jean Ferrat",false);


        Oeuvre livre1 = new Oeuvre("Les miserables","Victor Hugo","francais");
        Oeuvre livre2 = new Oeuvre("Le dernier jour d'un condamne","Victor Hugo","anglais");
        Oeuvre livre3 = new Oeuvre("Aimer a perdre la raison","Jean Ferrat");

        System.out.println(livre1.toString());
        System.out.println(livre2.toString());

        Exemplaire exemplaire1 = new Exemplaire(livre1);

        Exemplaire exemplaire2 = new Exemplaire(exemplaire1);

        Bibliotheque biblio1 = new Bibliotheque("Cambrai");

        System.out.println(biblio1.getNbExemplaires());

        biblio1.stocker(exemplaire1,3);

        biblio1.stocker(livre2,1);

        biblio1.stocker(livre3,2);

        System.out.println(biblio1.getNbExemplaires());

        System.out.println(biblio1.listerExemplaires(""));

        biblio1.offre();



    }
}
