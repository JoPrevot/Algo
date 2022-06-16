package POO.Exo_POO.Exo_3;

public class Camion extends Vehicule{

    public Camion(int year, double price){
        super(year,price);
    }

    @Override
    public void start() {
        System.out.println("Veuillez demarrer le camion.");
    }

    @Override
    public void accelerate() {
        System.out.println("Appuyez pour accelerer avec le camion.");
    }
}
