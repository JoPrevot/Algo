package POO.Exo_POO.Exo_3;

public abstract class Vehicule {

    private int matricule;
    private int year;
    private double price;
    private static int nextMatricule = 0;

    public Vehicule(int year, double price) {
        Vehicule.nextMatricule++;
        this.matricule = nextMatricule;
        this.year = year;
        this.price = price;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public abstract void start ();
    public abstract void accelerate ();

}
