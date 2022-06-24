package TP_Validation_Acquis.ProOrienteObjet.TP11;

public class Exemplaire {

    Oeuvre referenceOeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.referenceOeuvre = oeuvre;
        System.out.println("Nouvel exemplaire de ->"+oeuvre);
    }

    public Exemplaire(Exemplaire exemplaire) {
        this.referenceOeuvre = exemplaire.referenceOeuvre;
        System.out.println("Copie d'un exemplaire de :" +exemplaire);
    }

    public Oeuvre getOeuvre() {
        return referenceOeuvre;
    }

    @Override
    public String toString() {
        return " "+referenceOeuvre;
    }
}
