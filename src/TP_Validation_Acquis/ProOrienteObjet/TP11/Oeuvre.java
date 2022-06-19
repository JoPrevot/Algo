package TP_Validation_Acquis.ProOrienteObjet.TP11;

public class Oeuvre extends Auteur {

    private String titre;
    private String langue;

    public Oeuvre(String titre, String name, String langue) {
        super(name);
        this.titre = titre;
        this.langue = langue;
    }

    public Oeuvre(String titre, String name) {
        super(name);
        this.titre = titre;
        this.langue = "francais";
    }

    public String getTitre() {
        return titre;
    }

    public String getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return " '" + titre +"' de " + getName() +", en " + langue;
    }
}

