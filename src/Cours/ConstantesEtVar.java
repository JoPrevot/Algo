package Cours;

public class ConstantesEtVar {
    public static void main(String[] args) {

        // Si on veut déclarer une variable sans qu'elle puisse être changée ensuite :
        // <final> au début

        final double g = 9.81 ;

        // Déclaration par inférence : on laisse java deviner le type de variable avec <var>

        var pays = "France";

        int age;    // Declaration sans initialisation
        age = 17;

        double poids = 85;  // Déclaration avec initialisation

        // Dans le cas de <var> il faut faire l'initialisation sinon ça ne fonctionne pas

    }
}
