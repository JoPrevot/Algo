package inheritance;

// Une classe abstraite est une classe qui ne peut avoir d'instance / objet

public abstract class Personnage {

    private String nom;
    private int dureeDevie;

    public Personnage(String nom, int dureeDevie) {
        this.nom = nom;
        this.dureeDevie = dureeDevie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDevie() {
        return dureeDevie;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", dureeDevie=" + dureeDevie +
                '}';
    }

    public void setDureeDevie(int dureeDevie) {
        this.dureeDevie = dureeDevie;
    }

    public abstract void rencontrer();

}
