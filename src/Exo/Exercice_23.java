package Exo;

import java.util.*;

public class Exercice_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        var day = "";
        var number = 0;

        for (int i = 0; i <= 6 ; i++)
        {
            System.out.println("Veuillez entrer un jour de la semaine : ");

            day = input.nextLine();

            days.add(day);
        }

        for (int i = 0; i <= 6 ; i++)
        {
            System.out.printf
                    ("Veuillez entrer le numero correspondant à %s (entre 1 et 7) : ",days.get(i));

            number = input.nextInt();

            numbers.add(number);
        }

        System.out.println();
        System.out.println(days);
        System.out.println(numbers);

        LinkedHashMap<String, Integer> Week = new LinkedHashMap<>();

        for (int i = 0; i < days.size(); i++)
        {
          number = numbers.get(i);

          day = days.get(i);

          Week.put(day,number);

        }
        System.out.println();
        System.out.println(Week);
    }
}
