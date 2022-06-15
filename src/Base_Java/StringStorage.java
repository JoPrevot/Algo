package Base_Java;

import java.util.Scanner;

public class StringStorage {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String nom="Jordan";
        String nom2="Jordan";

        // nom2 est renvoyé à la même ref que nom par java

        if(nom==nom2){
            System.out.println("nom pointe vers le même string que nom2");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom2");
        }

        System.out.println();
        System.out.print("Entrez un nom : ");
        String nom3=input.nextLine();

//        Ce test va être évalué à false :
//        Les strings fournis à partir du clavier ne sont pas stockés dans le pool des littéraux

        System.out.println("Test avant  d'ajouter nom3 dans le pool des " +
                "littéraux\n============================");
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }
        System.out.println("Tester les valeurs stockées par 2 strings");

        // On peut cependant y parvenir en transformant ce qui est rentré dans le pool des littéraux

        System.out.println();
        System.out.println("Test après avoir ajouté nom3 dans le pool des " +
                "littéraux\n=============================");
        nom3=nom3.intern();
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }

        // Test des valeurs de 2 strings avec la méthode equals.

        if(nom.equals(nom3)){
            System.out.println("nom contient le même string que nom3");
        }else{
            System.out.println("nom ne contient pas le même string que nom3");
        }
    }
}
