package TP_Validation_Acquis.ProOrienteObjet.TP11;

import java.util.ArrayList;

public class Bibliotheque {

    String nameBibl;

    ArrayList<Exemplaire> listeExemplaire = new ArrayList<>();

    public Bibliotheque(String nameBibl)
    {
        this.nameBibl = nameBibl;
        System.out.printf("La bibliothèque %s est ouverte !",nameBibl);
    }

    public String getNameBibl() {
        return nameBibl;
    }

    public int getNbExemplaires() {
        return listeExemplaire.size();
    }

    public void stocker (Oeuvre oeuvre,int nombreExemplaire)
    {
        Exemplaire nouvelExemplaire = new Exemplaire(oeuvre);

        for (int i = 0; i < nombreExemplaire; i++)
        {
            this.listeExemplaire.add(nouvelExemplaire);
        }
    }

    public void stocker (Exemplaire exemplaire,int nombreExemplaire)
    {
        Exemplaire nouvelExemplaire = new Exemplaire(exemplaire);

        for (int i = 0; i < nombreExemplaire; i++)
        {
            this.listeExemplaire.add(nouvelExemplaire);
        }
    }

    public ArrayList<Exemplaire> listerExemplaires (String langue)
    {
        ArrayList<Exemplaire> listeObtenue = new ArrayList<>();

        if (langue == "")
        {
            return listeExemplaire;
        }
        else
        {
            System.out.printf("Les exemplaire en %s de la bibliothèque sont : \n",langue);

            for (Exemplaire exemplaireActuel:this.listeExemplaire)
            {
                if(exemplaireActuel.getOeuvre().getLangue() == langue)
                {
                    listeObtenue.add(exemplaireActuel);
                }
            }
            return listeObtenue;
        }
    }

    public ArrayList<Exemplaire> listerExemplaires ()
    {
        return listerExemplaires("");
    }

    public void offre()
    {
        System.out.printf("La bibliothèque %s offre :\n",this.getNameBibl());
        for (Exemplaire exemplaireActuel:this.listeExemplaire)
        {
            System.out.println(exemplaireActuel.toString());
        }
    }

}
