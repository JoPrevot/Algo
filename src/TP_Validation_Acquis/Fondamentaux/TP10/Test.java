package TP_Validation_Acquis.Fondamentaux.TP10;

public class Test {
    public static void main(String[] args) {

        Tirelire tirelire = new Tirelire(100);


        System.out.println(tirelire.getMontant());

        double montantTirelire = tirelire.getMontant();

        UseTirelire.afficher(montantTirelire);


//
//        UseTirelire.secouer(tirelire.getMontant());
//
////        UseTirelire.remplir(tirelire.getMontant(),100);
//
////        UseTirelire.vider(tirelire.getMontant());

    }
}
