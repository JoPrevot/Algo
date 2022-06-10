package Cours;

public class DoWhile {
    public static void main(String[] args) {

        int age=23;

        //On n'entre jamais dans la boucle parce que la condition de <while> n'est pas respectée

        while (age<18)
        {
            System.out.println("Inferieur -- while(condition){...}");
        }

        //Avec <do>, la boucle va toujours s'executer au moins une fois meme si la condition n'est pas évaluée à VRAI

        do{
            System.out.println("Inferieur -- do{...}while(condition)");
        }while (age<18);
    }
}
