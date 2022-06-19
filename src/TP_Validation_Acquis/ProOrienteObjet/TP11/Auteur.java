package TP_Validation_Acquis.ProOrienteObjet.TP11;

public class Auteur {

    private String name;
    private boolean primed;

    public Auteur(String name, boolean price)
    {
        this.name = name;
        this.primed = price;
    }

    public Auteur(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public boolean isPrice()
    {
        return primed;
    }
}
