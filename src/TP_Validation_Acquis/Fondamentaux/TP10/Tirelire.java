package TP_Validation_Acquis.Fondamentaux.TP10;

public class Tirelire {

    private double solde;

    public Tirelire(double solde)
    {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String afficher()
    {
        if (this.solde > 0)
        {
            return String.format("Vous avez %.2f euros dans votre tirelire",this.solde);
        }

        return String.format("Vous etes sans le sou !");
        }


    public void secouer()
    {
        if (this.solde > 0)
        {
            System.out.println("\n***********\nBling bling\n**********\n");
        }

    }

    public void remplir(double montant)
    {
        if (montant > 0)
        {
            this.solde = solde + montant;
            System.out.printf("Vous venez d'ajouter %.2f euros dans votre tirelire, " +
                    "votre nouveau solde est de %.2f euros",montant,this.solde);
        }
        else {
            System.out.println("Le montant rempli doit être supérieur à 0 euros !");
        }
    }

    public void vider ()
    {
        this.solde = 0;
        System.out.println("\nVous venez de vider votre tirelire, votre compte est de 0 euros");
    }

}



