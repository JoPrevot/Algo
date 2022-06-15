package POO.Exo_POO.Exo_1;

public class Personne {

//    String firstName;
//    String lastName;
//    String country;
//    Boolean married;
//    Byte numberChildren;
//
//    String nomComplet ()
//    {
//        return firstName + " " + lastName;
//    }

    private String firstName;
    private String lastName;
    private String country;
    private Boolean married;
    private Byte numberChildren;

    public Personne (String firstName,String lastName, String country, Boolean married,Byte numberChildren)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.married = married;
        this.numberChildren = numberChildren;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName ()
    {
        return lastName;
    }
    public String getCountry ()
    {
        return country;
    }
    public Boolean getMarried ()
    {
        return married;
    }
    public Byte getNumberChildren ()
    {
        return numberChildren;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setMarried(Boolean married)
    {
        this.married = married;
    }

    public void setNumberChildren(Byte numberChildren)
    {
        this.numberChildren = numberChildren;
    }
    String nomComplet ()
    {
        return firstName + " " + lastName;
    }
}
