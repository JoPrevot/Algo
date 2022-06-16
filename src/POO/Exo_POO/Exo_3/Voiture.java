package POO.Exo_POO.Exo_3;

public class Voiture extends Vehicule{

    public Voiture(int year, double price){
        super(year,price);
    }

    @Override
    public void start() {
        System.out.println("Veuillez demarrer la voiture.");
    }

    @Override
    public void accelerate() {
        System.out.println("Appuyez pour accelerer avec la voiture.");
    }
}
