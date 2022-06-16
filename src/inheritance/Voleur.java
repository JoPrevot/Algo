package inheritance;

public class Voleur extends Personnage{


    private String arme;

    public Voleur(String nom, int dureeDeVie, String arme) {
        super (nom,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public void voler()
    {
        System.out.println("Cache bien ton telephone");
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un voleur, fais bien attention");;
    }
}
