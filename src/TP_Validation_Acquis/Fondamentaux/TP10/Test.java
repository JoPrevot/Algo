package TP_Validation_Acquis.Fondamentaux.TP10;

public class Test {
    public static void main(String[] args) {

        Tirelire tirelire = new Tirelire(100);

        System.out.println(tirelire.getSolde());

        double montantTirelire = tirelire.getSolde();

        tirelire.afficher();

        tirelire.secouer();

        tirelire.remplir(50);

        tirelire.vider();

        tirelire.afficher();

        tirelire.remplir(150);

        System.out.println("");

        tirelire.puiser(50);

        System.out.println("");

        System.out.println(tirelire.calculerSolde(150));

        System.out.println(tirelire.calculerSolde(75));



//        UseTirelire.secouer(tirelire.getMontant());

//
////        UseTirelire.remplir(tirelire.getMontant(),100);
//
//        System.out.println(UseTirelire.vider(tirelire.getMontant()));
//
//        System.out.println(tirelire.getMontant());
    }
}
