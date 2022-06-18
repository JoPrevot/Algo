package TP_Validation_Acquis.Fondamentaux.TP10;

public interface UseTirelire {


    static double afficher(double montant)
    {
        if(montant == 0)
        {
            System.out.println("Vous etes sans le sou !");
        }
        else
        {
            System.out.printf("Vous avez %.2f euros dans votre tirelire",montant);
        }
        return montant;
    }

//    public static void secouer(double montant)
//    {
//        if(montant > 0)
//        {
//            System.out.println("\nBing Bing \n");
//        }
//    }

//    double remplir(double ajoutMontant)
//    {
//        if(ajoutMontant > 0)
//        {
//            double solde = this.getMontant();
//            solde = solde + ajoutMontant;
//            System.out.printf("Le nouveau montant est %d : ",solde);
//
//        }
//        else {
//            System.out.println("Le montant ajouté doit être positif.");
//        }
//        return solde;
//    }
//

}
