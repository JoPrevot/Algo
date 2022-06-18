package TP_Validation_Acquis.Fondamentaux.TP10;

public class Test {
    public static void main(String[] args) {

        Tirelire tirelire = new Tirelire(100);


//        System.out.println(tirelire.getSolde());
//
//        double montantTirelire = tirelire.getSolde();

        System.out.println(tirelire.afficher());

        tirelire.secouer();

        tirelire.remplir(10);

        tirelire.vider();

        System.out.println(tirelire.afficher());

//        UseTirelire.secouer(tirelire.getMontant());

//
////        UseTirelire.remplir(tirelire.getMontant(),100);
//
//        System.out.println(UseTirelire.vider(tirelire.getMontant()));
//
//        System.out.println(tirelire.getMontant());
    }
}
