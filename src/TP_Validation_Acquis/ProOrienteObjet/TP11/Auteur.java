package TP_Validation_Acquis.ProOrienteObjet.TP11;

public class Auteur {

    private String name;
    private boolean primed;

    public Auteur(String name, boolean primed)
    {
        this.name = name;
        this.primed = primed;
    }

    public Auteur(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean isPrimed()
    {
        return primed;
    }
}
