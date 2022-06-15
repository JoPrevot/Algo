package POO.Exo_POO.Exo_2;

public class Patient {

    private String firstName;
    private String lastName;
    private double height;
    private double weight;

    public Patient ()
    {
        firstName = "";
        lastName = "";
        height = 0.0;
        weight = 0.0;
    }

    // Getter

    public String getFirstName ()
    {
        return firstName;
    }
    public String getLastName ()
    {
        return lastName;
    }

    public double getHeight ()
    {
        return height;
    }
    public double getWeight ()
    {
        return weight;
    }

    // Setter

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    public void setHeight(Double height)
    {
        this.height = height;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    double calculIMC ()
    {
        return weight / Math.pow(height,2);
    }
}
