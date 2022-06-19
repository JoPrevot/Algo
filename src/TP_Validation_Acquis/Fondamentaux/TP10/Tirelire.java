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

    public void afficher()
    {
        if (this.solde > 0)
        {
            System.out.printf("Vous avez %.2f euros dans votre tirelire",this.solde);
        }
        else
        {
            System.out.println("Vous etes sans le sou !");
        }
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

    public double vider2 ()
    {
        this.solde = 0;
    return solde;
    }

    public void puiser (double montant)
    {
        if(montant >= this.solde)
        {
            System.out.printf("Vous venez de prelever la totalite de votre tirelire : %.2f euros.",this.solde);
            this.solde = 0;
        }
        else if (montant > 0 && montant < this.solde)
        {
            this.solde = solde - montant;
            System.out.printf("Vous venez de prelever %.2f euros sur votre tirelire, " +
                    "il vous reste %.2f euros.",montant,this.solde);
        }
    }

    public Object calculerSolde (double budget)
    {
        if (budget <= 0)
        {
            return this.solde;
        }
        else if (budget > this.solde)
        {
            return "Le budget insere est superieur a votre solde";
        }
        this.solde = solde - budget;
        return ("Il vous reste " + this.solde + " euros apres votre depense");
    }

}



