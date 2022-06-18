package TP_Validation_Acquis.Fondamentaux.TP10;

public class Tirelire implements UseTirelire {

    private double montant;

    public Tirelire(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}

